grammar StateModel;

model: statesAll transitionsAll;

statesAll: STATES CURLY_START stateWithModifier* CURLY_END;
stateWithModifier: initState | errorState | state;
state: UPPER_CASE_ID CURLY_START (LOWER_CASE_ID (COMMA LOWER_CASE_ID)*)? CURLY_END;
initState: INIT state;
errorState: state ERROR;

transitionsAll: TRANSITIONS CURLY_START instruction* CURLY_END;
instruction: transition | schema;

schema: TRANS modifier LOWER_CASE_ID;
modifier: NORMAL | ERROR;

transition: LOWER_CASE_ID COLON startState TRANS_ARROW endState;
startState: UPPER_CASE_ID;
endState: UPPER_CASE_ID;



// LEXERS
// Keywords before general identifiers
STATES: 'states';
INIT: 'initial';
ERROR: 'error';
TRANSITIONS: 'transitions';
TRANS: 'trans';
NORMAL: 'normal';

COLON: ':';
TRANS_ARROW: '->';
COMMA: ',';
CURLY_START: '{';
CURLY_END: '}';

// Identifiers (placed AFTER keywords!)
UPPER_CASE_ID: [A-Z][A-Z0-9]*;
LOWER_CASE_ID: [a-z][a-z0-9]*;


// Whitespaces and comments
WS: (' '| '\t' | '\n' | '\r') -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;