with open('debug.log', 'r') as f:
    lines = f.readlines()

left_pos = [i for i in range(len(lines)) if 'left\n' in lines[i]][0]
base_pos = [i for i in range(len(lines)) if 'base\n' in lines[i]][0]
right_pos = [i for i in range(len(lines)) if 'right\n' in lines[i]][0]
print('pos: left(', left_pos, '), base(', base_pos, '), right(', right_pos, ')')

base_left_pos = [i for i in range(len(lines)) if 'base <-> left' in lines[i]][0]
base_right_pos = [i for i in range(len(lines)) if 'base <-> right' in lines[i]][0]
print('pos: base <-> left (', base_left_pos, '), base <-> right (', base_right_pos, ')')