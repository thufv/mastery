JAVA8='/usr/lib/jvm/java-8-openjdk/bin/java'

BASE=../merge-scenarios/$1/base.java
LEFT=${BASE/base/left}
RIGHT=${BASE/base/right}

time git merge-file --stdout $LEFT $BASE $RIGHT > output_gitmerge.java