# import os
# os.chdir('./src/main/java/mastery.translator/java')

# import subprocess
# subprocess.run(['antlr4', 'JavaParser.g4'], stdout=subprocess.PIPE)

names = ["JavaParser.java", "JavaParserBaseListener.java", "JavaParserListener.java"]
for filename in names:
    with open(filename, 'r') as f:
        content = f.read()
    with open(filename, 'w') as f:
        f.write('package mastery.translator.java;\n\n')
        f.write(content)