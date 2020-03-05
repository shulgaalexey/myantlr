grammar Calc;
import CalcL;


prog: stat+ ;

stat :   expr NEWLINE           # printExpr
     |   ID '=' expr NEWLINE    # assign
     |   NEWLINE                # blank
     ;

expr :   expr (MUL|DIV) expr    # MulDiv
     |   expr (ADD|SUB) expr    # AddSub
     |   INT                    # int
     |   ID                     # id
     |   '(' expr ')'           # parens
     ;

