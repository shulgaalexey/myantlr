grammar PropertyFile;

file : prop+;
prop : ID '=' STRING '\n';

ID   : [a-zA-Z]+[a-zA-Z1-9]* ;
STRING : '"' [a-zA-Z1-9]* '"';

