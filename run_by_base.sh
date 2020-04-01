#!/bin/bash

BASE=$1
LEFT=${BASE/base/left}
RIGHT=${BASE/base/right}

java -jar ./build/libs/mastery-1.0-SNAPSHOT.jar $LEFT $BASE $RIGHT -l java --log-file debug.log --formatter clang-format-8 -a ta