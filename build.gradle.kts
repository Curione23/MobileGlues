plugins {
    id 'com.android.library'
}

android {
    namespace = "top.mobilegl.mobileglues"
    compileSdk = 36

    defaultConfig {
        minSdk = 21
        consumerProguardFiles "consumer-rules.pro"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
        debug {
            debuggable true
        }
        all {
            matchingFallbacks = ['release', 'debug']
        }
    }
}
