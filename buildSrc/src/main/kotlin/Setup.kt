import com.android.build.gradle.AppExtension
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.*
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

private fun BaseExtension.setupAndroid() {
    compileSdkVersion(34)
    defaultConfig {
        minSdk = 21
        targetSdk = 34

        versionCode = 1
        versionName = "1.0"
    }
}

fun Project.setupModuleForComposeMultiplatform() {
    plugins.withType<org.jetbrains.kotlin.gradle.plugin.KotlinBasePluginWrapper> {
        extensions.configure<KotlinMultiplatformExtension> {
            val compose =
                (this as org.gradle.api.plugins.ExtensionAware).extensions.getByName("compose") as org.jetbrains.compose.ComposePlugin.Dependencies

            androidTarget {
                if (project.plugins.hasPlugin("com.vanniktech.maven.publish")) {
                    publishLibraryVariants("release")
                }
            }
            jvm("desktop")


            js(IR) {
                browser()
            }
            macosX64()
            macosArm64()

            iosX64()
            iosArm64()
            iosSimulatorArm64()


            sourceSets {
                val commonMain by getting {
                    dependencies {
                        compileOnly(compose.runtime)
                        compileOnly(compose.foundation)
                        compileOnly(compose.ui)
                    }
                }
            }
        }

        (extensions.findByType<LibraryExtension>()
            ?: extensions.findByType<AppExtension>()
            ?: error("Could not found Android application or library plugin applied on module $name")).apply {
            setupAndroid()
            sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
        }

        tasks.withType<KotlinCompile> {
            kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
        }
    }
}

