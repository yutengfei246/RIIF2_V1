/*
    This grammar file introduces expression and types for RIIF-2 ( same with JAVA )
*/
grammar RIIF2ExprType;
import RIIF2Keywords, RIIF2Tokens;

/*RIIF-2: ANTlr.4 expression (Same with JAVA)*/
expression
    : primary
    | ('+'|'-') expression
    | ('~'|'!') expression
    | expression ( '*' | '/' | '%' ) expression
    | expression ( '-' | '+' ) expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression ('<=' | '>=' | '>' | '<') expression
    | expression ('==' | '!=') expression
    | expression '&' expression
    | expression '^' expression
    | expression '|' expression
    | expression '&&' expression
    | expression '||' expression
    | expression '?' expression ':' expression
    | <assoc=right> expression
      (   '='
      |   '+='
      |   '-='
      |   '*='
      |   '/='
      |   '&='
      |   '|='
      |   '^='
      |   '>>='
      |   '>>>='
      |   '<<='
      |   '%='
      )
      expression
    ;

primary
    : '(' expression ')'
    | SELF
    | Ident  // user defined variable
    | HierIdent
    | AttrIdent
    | AssocInstanceIdent
    | AssocAttrIdent
    | AssocHierIdent
    | literal
    | funcCall
    ;

funcCall
    : funcName '(' funcArg ( ',' funcArg ) ? ')'
    ;
funcName
    : FUNC_LOG
    | FUNC_EXP
    | FUNC_AGG_SINGLE
    | FUNC_GT_N_FAIL
    ;
funcArg
    : (Ident|HierIdent|AttrIdent) vector
    | expression
    ;


/*Literal*/
literal
    : StringLiteral
    | DecimalLiteral
    | FloatingPointLiteral
    ;

/*Variable Type*/
complexType
    : primitiveType
    | enumType
    | Ident //user defined type
    ;

/*Vector Declaration*/
vector
    : '[' expression ':' expression ']'
    ;

/*Types*/
primitiveType
    : TYPE_FLOAT
    | TYPE_INTEGER
    | TYPE_STRING
    | TYPE_TABLE
    ;

/*Enum declaration*/
enumType
    : TYPE_ENUM '{' Ident ( ',' Ident)* '}'
    ;


