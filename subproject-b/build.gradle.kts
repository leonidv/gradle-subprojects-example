plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

group = "org.example"
version = "1.0-SNAPSHOT"

val jdkVersion by rootProject.extra(17)

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
}

kotlin {
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(jdkVersion)
}