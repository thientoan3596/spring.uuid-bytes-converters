# Spring UUID/Bytes Converter

This is a sample project of using Github Action and JitPack to create a custom dependency,

## Overview

This dependency includes two utility classes:

- **`UUIDToByteConverter`**: Provides functionality to convert a `java.util.UUID` object into a `byte[]`.
- **`BytesToUUIDConverter`**: Provides functionality to convert a `byte[]` back into a `java.util.UUID` object.

These converters can be easily integrated into any Spring project that requires efficient handling and storage of UUIDs as byte arrays.

## Prerequisites

- **Java:** Version 17 or higher is required to use this library.
- **Spring Framework:** Version 6.2.5 or higher is required due to the dependency on `spring-core`.
- **Spring Data Commons:** Version 3.4.4 or higher is required if you intend to use functionalities that might interact with Spring Data Commons types or abstractions within your library.
- **Spring Framework:** This library is intended for use within Spring projects.

## Getting Started

### Adding the Dependency to Your Spring Project

To add this dependency to your Spring project, you can use Gradle with JitPack.

`build.gradle.kts`

```kotlin
repositories {
    maven {
        url = uri("https://jitpack.io")
    }
}
dependencies {
    implementation("com.github.thientoan3596:spring-rest-error:<TAG>")
}
```
