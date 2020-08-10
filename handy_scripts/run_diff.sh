# Usage: run_diff.sh project scenario

java -jar build/libs/mastery-1.0-SNAPSHOT.jar textdiff -a gumtree ../../Diff/gumtree-test-8-non-monotone/$1/$2/parent.java ../../Diff/gumtree-test-8-non-monotone/$1/$2/base.java --log-level fine --log-file diff.log -o diff.out

# java -jar build/libs/mastery-1.0-SNAPSHOT.jar textdiff ../../Diff/gumtree-test-8-non-monotone/$1/$2/parent.java ../../Diff/gumtree-test-8-non-monotone/$1/$2/base.java --log-level fine --log-file diff.log -o diff.out