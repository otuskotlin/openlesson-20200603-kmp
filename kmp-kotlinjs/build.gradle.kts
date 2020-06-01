plugins {
    id("org.jetbrains.kotlin.js") version "1.3.72"
}

group = parent!!.group
version = parent!!.version

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":kmp-common"))
}

kotlin.target.browser { }
