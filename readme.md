# Mastery

A three-way (the newest version of two branches and the version exactly before branching) Abstract Syntax Tree structured merge tool.

## Getting Started

### Build

#### Parser

### Basic Usage

`-h` will tell you everything.

### Formatter

I develop this tool with [clang format 8.0.0-3~ubuntu18.04.2](https://clang.llvm.org/docs/ClangFormat.html).

## Road Map

### High Priority

- [x] Parse from source file
- [x] Formatter of output
    - [x] Formatting of conflict
- [ ] More heuristics
- [ ] Some refinement of syntax
- [ ] Improved algorithm
  - [ ] More efficient identification algorithm
  - [ ] RTED
  - [ ] More reasonable implementation of matching to keep the magic order
- [ ] Delete unreasonable `Nothing` design
- [ ] Auto check with expected result

### Low Priority

- [ ] Multiple languages support
- [ ] Json dumping from the AST
- [ ] Graphic AST mapping for debug
    - @namasikanam: looks very hard

## Authors

- Fengmin Zhu
- Rongchen Xu
- Xingyu Xie