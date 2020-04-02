import json
from os import path
import subprocess
from timeit import timeit
import datetime
import random

results = []

# load all files
with open('../bases.json', 'r') as f:
    basefiles = json.load(f)
basefiles = list(map(lambda basefile: path.join('../commits', basefile), basefiles))
random.shuffle(basefiles)

# Run
for basefile in basefiles[:50]:
    result = {}

    leftfile = basefile.replace('/base/', '/left/')
    rightfile = basefile.replace('/base/', '/right/')
    expectedfile = basefile.replace('/base/', '/expected/')

    result['basefile'] = basefile

    result['time'] = timeit(stmt = "subprocess.run(['java', '-jar', 'build/libs/mastery-1.0-SNAPSHOT.jar', '" + leftfile + "', '" + basefile + "', '" + rightfile + "', '-l', 'java', '--log-file', 'debug.log', '--log-level', 'off', '--output', 'output.java', '--formatter', 'clang-format', '-a', 'ta'])", setup = "import subprocess", number = 1)

    with open('output.java', 'r') as f:
        lines = f.readlines()
    result['conflict_num'] = len(list(filter(lambda line: '///// left' in line, lines)))

    result['conflict_line_left'] = 0
    result['conflict_line_right'] = 0
    i = 0
    while i < len(lines):
        if '///// left' in lines[i]:
            i = i + 1
            left_count = 0
            while '///// right' not in lines[i]:
                left_count = left_count + 1
                i = i + 1

            i = i + 1
            right_count = 0
            while '/////' not in lines[i]:
                right_count = right_count + 1
                i = i + 1

            result['conflict_line_left'] = result['conflict_line_left'] + left_count
            result['conflict_line_right'] = result['conflict_line_right'] + right_count

        i = i + 1

    results.append(result)

with open(path.join('results', datetime.datetime.now().strftime("%b_%d-%H%M") + '.json'), 'w') as f:
    json.dump(results, f, indent = "\t")
