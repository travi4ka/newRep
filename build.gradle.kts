plugins {
    id("io.qameta.allure") version "2.11.2"
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("com.codeborne:selenide:6.13.0")
    testImplementation("io.qameta.allure:allure-selenide:2.21.0")
}

allure {
    report {
        version.set("2.21.0")
    }
    adapter {
        aspectjWeaver.set(true)
        frameworks {
            junit5 {
                adapterVersion.set("2.21.0")
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}