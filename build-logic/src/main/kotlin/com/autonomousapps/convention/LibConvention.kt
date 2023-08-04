package com.autonomousapps.convention

import com.autonomousapps.convention.publishing.Publishing
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension

/**
 * This plugin is applied to our JVM lib projects.
 * ```
 * plugins {
 *   id("com.autonomousapps.lib")
 * }
 * ```
 */
class LibConvention : Plugin<Project> {

  override fun apply(target: Project): Unit = target.run {
    pluginManager.apply(BaseConvention::class.java)
    pluginManager.apply("com.github.johnrengelman.shadow")

    extensions.configure(JavaPluginExtension::class.java) { j ->
      j.withJavadocJar()
      j.withSourcesJar()
    }

    Publishing.setup(this)
  }
}
