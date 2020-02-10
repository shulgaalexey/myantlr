grammar LabeledExpr;
import CommonLexerRules;


prog: stat+ ;

stat :   expr NEWLINE           # printExpr
     |   ID '=' expr NEWLINE    # assign
     |   clear                  # clr
     |   NEWLINE                # blank
     ;

expr :   expr op=('*'|'/') expr    # MulDiv
     |   expr op=('+'|'-') expr    # AddSub
     |   INT                    # int
     |   ID                     # id
     |   '(' expr ')'           # parens
     ;

clear : 'clr' ;

MUL  :   '*' ;
DIV  :   '/' ;
ADD  :   '+' ;
SUB  :   '-' ;
