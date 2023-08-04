package com.autonomousapps.convention.publishing

import nexus.Credentials
import nexus.NexusPublishTask
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPom
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.tasks.PublishToMavenRepository
import org.gradle.plugins.signing.Sign
import org.gradle.plugins.signing.SigningExtension

internal object Publishing {

  fun setup(project: Project): Unit = project.run {
    val isSnapshot = version.toString().endsWith("SNAPSHOT")
    val publishing = extensions.getByType(PublishingExtension::class.java)
    val signing = extensions.getByType(SigningExtension::class.java)
    val credentials = Credentials(this)

    publishing.repositories { r ->
      if (credentials.isValid()) {
        r.maven { a ->
          a.name = "sonatype"

          val releasesRepoUrl = "https://oss.sonatype.org/service/local/staging/deploy/maven2"
          val snapshotsRepoUrl = "https://oss.sonatype.org/content/repositories/snapshots"
          a.url = project.uri(if (isSnapshot) snapshotsRepoUrl else releasesRepoUrl)

          a.credentials {
            it.username = credentials.username()
            it.password = credentials.password()
          }
        }
      }
    }

    afterEvaluate {
      publishing.publications.all { pub ->
        signing.sign(pub)
        if (pub is MavenPublication) {
          setupPom(pub.pom)
        }
      }
    }

    val promoteTask = tasks.register("promote", NexusPublishTask::class.java) {
      with(it) {
        // only promote non-snapshots
        onlyIf { !isSnapshot }
        inputs.property("version", version)
        configureWith(credentials)
      }
    }

    tasks.withType(Sign::class.java).configureEach {
      with(it) {
        notCompatibleWithConfigurationCache("https://github.com/gradle/gradle/issues/13470")
        // only sign non-snapshots
        onlyIf { !isSnapshot }
        inputs.property("version", version)
      }
    }

    tasks.withType(PublishToMavenRepository::class.java).configureEach {
      with(it) {
        notCompatibleWithConfigurationCache("https://github.com/gradle/gradle/issues/13470")

        // Releases require the checks to pass
        if (!isSnapshot) {
          dependsOn("check")
        }
      }
    }

    tasks.register("publishToMavenCentral") {
      with(it) {
        notCompatibleWithConfigurationCache("Publishing is not compatible")
        finalizedBy(promoteTask)
        dependsOn(tasks.withType(PublishToMavenRepository::class.java))

        group = "publishing"
        description = "Publishes final artifacts to Maven Central"

        doLast {
          if (isSnapshot) {
            logger.quiet("Browse files at https://oss.sonatype.org/content/repositories/snapshots/com/autonomousapps/")
          } else {
            logger.quiet("If 'promote' task failed: after publishing to Sonatype, visit https://oss.sonatype.org to close and release from staging")
          }
        }
      }
    }
  }

  private fun setupPom(pom: MavenPom): Unit = pom.run {
    name.set("Gradle Script Grammar")
    description.set("Parses Gradle build scripts (Groovy or Kotlin DSL)")
    url.set("https://github.com/autonomousapps/gradle-script-grammar")
    inceptionYear.set("2023")

    licenses {
      it.license { l ->
        l.name.set("The Apache License, Version 2.0")
        l.url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
      }
    }
    developers {
      it.developer { d ->
        d.id.set("autonomousapps")
        d.name.set("Tony Robalik")
      }
    }
    scm {
      it.connection.set("scm:git:git://github.com/autonomousapps/gradle-script-grammar.git")
      it.developerConnection.set("scm:git:ssh://github.com/autonomousapps/gradle-script-grammar.git")
      it.url.set("https://github.com/autonomousapps/gradle-script-grammar")
    }
  }
}
