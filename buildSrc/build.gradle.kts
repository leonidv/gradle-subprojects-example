plugins {
    `kotlin-dsl`
}
repositories {
 //   gradlePluginPortal()
    mavenCentral()
}

val kotlinVersion = "1.9.23"

dependencies {
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:$kotlinVersion")

    implementation("org.springframework.boot:org.springframework.boot.gradle.plugin:3.2.3")
    implementation("io.spring.dependency-management:io.spring.dependency-management.gradle.plugin:1.1.4");
    implementation("org.jetbrains.kotlin.plugin.spring:org.jetbrains.kotlin.plugin.spring.gradle.plugin:$kotlinVersion")
}