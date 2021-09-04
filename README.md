# Mastery

Mastery is a three-way structured merge tool.

## Build

```bash
./gradlew build -x test
```

It will generate a jar file stored in `build/libs`.

## User Guide

### Requirements

- JDK 11: Our development and experiments are all in JDK 11, we can't guarantee anything for other Java versions.

### Usage

The recommended usage of Mastery is:

```bash
java -jar mastery.jar merge <left> <base> <right> -o <output>
```

where `<left>`, `<base>` and `<right>` are the paths of the three files to merge, `<output>` is the path for the result merged code. When `-o` is not specified, the merged code will be printed to stdout.

For more extensive usage information:
```bash
java -jar mastery.jar -h
```
