pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.buildFileName = "build.gradle.kts"
rootProject.name = "KMMPoc"
include(":androidApp")
include(":shared")