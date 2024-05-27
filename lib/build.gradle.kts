plugins{
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "io.github.wulkanowy.signer.hebe.android.app"

    defaultConfig {
        minSdk = 18
        lint.targetSdk = 31
        testOptions.targetSdk = 31
        compileSdk = 31

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("com.brsanthu:migbase64:2.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}

tasks.register<Jar>("androidSourcesJar"){
    archiveClassifier.set("sources")
    from("android.sourceSets.main.java.srcDirs")
}