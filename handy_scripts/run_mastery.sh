#!/bin/bash

# Usage: ./run_by_base.sh <formatter> <base> [output] [option]

if [ "$#" -gt 1 ]; then
    BASE=$2/base.java
    LEFT=${BASE/base/left}
    RIGHT=${BASE/base/right}

    rm debug.log

    if [ "$#" -gt 2 ]; then
        if [ "$#" -gt 3 ]; then
            if [ "$#" -gt 4 ]; then
                echo "Illegal parameter number"
            else
                echo "time java -ea -jar ./build/libs/mastery-1.0-SNAPSHOT.jar merge $LEFT $BASE $RIGHT -l java --log-file debug.log --formatter $1 -a ta --output $3 $4"
                time java -ea -jar ./build/libs/mastery-1.0-SNAPSHOT.jar merge $LEFT $BASE $RIGHT -l java --log-file debug.log --formatter $1 -a ta --output $3 $4
            fi
        else
            echo "time java -ea -jar ./build/libs/mastery-1.0-SNAPSHOT.jar merge $LEFT $BASE $RIGHT -l java --log-file debug.log --formatter $1 -a ta --output $3"
            time java -ea -jar ./build/libs/mastery-1.0-SNAPSHOT.jar merge $LEFT $BASE $RIGHT -l java --log-file debug.log --formatter $1 -a ta --output $3
        fi
    else
        echo "time java -ea -jar ./build/libs/mastery-1.0-SNAPSHOT.jar merge $LEFT $BASE $RIGHT -l java --log-file debug.log --formatter $1 -a ta"
        time java -ea -jar ./build/libs/mastery-1.0-SNAPSHOT.jar merge $LEFT $BASE $RIGHT -l java --log-file debug.log --formatter $1 -a ta
    fi
else
    echo "Illegal parameter number"
fi
