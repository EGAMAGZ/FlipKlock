plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose") version "1.3.0"
}

android {
    compileSdk = 33
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 28
        targetSdk = 33
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

}

kotlin {
    android()
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":shared"))
                api(compose.foundation)
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                api(compose.materialIconsExtended)
                api(compose.ui)
                api(compose.uiTooling)
                api(compose.preview)
            }
        }
        val commonTest by getting
        val androidMain by getting {
            dependencies {
                implementation("androidx.appcompat:appcompat:1.6.1")
            }
        }
        val desktopMain by getting
    }

}
