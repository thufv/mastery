with open('diff.log', 'r') as f:
    lines = f.readlines()

expectedline = [i for i in range(len(lines)) if 'expected' in lines[i]][0]

for line in lines[:expectedline]:
    if 'classBodyDeclaration ' in line:
        print('output: ', line, end = '')
        pos = line.find('assignment') + len('assignment')
        assignment = line[pos: pos + 7]
        found = False
        for expected_line in lines[expectedline:]:
            if assignment in expected_line:
                print('expected:', expected_line, end = '')
                if found:
                    print('Error: double found.')
                found = True
        if not found:
            print('Error: not found.')

print('==================')

for line in lines[expectedline:]:
    if 'classBodyDeclaration ' in line:
        print('expected: ', line, end = '')
        pos = line.find('assignment') + len('assignment')
        assignment = line[pos: pos + 7]
        found = False
        for output_line in lines[:expectedline]:
            if assignment in output_line:
                found = True
                print('output:', output_line, end = '')
        if not found:
            print('Error: not found.')