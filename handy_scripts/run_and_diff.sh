if [[ $1 == scenario* ]]
then
    SCENARIO=$1
else
    SCENARIO=../merge-scenarios/$1
fi

bash run_mastery.sh clang-format $SCENARIO output.java

rm diff.log
java -jar -ea build/libs/mastery-1.0-SNAPSHOT.jar diff output.java -l java --log-file diff.log $SCENARIO/expected.java