bash run_mastery.sh clang-format $1 output.java

rm diff.log
java -jar -ea build/libs/mastery-1.0-SNAPSHOT.jar diff output.java -l java --log-file diff.log ../merge-scenarios/$1/expected.java