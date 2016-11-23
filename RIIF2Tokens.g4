/**
  *
  * This file includes all the tokens that used in RIIF2.g4 except those already in KEYWORDS.g4
  *
  **/

lexer grammar RIIF2Tokens;

/*Literal Tokens */
StringLiteral
    : '"' ( ~('\\' | '"') )* '"'
    ;
FloatingPointLiteral
    : DIGIT+ '.' DIGIT* Exponent? FloatTypeSuffix?
    | '.' DIGIT+ Exponent? FloatTypeSuffix?
    | DIGIT+ Exponent FloatTypeSuffix?
    ;
DecimalLiteral
    : DIGIT+
    ;

/*Identification */
Ident
    : (LETTER) (LETTER|DIGIT|UNDERSCORE)*
    ;
HierIdent
    : (Ident) ('.' Ident)+
    ;
AttrIdent
    : (Ident|HierIdent) '\''(Ident)
    ;

/*Associative Identification*/
AssocDecl
    : Ident '[' ']'
    ;
AssocInstanceIdent
    : Ident '[' Ident ']'
    ;
AssocHierIdent
    : Ident '.' AssocInstanceIdent
    ;
AssocAttrIdent
    : (AssocInstanceIdent|AssocHierIdent) '\'' Ident
    ;


WS: (' ' | '\r' | '\t' |' \u000C' | '\n' ) ->channel(HIDDEN) ;

COMMENT
    : '/*' .*? '*/'  ->channel(HIDDEN)
    ;
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' -> channel(HIDDEN)
    ;

fragment
DIGIT: '0'..'9';
fragment
LETTER: ( 'a'..'z' | 'A'..'Z' );
fragment
UNDERSCORE: '_';
fragment
EscapeSequence
    : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    | UnicodeEscape
    | OctalEscape
    ;
fragment
OctalEscape
    : '\\' ('0'..'3')('0'..'7')('0'..'7')
    | '\\' ('0'..'7')('0'..'7')
    | '\\' ('0'..'7')
    ;
fragment
HexDigit
    : ('0'..'9' | 'a'..'f' | 'A'..'F')
    ;
fragment
UnicodeEscape
    : '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
fragment
Exponent
    : ('e'|'E')('+'|'-')?DIGIT+
    ;
fragment
FloatTypeSuffix
    : ('f'|'F'|'d'|'D')
    ;