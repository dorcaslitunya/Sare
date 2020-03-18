object Versions {
    val event_bus_version= "3.1.1"
    val kotlin = "1.3.70"
    val koltin_core_version = "1.0.2"
    const val androidx_activity_version = "1.1.0-rc02"
    const val androidx_fragment_version = "1.2.0-rc02"
    const val nav_version= "2.3.0-alpha01"
    val gradle_plugin = "3.6.1"
    val google_services = "4.3.2"
    val fire_auth = "19.1.0"
    val lifecycle_version = "2.1.0"
    val viewmodelscope_version= "2.2.0-alpha04"
    val room_version = "2.1.0"
    val ccp_version = "2.4.1"
    val material_version = "1.2.0-alpha05"
    val material_dialogue_versions= "3.1.1"
    val cardview_version= "1.0.0"
    val dashed_text_version= "0.1.2"
    val constraint_version = "2.0.0-beta4"
    val junit_version = "4.12"
    val junit_ext = "1.1.1"
    val espresso_core = "3.2.0"
    val appcompat_version = "1.1.0"
    val androidx_legacy_versions= "1.0.0"
    val test_runner_versions= "1.3.0-alpha02"
    val mutlidex_version = "2.0.1"
    val version_code = 1
    val min_sdk = 19
    val target_sdk = 29
    val version_name = "1.0"
    val compile_sdk = 29
    val build_tools_version = "29.0.2"
    val fabric = "1.31.1"
    val retrofit_version = "2.6.1"
    val gson_version = "2.8.5"
    val firestore_version = "21.1.1"
    val firebase_ui_version = "6.0.2"
    val firebase_core_version = "17.2.0"
    val firebase_db_version = "19.1.0"
    val firebase_analytics_version= "17.2.0"
    val firebase_crashlytics_version= "2.10.1"
    val location_services_version= "17.0.0"
    val circular_imageview_version= "3.2.0"
    val daraja_version= "1.0.2"
    val dagger_version= "2.25.2"
    val timber_version= "4.7.1"
    val lottie_version= "3.2.0"
    val android_mp_chart = "v3.1.0"
}

object Deps {
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.gradle_plugin}"
    val google_services_plugin = "com.google.gms:google-services:${Versions.google_services}"
    //androidx
    val kotlin_core_extensions = "androidx.core:core-ktx:${Versions.koltin_core_version}"
    const val androidx_activity =
        "androidx.activity:activity-ktx:${Versions.androidx_activity_version}"
    const val androidx_fragment =
        "androidx.fragment:fragment-ktx:${Versions.androidx_fragment_version}"

    val firebase_auth = "com.google.firebase:firebase-auth:${Versions.fire_auth}"
    val viewmodelscope= "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewmodelscope_version}"
    val livedata_test_helpers= "androidx.arch.core:core-testing:${Versions.lifecycle_version}"
    val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle_version}"
    val room= "androidx.room:room-runtime:${Versions.room_version}"
    val room_compiler= "androidx.room:room-compiler:${Versions.room_version}"
    val room_ktx= "androidx.room:room-ktx:${Versions.room_version}"
    val ccp = "com.github.joielechong:countrycodepicker:${Versions.ccp_version}"
    val material = "com.google.android.material:material:${Versions.material_version}"
    val material_dialogs= "com.afollestad.material-dialogs:core:${Versions.material_dialogue_versions}"
    val cardview= "androidx.cardview:cardview:${Versions.cardview_version}"
    val dashed_text= "com.github.swapnil1104:OtpEditText:${Versions.dashed_text_version}"
    val constraint_layout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraint_version}"
    val junit = "junit:junit:${Versions.junit_version}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
    val mutlidex= "androidx.multidex:multidex:${Versions.mutlidex_version}"
    val junit_ext = "androidx.test.ext:junit:${Versions.junit_ext}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat_version}"
    val androidx_legacy_support= "androidx.legacy:legacy-support-v4:${Versions.androidx_legacy_versions}"
    val androidx_test_runner= "androidx.test:runner:${Versions.test_runner_versions}"
    val fabric_plugin = "io.fabric.tools:gradle:${Versions.fabric}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    val retrofit_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}"
    val gson = "com.google.code.gson:gson:${Versions.gson_version}"
    val firestore = "com.google.firebase:firebase-firestore:${Versions.firestore_version}"
    val firebase_ui = "com.firebaseui:firebase-ui-firestore:${Versions.firebase_ui_version}"
    val firebase_db="com.google.firebase:firebase-database:${Versions.firebase_db_version}"
    val firebase_core= "com.google.firebase:firebase-core:${Versions.firebase_core_version}"
    val firebase_crashlytics= "com.crashlytics.sdk.android:crashlytics:${Versions.firebase_crashlytics_version}"
    val firebase_analytics= "com.google.firebase:firebase-analytics:${Versions.firebase_analytics_version}"
    val location_services= "com.google.android.gms:play-services-location:${Versions.location_services_version}"
    val maps_services= "com.google.android.gms:play-services-maps:${Versions.location_services_version}"
    //even bus
    val event_bus= "org.greenrobot:eventbus:${Versions.event_bus_version}"
    //circular imageview
    val circular_image= "com.mikhaellopez:circularimageview:${Versions.circular_imageview_version}"
    //daraja lib
    val daraja= "com.androidstudy:daraja:${Versions.daraja_version}"
    //dagger 2
    val dagger= "com.google.dagger:dagger:${Versions.dagger_version}"
    val dagger_annotation= "com.google.dagger:dagger-compiler:${Versions.dagger_version}"
    val dagger_android= "com.google.dagger:dagger-android:${Versions.dagger_version}"
    val dagger_android_support= "com.google.dagger:dagger-android-support:${Versions.dagger_version}"
    val dagger_android_processor= "com.google.dagger:dagger-android-processor:${Versions.dagger_version}"
    //Timber
    val timber= "com.jakewharton.timber:timber:${Versions.timber_version}"
    //Lottie
    val lottie= "com.airbnb.android:lottie:${Versions.lottie_version}"
    //    navigation component
    const val nav_UI= "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"
    const val nav_fragment= "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
    const val safe_args_gradle_plugin= "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.nav_version}"
//    android mp charts
    val mp_chart = "com.github.PhilJay:MPAndroidChart:${Versions.android_mp_chart}"

}