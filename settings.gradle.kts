rootProject.name = "kmp-share"
include("kmp-common")
include("kmp-kotlinjs")
include("kmp-angular")
include("kmp-android")

pluginManagement {
    val kotlin_version: String by settings

    plugins {
        kotlin("multiplatform") version kotlin_version apply false
        kotlin("js") version kotlin_version apply false
        kotlin("jvm") version kotlin_version apply false
        id("org.jetbrains.kotlin.android") version kotlin_version apply false
        id("org.jetbrains.kotlin.android.extensions") version kotlin_version apply false
    }

    repositories {
        google()
        jcenter()
        mavenCentral()
        gradlePluginPortal()
    }

    resolutionStrategy {
        eachPlugin {
            print("MODULE: $requested")
            when (requested.id.id) {
                "com.android.application"
                -> useModule("com.android.tools.build:gradle:3.6.3")
                "androidx.navigation.safeargs"
                -> useModule("androidx.navigation:navigation-safe-args-gradle-plugin:2.2.2")
            }
        }
    }
}


