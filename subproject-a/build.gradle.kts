plugins {
    id("example.library")
}

dependencies {
    implementation(rootProject.libs.bundles.logging)
    implementation(rootProject.libs.commonslang3)
}

tasks.test {
    useJUnitPlatform()
}
