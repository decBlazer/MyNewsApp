plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt.android)
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.kotlin.serialization) apply false
}

android {
    namespace = "com.varughese.mynewsapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.varughese.mynewsapp"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(platform(libs.kotlin.bom))
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.material3)
    implementation(libs.paging.compose)
    implementation(libs.paging.runtime.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.compose.ui.test.junit4)
    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.ui.test.manifest)

    //Splash Api
    implementation(libs.splashscreen)

    //Compose Navigation
    implementation(libs.navigation.compose)

    //Dagger Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    implementation(libs.hilt.navigation.compose)

    //Coil
    implementation(libs.coil.compose)

    //Datastore
    implementation(libs.datastore.preferences)

    //Compose Foundation
    implementation(libs.foundation)

    //Accompanist
    implementation(libs.accompanist.systemuicontroller)

    //Paging 3
    implementation(libs.paging.runtime.ktx)
    implementation(libs.paging.compose)

    //Room
    implementation(libs.room.runtime)
    kapt(libs.room.compiler)
    kapt(libs.kotlinx.metadata.jvm)
    implementation(libs.room.ktx)

    //KTOR
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.cio)

    //Kotlinx Serialization
    implementation(libs.kotlinx.serialization.json)

    //KTOR Content negotiation
    implementation(libs.ktor.client.content.negotiation)

    // JSON Serialization
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.serialization)

    // Timber
    implementation(libs.timber)
}