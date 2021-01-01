/*
 * Copyright (C) 2020 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@file:Suppress("unused")

package org.lineageos.build

// AndroidX - https://developer.android.com/jetpack/androidx/versions
object AndroidX {
    const val gradlePlugin = "com.android.tools.build:gradle:4.1.1"

    // Core - KTX - https://developer.android.com/jetpack/androidx/releases/annotation
    const val annotationX = "androidx.annotation:annotation:1.1.0"

    // AppCompat - https://developer.android.com/jetpack/androidx/releases/appcompat
    const val appCompat = "androidx.appcompat:appcompat:1.1.0"

    // Constraint Layout - https://developer.android.com/jetpack/androidx/releases/constraintlayout
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"

    // Fragment - https://developer.android.com/jetpack/androidx/releases/fragment
    const val fragment = "androidx.fragment:fragment-ktx:1.2.5"

    // Core - KTX - https://developer.android.com/jetpack/androidx/releases/core
    const val ktx = "androidx.core:core-ktx:1.3.2"

    // RecyclerView - https://developer.android.com/jetpack/androidx/releases/recyclerview
    const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"

    // Lifecycle - https://developer.android.com/jetpack/androidx/releases/lifecycle
    object Lifecycle {
        private const val VERSION = "2.2.0"

        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$VERSION"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$VERSION"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$VERSION"
    }

    object Test {
        private const val VERSION = "1.2.0"

        const val core = "androidx.test:core:$VERSION"
        const val rules = "androidx.test:rules:$VERSION"

        const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"

        object Ext {
            private const val VERSION = "1.1.2-rc01"
            const val junit = "androidx.test.ext:junit-ktx:$VERSION"
        }
    }
}

object Google {

    object Material {
        private const val VERSION = "1.2.1"

        const val components = "com.google.android.material:material:$VERSION"
    }
}

// Kotlin - https://github.com/JetBrains/kotlin/releases
object Kotlin {
    private const val VERSION = "1.4.20"

    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VERSION"

    object StdLib {

        const val jvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$VERSION"
    }

    // Coroutines - https://github.com/Kotlin/kotlinx.coroutines/releases
    object Coroutines {
        private const val VERSION = "1.4.1"

        const val jvm = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$VERSION"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$VERSION"
    }
}
