plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "gradle-subprojects-example"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            library("logback","ch.qos.logback:logback-classic:1.5.3")
            library("kotlin-logging","io.github.oshai:kotlin-logging-jvm:6.0.3")

            library("commonslang3","org.apache.commons:commons-lang3:3.14.0")

            bundle("logging", listOf("logback","kotlin-logging"))
        }
    }
}
include("subproject-a")
include("subproject-b")
