#!/bin/bash

PROJECTNAME="${1%%.*}"
FILENAME="${1##*.}"

bash copy.sh ${1//\./\/}
bash run_by_base.sh clang-format scenario/${PROJECTNAME}/${FILENAME}_base.java output.java

rm diff.log
java -jar build/libs/mastery-1.0-SNAPSHOT.jar diff -l java output.java scenario/${PROJECTNAME}/${FILENAME}_expected.java --log-file diff.log

if [ $? -eq 0 ]; then
    rm scenario/${PROJECTNAME}/${FILENAME}_*
fi