rootProject.name = "StreetComplete"

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        // Expo brownfield demo: fused Expo/React Native AAR, see https://github.com/briones-agent/packages
        maven("https://raw.githubusercontent.com/briones-agent/packages/main/maven") {
            content { includeGroup("dev.expo.brownfield") }
        }
    }
}

include(":app")
