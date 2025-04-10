# Spring UUID/Bytes Converter

This is a sample project of using Github Action and JitPack to create a custom dependency,

## Overview

This dependency includes two utility classes:

- **`UUIDToByteConverter`**: Provides functionality to convert a `java.util.UUID` object into a `byte[]`.
- **`BytesToUUIDConverter`**: Provides functionality to convert a `byte[]` back into a `java.util.UUID` object.

These converters can be easily integrated into any Spring project that requires efficient handling and storage of UUIDs as byte arrays.

## Prerequisites

- **Java:** Version 8 or higher is required to use this library.
- **Spring Framework:** Version 5.3.39 or higher is required due to the dependency on `spring-core`.
- **Spring Data Commons:** Version 2.7.18 or higher is required if you intend to use functionalities that might interact with Spring Data Commons types or abstractions within your library (even if your core converters don't directly use them, their presence as a dependency suggests a potential integration point or testing scenario).
- **Spring Framework:** This library is intended for use within Spring projects.

## Getting Started

### Adding the Dependency to Your Spring Project

To use this dependency in your Spring project, you need to add the JitPack repository and the dependency declaration to your project's build file.
