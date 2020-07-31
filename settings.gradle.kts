pluginManagement {
    repositories {
        jcenter()
        google()
        gradlePluginPortal()
    }

    plugins {
        id("io.gitlab.arturbosch.detekt") version "1.10.0"
        id("org.jlleitschuh.gradle.ktlint") version "9.3.0"
        id("com.android.application") version "4.0.1"
        id("org.jetbrains.kotlin.android") version "1.3.72"
        id("org.jetbrains.kotlin.android.extensions") version "1.3.72"
        id("com.android.library") version "4.0.1"
        id("com.google.firebase.crashlytics") version "2.1.0"
    }

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "com.android.application", "com.android.library" -> useModule("com.android.tools.build:gradle:3.6.0")
                "com.google.firebase.crashlytics" -> useModule("com.google.firebase:firebase-crashlytics-gradle:2.1.0")
            }
        }
    }
}

include(":core")
include(":app")
rootProject.name = "Trivago"