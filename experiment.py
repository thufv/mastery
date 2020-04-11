import json, os
from os import path
from pathlib import Path
import subprocess
import datetime
import random
FNULL = open(os.devnull, 'w')
jsonfile = path.join('results', datetime.datetime.now().strftime("%b_%d-%H%M") + '.json')

# --------------- Tool-related --------------------
tool = 'mastery'

# Note: the command time here is the command of LINUX, but not the one in bash
def calc_command(leftfile, basefile, rightfile, outputfile):
    return ['time', '-v', 'java', '-jar', 'build/libs/mastery-1.0-SNAPSHOT.jar', 'merge', leftfile, basefile, rightfile, '-l', 'java', '--log-level', 'off', '--output', outputfile, '--formatter', 'clang-format', '-a', 'ta']

def calc_conflict(result):
    with open(outputfile, 'r') as f:
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

# --------------- Tool-unrelated -----------------
results = []

# load all files
with open('../non-trivials.json', 'r') as f:
    basefiles = json.load(f)
basefiles = list(map(lambda basefile: path.join('..', basefile), basefiles))
random.shuffle(basefiles)

# Run
for basefile in basefiles[:10]:
    result = {}

    # File information
    leftfile = basefile.replace('/base/', '/left/')
    rightfile = basefile.replace('/base/', '/right/')
    outputfile = basefile.replace('/base/', '/' + tool + '/')
    expectedfile = basefile.replace('/base/', '/expected/')
    print("Working at " + basefile)
    result['basefile'] = basefile
    Path(path.dirname(outputfile)).mkdir(parents = True, exist_ok = True)

    sp = subprocess.run(calc_command(leftfile, basefile, rightfile, outputfile), stdout = subprocess.PIPE, stderr = subprocess.PIPE)
    err = sp.stderr.decode()

    if len(err.split('\n')) == 24:
        result['crash'] = False

        result['time'] = 0
        user_string = 'User time (seconds): '
        user_pos = err.find(user_string) + len(user_string)
        user_pos_eol = err.find('\n', user_pos)
        result['time'] += float(err[user_pos: user_pos_eol])
        system_string = 'System time (seconds): '
        system_pos = err.find(system_string) + len(system_string)
        system_pos_eol = err.find('\n', system_pos)
        result['time'] += float(err[system_pos: system_pos_eol])

        calc_conflict(result)

        # Diff with the expected one
        if result['conflict_num'] != 0:
            result['expected'] = False
        else:
            return_code = subprocess.call(['java', '-jar', '/home/namasikanam/mastery/build/libs/mastery-1.0-SNAPSHOT.jar', 'diff', outputfile, expectedfile, '-l', 'java'], stdout = FNULL, stderr = FNULL)
            result['expected'] = return_code == 0
    else:
        result['crash'] = True

    results.append(result)

    if bin(len(results)).count('1') == 1:
        with open(jsonfile, 'w') as f:
            json.dump(results, f, indent = "\t")


with open(jsonfile, 'w') as f:
    json.dump(results, f, indent = "\t")
