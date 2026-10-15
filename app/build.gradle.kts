plugins { id("com.android.application") }

android {
    namespace = "ch.miez.ausweich"
    compileSdk = 35
    defaultConfig {
        applicationId = "ch.miez.ausweich"
        minSdk = 24
        targetSdk = 35
        versionCode = 3
        versionName = "2.1"
    }
    // fester Schlüssel: jede neue Version lässt sich direkt über die alte installieren
    signingConfigs {
        create("nl") {
            storeFile = file("ninelives.jks")
            storePassword = "ninelives"
            keyAlias = "ninelives"
            keyPassword = "ninelives"
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("nl")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
