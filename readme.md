# Mastery

Mastery is a three-way structured merge tool.

## User Guide

### Requirements

- JDK 11: Our development and experiments are all in JDK 11, we can't guarantee anything for other Java versions. 
- [ClangFormat](https://clang.llvm.org/docs/ClangFormat.html): We need a code formatter to beautify our output code, other code format tool is allowed, but ClangFormat is our recommended choice.

### Usage

The recommended usage of Mastery is:

```bash
java -jar mastery.jar <left> <base> <right> -o <output> --formatter <formatter> -l <language>
```

where `<left>`, `<base>` and `<right>` are the paths of the three files to merge, `<output>` is the path for the result merged code, which could not exist before execution, `<formatter>` is the path for the code formatter. `<language>` is the language of code.

The simplest usage of Mastery is:
```bash
java -jar mastery.jar <left> <base> <right>
```
In this case, the result merged code will be output to standard out stream as plain text, which is a little inconvenient to read.

For more extensive usage information:
```bash
java -jar mastery.jar -h
```