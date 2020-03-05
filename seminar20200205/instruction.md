# ANTLR4 basics

Agenda
  - What is it?
  - How to program grammars?
  - How do we use it for LEQL?
  - Demo
  - Q&A


## What is it?

ANTLR4 is toolkit and framework to specify language grammar and inplement its recognition and processing

ANTLR framework contains:
 - Lexer, which splits input string on tokens
 - Parser, which checks if the sequence of tokens follows the grammar rules

ANTLR toolkit contains:
 - Libs with grammar processing, tokenising, listeners, walkers, etc (LEQL runtime)
 - Skeleton builder, taking grammar and providing java classes with language processing
 - Debug utils, for example, printing token sequence or parsed tree of the input string


## How to program grammars?

  1. Define lexer and parser grammar
  2. Generate java classes
  3. Add custom code to listener or tree walker

## How do we use it for LEQL?


## Demo

### Installation

Run a container
```
docker run -it ubuntu /bin/bash
apt update && apt upgrade -y
```

Install Java 11 and other useful things
```
apt install openjdk-11-jre openjdk-11-jdk curl git-all vim -y
```

Configure VIM, add NERDTree and show ANTLR syntax
```
git clone https://github.com/scrooloose/nerdtree.git ~/.vim/pack/vendor/start/nerdtree
vim -u NONE -c "helptags ~/.vim/pack/vendor/start/nerdtree/doc" -c q
mkdir -p ~/.vim/syntax && cd ~/.vim/syntax
curl -LSso "antlr4.vim" "https://raw.githubusercontent.com/dylon/vim-antlr/master/syntax/antlr4.vim"
vim ~/.vimrc
syntax on
set noswapfile
set number
set hlsearch
au BufRead,BufNewFile *.g4 set filetype=antlr4
```

Install ANTLR
```
cd /usr/local/lib
curl -O https://www.antlr.org/download/antlr-4.8-complete.jar
```

Setup bash aliases
```
vim ~/.bashrc
alias ll='ls -lGa'
export CLASSPATH=".:/usr/local/lib/antlr-4.8-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.8-complete.jar'
alias grun='java org.antlr.v4.runtime.misc.TestRig'

source ~/.bashrc
```

Test if ANTLR installed correctly
```
java -jar /usr/local/lib/antlr-4.8-complete.jar
or
java org.antlr.v4.Tool
or
antlr4
```

### Hello, Calculator

 1. Define CalcL.g4 and Calc.g4
 2. Create language app skeleton (generate code based on grammar):
    ```
	antlr4 Calc.g4
	javac Calc*.java
	```
 3. Debug with grun:
    ```
	grun Calc prog -tokens
	grun Calc prog -tree
	grun Calc prog -tree -file t.expr
	```
	use `(a+b)*3` as input
 4. Implement simple test app MyCalc.java
 5. Compile and run it:
 ```
 javac MyCalc.java Calc*.java
 java MyCalc t.expr
 ```
 6. Implement custom MyListener and re-compile
 ```
 javac MyCalc.java Calc*.java && java MyCalc t.expr
 ```

### Hello, LEQL

 1. Copy LEQL grammar into folder
 2. Create leql app skeleton (generate code based on grammar):
    ```
    antlr4 LeqlLexer.g4
    antlr4 LeqlParser.g4
	javac Leql*.java
    ```
 2. Create and run leql app:
    ```
    javac MyLeql.java Leql*.java && java MyLeql t.leql
	```
	use `where(addr=IP(127.0.0.1/12)) calculate(count)` as input

## Q&A
