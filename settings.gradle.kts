pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Android-Study"
include(":app")
include(":ch01_layout")
include(":myapplication")
include(":ch02_event")
include(":ch03_resource")
include(":ch04_permission")
include(":ch05_dialog")
include(":ch06_notification")
include(":ch07_appbar")
include(":ch00_practice")
include(":ch08_activity")
include(":ch08_00_practice")
include(":ch08_activity:ex01")
include(":ch08_activity:ex02")
include(":ch08_activity:ex03")
