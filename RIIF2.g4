/*
    ANTlr.4 for RIIF-2  language  First Try wih the starting point from RIIF-1
*/


//TODO: First Task: Extended Tevmplate Feature (ETF)
//TODO: 1) TABLE 2) [#] operator
grammar RIIF2;
import  RIIF2ExprType;

/*Programmar File RIIF-2 */
program
    : declaration+ EOF
    ;

/*Declarations in RIIF-2 */
declaration
    : componentDecl
    | environmentDecl
    | requirementDecl
    | templateDecl      //RIIF-2: template
    ;

/*RIIF-2: Template Declaration */
/*RIIF-2: Template indentification could extends an template that existed */
templateDecl
    : TEMPLATE Ident ( EXTENDS Ident)? ';'
      templateBodyElement* END_TEMPLATE
    ;
/*RIIF-2: Template body statment */
templateBodyElement
    : abstractDecl
    | imposeAssignment
    ;

/*RIIF-2: Abstract declaration */
abstractDecl
    : abstractConstanceDecl
    | abstractParameterDecl
    | abstractAttributeDecl
    | abstractPlatformDecl
    | abstractFailModeDecl
    | failModeDecl
    ;
abstractFailModeDecl
    : ABSTRACT FAIL_MODE Ident ';'
    ;
abstractConstanceDecl
    : ABSTRACT CONSTANT
      Ident ':' primitiveType
      (':=' expression)? ';' //  abstract constant mConstant : integer := {1,2,3,4,....}
    | ABSTRACT CONSTANT
      Ident ':=' listConstructor
       // abstract constant mConstant := {whatever , ... , ...}
    ;
abstractParameterDecl
    : ABSTRACT PARAMETER
      Ident ':' complexType
      (':=' expression)? ';'
    | ABSTRACT PARAMETER
      Ident ':=' listConstructor

    ;
abstractAttributeDecl
    : ABSTRACT (AttrIdent|AssocAttrIdent) ';'
    ;
abstractPlatformDecl
    : ABSTRACT PLATFORM Ident ';'
    ;

/*RIIF-2*: Impose assignment */
imposeAssignment
    : IMPOSE
      ( Ident
      | AttrIdent
      | HierIdent
      | AssocInstanceIdent
      | AssocAttrIdent
      | AssocHierIdent
      )
      vector? '=' (expression|listConstructor
      ) ';'
    ;

/*RIIF-2: Component Declaration */
/*RIIF-2: Components may become an implementation of some templates */
componentDecl
    : COMPONENT Ident
      (EXTENDS Ident (',' Ident)*)?
      (IMPLEMENTS Ident (',' Ident)*)?  ';'
      componentBodyElement*
      END_COMPONENT
    ;
componentBodyElement
    : parameterDecl
    | constanceDecl
    | childComponentDecl
    | failModeDecl
    | assignment
    | setTemplate
    | assertion
    ;

/*RIIF-2: Set*/
setTemplate
    : SET
      ( Ident
      | AttrIdent
      | HierIdent
      | AssocInstanceIdent
      | AssocAttrIdent
      | AssocHierIdent
      )
      '=' (expression|listConstructor
      ) ';'
    ;

/*RIIF-1: Environment declaration*/
environmentDecl
    : ENVIRONMENT Ident ';'
      environmentBodyElements*
      END_ENVIRONMENT
    ;
environmentBodyElements
    : assignment
    | envParameterDecl
    ;

/*RIIF-1: Requirement Declaration*/
requirementDecl
    : REQUIREMENT Ident ';'
      assertion*
      END_REQUIREMENT
    ;

/*RIIF-2: Parameter Declaration*/
parameterDecl
    : PARAMETER Ident ':' complexType (':=' expression )? ';'
    | PARAMETER AssocDecl
    | PARAMETER Ident ':=' listConstructor

    ;

/*RIIF-2: Environment Declaration*/
envParameterDecl
    : (INPUT|OUTPUT) PARAMETER (Ident|AssocDecl) ':' complexType (':=' expression)? ';'
    ;

/*RIIF-2: Constant Declaration*/
constanceDecl
    : CONSTANT Ident ':' primitiveType (':=' expression)? ';'
    | CONSTANT AssocDecl
    | CONSTANT Ident ':=' listConstructor

    ;

/*RIIF-2: Child Component*/
childComponentDecl
    : CHILD_COMPONENT Ident (Ident|AssocDecl) vector? ';'
    ;

/*RIIF-2: FailModeDecl */
failModeDecl
    : FAIL_MODE (Ident|AssocDecl) ';'
    ;

/*RIIF-2: Assignment*/
assignment
    : ASSIGN
      ( Ident
      | HierIdent
      | AttrIdent
      | AssocInstanceIdent
      | AssocAttrIdent
      | AssocHierIdent
      )
      vector? '=' (expression|listConstructor) ';'
    ;

/*RIIF-1: Assertions*/
assertion
    : ASSERT (AttrIdent) ('<' | '>') expression ';'
    ;

