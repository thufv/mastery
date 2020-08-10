# Usage: run_web.sh project scenario

java -jar build/libs/mastery-1.0-SNAPSHOT.jar webdiff -a gumtree ../../Diff/gumtree-test-8-non-monotone/$1/$2/parent.java ../../Diff/gumtree-test-8-non-monotone/$1/$2/base.java

# java -jar build/libs/mastery-1.0-SNAPSHOT.jar webdiff ../../Diff/gumtree-test-8-non-monotone/$1/$2/parent.java ../../Diff/gumtree-test-8-non-monotone/$1/$2/base.java