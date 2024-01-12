plugins {
    id("multiplatform-setup")
    id("android-setup-plugin")
//    id("com.vanniktech.maven.publish")
    id("org.jetbrains.compose")
    id("maven-publish")
}

android {
    namespace = "io.github.skeptick.libres.compose"
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(projects.libresCore)
                implementation(compose.ui)
            }
        }
    }
}