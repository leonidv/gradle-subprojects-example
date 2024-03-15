import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {

}

group = "org.example"
version = "1.0-SNAPSHOT"

val jdkVersion by rootProject.extra(17)

repositories {
    mavenCentral()
}

dependencies {
    implementation(rootProject.libs.bundles.logging)
    implementation(rootProject.libs.commonslang3)
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(jdkVersion)

    compilerOptions {
        freeCompilerArgs.add("-Xjsr305=strict")
        jvmTarget.set(JvmTarget.JVM_21)
    }
}