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
- [ ] Recovery Mapping
    - [ ] JDime
        - [ ] Compulsory mappings between children of the constructor
        - [ ] Call ZS algorithm in small cases
    - [ ] ZS algorithm: apply Hungary Algorithm for unordered list
- [ ] Heuristics when adding isomorphism mapping: try including the information of ancestor path
- [ ] Compulsory container mapping between method / classes / ... with the same identifier.
- [ ] Find a theoretical bound of isomorphism mappings (or, isomorphism mapped subtrees) between ASTs

### Engineering

- [ ] Pretty Printer to follow convention
- [ ] Only output mapping
- [ ] Keep the order of children of unordered lists
- [ ] More supported languages
- [ ] Graphic AST mappings

### Wierd Inputs

## Authors

- Fengmin Zhu
- Rongchen Xu
- Xingyu Xie