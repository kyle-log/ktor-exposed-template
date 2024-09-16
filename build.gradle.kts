val kotlinVersion: String by project
val ktorVersion: String by project
val logbackVersion: String by project

plugins {
    kotlin("jvm") version "2.0.20" apply false
    id("io.ktor.plugin") version "3.0.0-rc-1" apply false
}

group = "cocomo"
version = "0.0.1"

allprojects {
    repositories {
        mavenCentral()
    }
}
