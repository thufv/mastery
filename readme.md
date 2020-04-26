# Mastery

A three-way (the newest version of two branches and the version exactly before branching) Abstract Syntax Tree structured merge tool.

## Getting Started

### Tool Dependency

- Java: 11
- Antlr: 4.7.1

### Build

```bash
./gradlew build
```

> Note: If you failed to build, make sure your Java version is 11.

If you want to modify and build java parser, you need to do this:
```bash
cd ./src/main/java/mastery/translator/java
antlr4 JavaParser.java
python3 add_package.py
cd ../../../../../../
```

### Basic Usage

`-h` will tell you everything.

### Formatter

I develop this tool with [clang format 8.0.0-3~ubuntu18.04.2](https://clang.llvm.org/docs/ClangFormat.html).

## Road Map

### Algorithm

- Performance optimization
    - [ ] LCA calculation: $O(n) \rightarrow O(\log n)$ per time
    - [ ] Dice function calculation: $O(n) \rightarrow O(\log^2 n) / O(\sqrt n)$ per time
    - [ ] Finding candidate of container mapping: $O(n) \rightarrow O(1)$
- [ ] Recovery Mapping: apply Hungary Algorithm for unordered list to improve the behavior of ZS algorithm
- [ ] Heuristics when adding isomorphism mapping: try including the information of ancestor path
- [ ] Compulsory container mapping between method / classes / ... with the same identifier.
- [ ] Find a theoretical bound of isomorphism mappings (or, isomorphism mapped subtrees) between ASTs

### Engineering

- [ ] Only output mapping
- [ ] Keep the order of children of unordered lists
- [ ] More supported languages
- [ ] Graphic AST mappings

### Representative scenarios

#### Old Benchmarks
```bash
glide.a93a9410a720adbfcf76e280db4ed3fda5e939d7.base.library.src.main.java.com.bumptech.glide.request.target.ViewTarget
# A counterexample of our merge scenarios.
# "right" put `private static final int PENDING_SIZE = 0;` into comments,
# which exists normally in both "base" and "right".
# In this case, this statement will be deleted in our strategy, which happens indeed.
# But in the "expected", as a developer can reasonably expect, it's not deleted.

kotlin.b182d61a03552ca982a098bb5d8330ab3997487c.base.idea.src.org.jetbrains.jet.plugin.references.JetSimpleNameReference
# An example of correct (reasonable) conflict of order changing in an ordered list,
# that means conflict resolving is not reasonable, a manually checking for semantic is necessary

antlr4.b14ca56441196d63b8974455c0050bfaee4cb3a4.base.tool.src.org.antlr.v4.automata.ATNSerializer
# An example to show the difficulty of merging ordered list:
# If "left" add one statement and "right" add two same statement,
# what should I do?

MPAndroidChart.b28aae50fc6b0dd48a812831d6ef0c5c98ef8c0f.base.MPChartExample.src.com.xxmassdeveloper.mpchartexample.BarChartActivitySinus
# An counterexample to show the flaw in the cases
# that "base" is very different from "left" and "right",
# but "left" and "right" and similar enough.
# Our algorithm unfortunately can't handle this case properly.

cpachecker.70675412d1cefbed8965dc7ac68facea7eb00889.base.src.org.sosy_lab.cpachecker.cfa.objectmodel.c.FunctionDefinitionNode
# A good example to show that we could explosure some conflicts
# that jdime will just merge without any hint for developer
```
#### New Benchmarks

## Authors

- Fengmin Zhu
- Rongchen Xu
- Xingyu Xie