JAVA8='/usr/lib/jvm/java-8-openjdk/bin/java'

BASE=../merge-scenarios/$1/base.java
LEFT=${BASE/base/left}
RIGHT=${BASE/base/right}

time $JAVA8 -jar ../bin/JDime.jar -m structured -lah off -f -o output_jdime.java $LEFT $BASE $RIGHT