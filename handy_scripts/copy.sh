#!/bin/bash

# Usage: ./copy.sh <base>

if [ "$#" -eq 1 ]; then
    BASE=../merge-scenarios/$1/base.java
    LEFT=${BASE/base/left}
    RIGHT=${BASE/base/right}
    EXPECTED=${BASE/base/expected}

    FILENAME=$(basename -- "$BASE")
    EXTENSION="${FILENAME##*.}"
    FILENAME="${FILENAME%.*}"

    mkdir -p scenario/$1
    cp $BASE scenario/$1/base.java
    cp $LEFT scenario/$1/left.java
    cp $RIGHT scenario/$1/right.java
    cp $EXPECTED scenario/$1/expected.java
else
    echo "Illegal parameter number"
fi