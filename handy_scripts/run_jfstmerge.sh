JAVA8='/usr/lib/jvm/java-8-openjdk/bin/java'

BASE=../merge-scenarios/$1/base.java
LEFT=${BASE/base/left}
RIGHT=${BASE/base/right}

time $JAVA8 -jar ../bin/jFSTMerge.jar -o output_jfstmerge.java -f $LEFT $BASE $RIGHT > /dev/null