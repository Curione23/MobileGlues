plugins {
    id("com.android.library") version "8.11.1"
}

android {
    namespace 'top.mobilegl.mobileglues'
    compileSdk 36

    defaultConfig {
        minSdk 21
        // No flavors here!
    }

    buildTypes {
        release {
            minifyEnabled false
        }
        debug {
            // Standard debug
        }
        // This ensures the app's 'proguard' build type can find this library
        proguard {
            initWith debug
        }
    }

    publishing {
        singleVariant("release")
        singleVariant("debug")
    }

    externalNativeBuild {
        // Only keep this if you actually have the C++ files in this folder
        ndkBuild {
            path file("src/main/jni/Android.mk")
        }
    }
}
