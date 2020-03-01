from IPython import embed

with open('JavaParser.g4', 'r') as f:
    lines = f.readlines()

for line in lines:
    if line.endswith('*;\n') or line.endswith('?;\n') or line.endswith('+;\n'):
        print('"' + line.split()[0][:-1] + '",')