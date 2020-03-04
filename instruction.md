# Learning ANTLR4

This is a simple project to learn ANTLR4

Note, to pull/push the container to/from Mac it is required to run a single line command

```
docker login -u "shulgaalexey" -p "password" docker.io && docker pull shulgaalexey/myantlr:myantlr02
```
or correspondingly
```
docker login -u "shulgaalexey" -p "password" docker.io && docker push shulgaalexey/myantlr:myantlr02
```




# Container run
```
//docker run -ti ubuntu /bin/bash
docker run -ti -m 512M openjdk:8u181-jdk
apt-get update
apt-get upgrade
```

# Install Java 11
```
apt-get install openjdk-11-jre openjdk-11-jdk
```

# Install git and curl
```
apt-get install git-all
apt-get install curl
```

# VIM install
```
apt-get install vim
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

# ANTLR install
```
cd /usr/local/lib
curl -O https://www.antlr.org/download/antlr-4.8-complete.jar
```

# Setup bash
```
vim .bash_profile
alias ll='ls -lGa'
export CLASSPATH=".:/usr/local/lib/antlr-4.8-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.8-complete.jar'
alias grun='java org.antlr.v4.runtime.misc.TestRig'
```

# Test ANTLR installed correctly
```
java -jar /usr/local/lib/antlr-4.8-complete.jar
or
java org.antlr.v4.Tool
or
antlr4
```

# Run another docker console
```
docker ps -a
docker exec -it 1c0cc4922bee bash
```

# Start a container
```
docker start 1c0cc4922bee
```

# Commit snf push a new image to the repository using the CLI
```
//docker tag local-image:tagname new-repo:tagname
docker tag 6d0557fcfc07 shulgaalexey/myantlr:myantlr03
docker login -u "shulgaalexey" -p "qwer1357" docker.io && docker push shulgaalexey/myantlr:myantlr03
docker login -u "shulgaalexey" -p "qwer1357" docker.io && docker pull shulgaalexey/myantlr:myantlr03
```
