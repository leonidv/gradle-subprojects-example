plugins {
    id("example.springboot");
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    implementation(project(":subproject-a"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.test {
    useJUnitPlatform()
}