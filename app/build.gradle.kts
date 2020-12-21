plugins {
    application
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("junit:junit:4.13")
}

application {
    mainClass.set("gradle.practice.App")
}
