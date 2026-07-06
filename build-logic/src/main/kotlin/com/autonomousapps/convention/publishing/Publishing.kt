package com.autonomousapps.convention.publishing

import com.vanniktech.maven.publish.MavenPublishBaseExtension
import org.gradle.api.Project
import org.gradle.api.publish.maven.MavenPom

internal object Publishing {

  fun setup(project: Project): Unit = project.run {
    val version = version.toString()

    val mavenPublish = extensions.getByType(MavenPublishBaseExtension::class.java)

    mavenPublish.publishToMavenCentral(automaticRelease = true, validateDeployment = false)
    mavenPublish.signAllPublications()
    mavenPublish.coordinates(version = version)

    mavenPublish.pom { setupPom(it) }
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
