plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.gonzalo.jc_pokedex"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.gonzalo.jc_pokedex"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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

    hilt {
        enableAggregatingTask = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.4"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")


    //implementation ("androidx.compose.material:material-icons-core:$compose_version")
    //implementation ("androidx.compose.material:material-icons-extended:$compose_version")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")
    //implementation("androidx.navigation:navigation-compose:2.7.6")  // Se comenta en función de la dependencia de Hilt para navegación
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")

    // Timber
    implementation("com.jakewharton.timber:timber:4.7.1")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")

    // Coroutine Lifecycle Scopes
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

    // Coil
    implementation("io.coil-kt:coil-compose:2.3.0") // 2.2.2
    implementation("com.google.accompanist:accompanist-coil:0.15.0") // 0.7.0

    //Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.48")
    implementation ("com.google.dagger:dagger-android-support:2.48")   ///
    kapt ("com.google.dagger:hilt-android-compiler:2.48")
    kapt ("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.4.2")
    kapt ("androidx.hilt:hilt-compiler:1.0.0")
    implementation ("androidx.hilt:hilt-navigation-compose:1.1.0") //Se agrega en función de la dependencia de Hilt para navegación

    // Palette
    implementation("androidx.palette:palette-ktx:1.0.0")
}

kapt {
    correctErrorTypes = true
}