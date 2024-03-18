plugins {
    val kotlinVersion = "1.9.22";

    kotlin("jvm") version kotlinVersion apply false

    id("org.springframework.boot") version "3.2.3" apply false
    id("io.spring.dependency-management") version "1.1.4" apply false
    kotlin("plugin.spring") version kotlinVersion apply false
}

group = "org.example"
version = "1.0-SNAPSHOT"

val jdkVersion by extra("21")

repositories {
    mavenCentral()
}

//dependencies {
//    implementation(libs.logback)
//    testImplementation("org.jetbrains.kotlin:kotlin-test")
//}
//
//tasks.test {
//    useJUnitPlatform()
//}
//kotlin {
//    jvmToolchain(17)
//}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    val jdkVersion by rootProject.extra("jdkVersion")
}