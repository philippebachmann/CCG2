plugins { id("com.android.application") }

android {
    namespace = "ch.miez.ausweich"
    compileSdk = 35
    defaultConfig {
        applicationId = "ch.miez.ausweich"
        minSdk = 24
        targetSdk = 35
        versionCode = 2
        versionName = "2.0"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
