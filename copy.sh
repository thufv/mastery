#!/bin/bash

# Usage: ./copy.sh <base>

if [ "$#" -eq 1 ]; then
    PROJECT="${1%%/*}"
    BASE=../commits/$1.java
    LEFT=${BASE/base/left}
    RIGHT=${BASE/base/right}
    EXPECTED=${BASE/base/expected}

    FILENAME=$(basename -- "$BASE")
    EXTENSION="${FILENAME##*.}"
    FILENAME="${FILENAME%.*}"

    mkdir -p scenario/$PROJECT
    cp $BASE scenario/$PROJECT/$FILENAME\_base.$EXTENSION
    cp $LEFT scenario/$PROJECT/$FILENAME\_left.$EXTENSION
    cp $RIGHT scenario/$PROJECT/$FILENAME\_right.$EXTENSION
    cp $EXPECTED scenario/$PROJECT/$FILENAME\_expected.$EXTENSION
else
    echo "Illegal parameter number"
fi