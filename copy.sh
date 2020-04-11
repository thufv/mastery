#!/bin/bash

# Usage: ./run_by_base.sh <formatter> <base> [output]

if [ "$#" -eq 2 ]; then
    PROJECT=$1
    BASE=$2
    LEFT=${BASE/base/left}
    RIGHT=${BASE/base/right}
    EXPECTED=${BASE/base/expected}

    FILENAME=$(basename -- "$BASE")
    EXTENSION="${FILENAME##*.}"
    FILENAME="${FILENAME%.*}"

    mkdir scenario/$PROJECT
    cp $BASE scenario/$PROJECT/$FILENAME\_base.$EXTENSION
    cp $LEFT scenario/$PROJECT/$FILENAME\_left.$EXTENSION
    cp $RIGHT scenario/$PROJECT/$FILENAME\_right.$EXTENSION
    cp $EXPECTED scenario/$PROJECT/$FILENAME\_expected.$EXTENSION
else
    echo "Illegal parameter number"
fi