from os import path
with open('benchmarks.list', 'r') as f:
    benchmarks = list(map(lambda x: x[:-1], f.readlines()))
count = 0
for benchmark in benchmarks:
    with open(path.join(path.join('../results/mastery-11-td', benchmark), 'output.java.log'), 'r') as f:
        content = f.read()
        if 'lift' in content:
            print(f' ===== {benchmark} ===== ')
            print(content)
            count += 1
print(f'finally, we\'ve found {count} / {len(benchmarks)} conflicts reduced by lifting strategy')