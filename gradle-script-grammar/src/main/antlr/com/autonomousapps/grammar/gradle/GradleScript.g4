parser grammar GradleScript;

options { tokenVocab=GradleScriptLexer; }

script
    :   (text|dependencies|buildscript)* EOF
    ;

dependencies
    :   DEPENDENCIES (normalDeclaration|testFixturesDeclaration|enforcedPlatformDeclaration|platformDeclaration)* BRACE_CLOSE
    ;

buildscript
    :   BUILDSCRIPT BRACE_OPEN (dependencies|block|sea)* BRACE_CLOSE
    ;

block
    :   ID BRACE_OPEN (block|sea)* BRACE_CLOSE
    ;

normalDeclaration
    :   configuration PARENS_OPEN? quote? dependency quote? PARENS_CLOSE? closure?
    |   configuration PARENS_OPEN quote? ID quote? COMMA dependency PARENS_CLOSE? closure?
    ;

testFixturesDeclaration
    :   configuration PARENS_OPEN? TEST_FIXTURES quote? dependency quote? PARENS_CLOSE PARENS_CLOSE? closure?
    ;

enforcedPlatformDeclaration
    :   configuration PARENS_OPEN? ENFORCED_PLATFORM quote? dependency quote? PARENS_CLOSE PARENS_CLOSE? closure?
    ;

platformDeclaration
    :   configuration PARENS_OPEN? PLATFORM quote? dependency quote? PARENS_CLOSE PARENS_CLOSE? closure?
    ;

configuration
    :   ID
    ;

dependency
    :   externalDependency
    |   projectDependency
    |   fileDependency
    ;

externalDependency
    :   ID (PARENS_OPEN PARENS_CLOSE)?
    ;

projectDependency
    :   PROJECT PARENS_OPEN quote? ID quote? PARENS_CLOSE
    |   PROJECT PARENS_OPEN projectMapEntry+ PARENS_CLOSE
    ;

projectMapEntry
    :   WS? key=(CONFIGURATION|PATH) WS? quote? value=ID quote? WS? COMMA? WS?
    ;

// We don't need a matching PARENS_OPEN because FILE and FILES include the opening parens
// this is dumb and should be fixed.
fileDependency
    :   (FILE|FILES) quote? ID quote? PARENS_CLOSE
    ;

closure
    :   BRACE_OPEN (codeblock+?|closure)+ BRACE_CLOSE
    ;

quote
    : QUOTE_SINGLE
    | QUOTE_DOUBLE
    ;

text
    : UNICODE_LATIN
    | ID
    | WS
    | DIGIT
    | FILE
    | FILES
    | EQUALS
    | SEMI
    | QUOTE_SINGLE
    | QUOTE_DOUBLE
    | BRACE_OPEN
    | BRACE_CLOSE
    | PARENS_OPEN
    | PARENS_CLOSE
    | BACKSLASH
    | PROJECT
    | COMMA
    ;

codeblock
    : UNICODE_LATIN
    | ID
    | WS
    | DIGIT
    | FILE
    | FILES
    | EQUALS
    | SEMI
    | QUOTE_SINGLE
    | QUOTE_DOUBLE
    | PARENS_OPEN
    | PARENS_CLOSE
    | BACKSLASH
    | PROJECT
    | COMMA
    ;

// Sea of crap I don't care about
sea
    : ID
    | EQUALS
    | QUOTE_SINGLE
    | QUOTE_DOUBLE
    | PARENS_OPEN
    | PARENS_CLOSE
    ;
