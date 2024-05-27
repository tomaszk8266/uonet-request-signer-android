plugins{
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "io.github.wulkanowy.signer.hebe.android.app"

    defaultConfig {
        applicationId = "io.github.wulkanowy.signer.hebe.android.app"
        minSdk = 18
        targetSdk = 31
        compileSdk = 31
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(project(":lib"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.6.21")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("androidx.core:core-ktx:1.7.0")
}
