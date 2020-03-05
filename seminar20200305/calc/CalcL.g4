lexer grammar CalcL;
MUL  :   '*' ;
DIV  :   '/' ;
ADD  :   '+' ;
SUB  :   '-' ;

ID   :   [a-zA-Z]+ ;
INT  :   [0-9]+ ;
NEWLINE : '\r'? '\n' ;
WS   :   [ \t]+ -> skip ;


