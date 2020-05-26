# MiniJava Language JavaCC Compiler

### Federal University of Ceara, Department of Computing, Course of Compiler Construction.

## Members:
  - Gustavo Sousa
  - Evilásio Costa
  - José de Assis
  - Leyberson Assunção

---

## Prerequisites:

You need [Java](https://www.oracle.com/java/technologies/javase-downloads.html) and [JavaCC](https://javacc.github.io/javacc/) installed. Check the course book [here](https://www.cambridge.org/core/books/modern-compiler-implementation-in-java/34EACED718B1D6D5237705F9BFD7CD4A).

---

## Phases:
### 1. [Lexical Analyser and Parser Phase](src/lexical_analyser/)

Build a lexical analyser and parser for the grammar specified in the course book.

#### Status: lexical_Analyzer is done! Parser with concrete syntax for semantic actions skipped. 

#### Attention: There was an implementation error in the grammar. Already corrected. 

#### Instructions:
```sh
$ cd src/lexical_Analyzer
$ javacc Parser.jj
$ javac *.java
$ java Parser ../test_files/minijava.java 
```

#### Check the [grammar documentation](src/lexical_analyser/Parser.txt) with the comand:
```sh
$ jjdoc -TEXT Parser.jj
```

### 2. [Semantic Actions Phase](src/semantic_actions/)

- First: Construction of the abstract syntax tree for implement the semantic actions
- Second: Construction of the symbol table
- Third: Implementation of the type checking.

#### Status: All semantic actions done. Not compiling.

