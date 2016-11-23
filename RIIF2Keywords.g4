/**
 * First part of this file is including the keywords of RIIF-1
 * Second part of this file is including the keywords of RIIF-2
 *
 **/


lexer grammar RIIF2Keywords ;

// First part
COMPONENT: 'component';
END_COMPONENT: 'endcomponent';

ENVIRONMENT: 'environment';
END_ENVIRONMENT: 'endenvironment';

REQUIREMENT: 'requirement';
END_REQUIREMENT: 'endrequirement';

CHILD_COMPONENT: 'child_component';
FAIL_MODE: 'fail_mode';

EXTENDS: 'extends';
ASSIGN: 'assign';
ASSERT: 'assert';
INPUT: 'input';
OUTPUT: 'output';

PARAMETER: 'parameter';
CONSTANT: 'constant';

TYPE_FLOAT: 'float';
TYPE_INTEGER: 'integer';
TYPE_STRING: 'string';
TYPE_ENUM: 'enum';

FUNC_AGG_SINGLE: 'agg_single_fail';
FUNC_GT_N_FAIL: 'agg_gt_n_fail';

FUNC_LOG: 'LOG';
FUNC_EXP: 'EXP';

//Second part
TEMPLATE: 'template';
END_TEMPLATE: 'endtemplate';
IMPOSE: 'impose';
ABSTRACT: 'abstract';
IMPLEMENTS: 'implements';
SELF: 'self';
SET: 'set';
TYPE_TABLE: 'table';
PLATFORM: 'platform';

