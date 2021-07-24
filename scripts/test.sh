#!/bin/bash
# Usage: ./scripts/test.sh [formatter]

./gradlew build -x test
for d in sample/* ; do
    # check if there're base, left and right versions
    b=true
    for version in base left right ; do
        if [ ! -f "$d/left.java" ] ; then
            b=false
        fi
    done

    if $b ; then
        echo "$d"
        rm output.log 2> /dev/null
        if [ $1 ] ; then
            java -ea -jar build/libs/mastery-1.0-SNAPSHOT.jar merge $d/left.java $d/base.java $d/right.java --log-level off --formatter $1
        else
            java -ea -jar build/libs/mastery-1.0-SNAPSHOT.jar merge $d/left.java $d/base.java $d/right.java --output output.java --log-level off --formatter clang-format
        fi
        
        diff output.java $d/result.java
    fi
done