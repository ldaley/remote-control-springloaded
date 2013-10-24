This project is for testing the compatibility of Groovy Remote Control with SpringLoaded.

## Background

Groovy Remote Control can be used to code inject closures into a running system.
This can be useful for test instances of applications to gain access to internals.

SpringLoaded is a hot class reloading library developed by the good folks at Pivotal Labs.

Remote Control is sensitive to SpringLoaded as it instruments classes at runtime.

## Usage

This build provides a `runScript` Gradle task that will

1. start a Remote Control server listening on HTTP
2. start a client process that will send a (closure) command to the server
3. stop the server

If the build succeeds then all is well.

If step 2 fails, the exception will be written to the console.

The build itself defines the SpringLoaded version to use.

## Instructions

To run with SpringLoaded enabled:

    ./gradlew runScript

To run the exact same code without using the SpringLoaded agent:

    ./gradlew runScript -PnoSpringLoaded
