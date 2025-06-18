#!/bin/bash

case "$1" in
    "build")
        ./gradlew build
        ;;
    "run")
        ./gradlew runClient
        ;;
    "server")
        ./gradlew runServer
        ;;
    "clean")
        ./gradlew clean
        ;;
    "sources")
        ./gradlew genSources
        ;;
    *)
        echo "Usage: $0 {build|run|server|clean|sources}"
        ;;
esac