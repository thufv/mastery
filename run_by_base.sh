#!/bin/bash

# Usage: ./run_by_base.sh <formatter> <basefile>

BASE=$2
LEFT=${BASE/base/left}
RIGHT=${BASE/base/right}

java -jar ./build/libs/mastery-1.0-SNAPSHOT.jar $LEFT $BASE $RIGHT -l java --log-file debug.log --formatter $1 -a ta