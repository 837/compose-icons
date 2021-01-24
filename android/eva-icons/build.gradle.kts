plugins {
    id("com.android.library")
    id("kotlin-android")
}

group = "compose.icons.android"

dependencies {
    api("androidx.compose.runtime:runtime:${Versions.composeAndroidVersion}")
    api("androidx.compose.foundation:foundation:${Versions.composeAndroidVersion}")
    api("androidx.compose.ui:ui:${Versions.composeAndroidVersion}")
}

android {
    sourceSets["main"].java.srcDir("../../eva-icons/src/commonMain/kotlin")

    compileSdkVersion(29)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeAndroidVersion
        kotlinCompilerVersion = "1.4.21"
    }
}

val sourcesJar by tasks.creating(Jar::class) {
    archiveClassifier.set("sources")
    from(android.sourceSets["main"].java.srcDirs)
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("maven") {
                from(components["release"])
                artifact(sourcesJar)
            }
        }
    }
}