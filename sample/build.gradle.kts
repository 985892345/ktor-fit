@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    kotlin("multiplatform")
    alias(libs.plugins.ksp)
}

kotlin {
    jvm()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosX64()
    macosArm64()
    linuxX64()
    linuxArm64()
    mingwX64()
    tvosX64()
    tvosArm64()
    tvosSimulatorArm64()
    watchosX64()
    watchosArm64()
    // watchosDeviceArm64()
    // watchosSimulatorArm64()
    js(IR) {
        browser()
        nodejs()
    }
    // @Suppress("OPT_IN_USAGE")
    // wasm {
    //     browser()
    //     nodejs()
    // }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(projects.ktorFitAnnotation)
                implementation(libs.bundles.ktor)
            }
        }
        val jvmMain by getting {
            kotlin.srcDir("build/generated/ksp/jvm/jvmMain/kotlin")
        }
    }
}

dependencies {
    // add("kspCommonMainMetadata", projects.ktorFitKsp)
    add("kspJvm", projects.ktorFitKsp)
    add("kspIosX64", projects.ktorFitKsp)
    add("kspIosArm64", projects.ktorFitKsp)
    add("kspIosSimulatorArm64", projects.ktorFitKsp)
    add("kspMacosX64", projects.ktorFitKsp)
    add("kspMacosArm64", projects.ktorFitKsp)
    add("kspLinuxX64", projects.ktorFitKsp)
    add("kspLinuxArm64", projects.ktorFitKsp)
    add("kspMingwX64", projects.ktorFitKsp)
    add("kspTvosX64", projects.ktorFitKsp)
    add("kspTvosArm64", projects.ktorFitKsp)
    add("kspTvosSimulatorArm64", projects.ktorFitKsp)
    add("kspWatchosX64", projects.ktorFitKsp)
    add("kspWatchosArm64", projects.ktorFitKsp)
    add("kspJs",projects.ktorFitKsp)
}
