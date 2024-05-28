plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
id("org.jetbrains.kotlin.plugin.compose")
    id("com.vanniktech.maven.publish")
}

setupModuleForComposeMultiplatform()

android {
    namespace = "compose.icons.tablericons"
}
