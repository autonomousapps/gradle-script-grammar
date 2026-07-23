parser grammar GradleScript;

options { tokenVocab=GradleScriptLexer; }

script
    :   (dependencies|buildscript|block|text)* EOF
    ;

// Nested DSL blocks such as constraints { api("g:a:1") } remain separate from surrounding dependency declarations.
dependencies
    :   DEPENDENCIES (normalDeclaration|testFixturesDeclaration|enforcedPlatformDeclaration|platformDeclaration|block)* BRACE_CLOSE
    ;

buildscript
    :   BUILDSCRIPT BRACE_OPEN (dependencies|block|closure|sea)* BRACE_CLOSE
    ;

// Optional call arguments keep create("Database") { } available as a single block.
block
    :   ID callArguments? BRACE_OPEN (dependencies|block|closure|sea)* BRACE_CLOSE
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
    |   PROJECT_ACCESSOR
    ;

projectMapEntry
    :   WS? key=(CONFIGURATION|PATH) WS? quote? value=ID quote? WS? COMMA? WS?
    ;

// We don't need a matching PARENS_OPEN because FILE and FILES include the opening parens
// this is dumb and should be fixed.
fileDependency
    :   (FILE|FILES) quote? ID quote? PARENS_CLOSE
    ;

// Closures stay opaque except for nested blocks such as artifact { type = "aar" }.
closure
    :   BRACE_OPEN (dependencies|block|closure|codeblock)* BRACE_CLOSE
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
    | PROJECT_ACCESSOR
    | COMMA
    ;

codeblock
    : UNICODE_LATIN
    | ID
    | NAME
    | WS
    | DIGIT
    | FILE
    | FILES
    | TEST_FIXTURES
    | ENFORCED_PLATFORM
    | PLATFORM
    | BUILDSCRIPT
    | PATH
    | CONFIGURATION
    | EQUALS
    | SEMI
    | QUOTE_SINGLE
    | QUOTE_DOUBLE
    | PARENS_OPEN
    | PARENS_CLOSE
    | BACKSLASH
    | PROJECT
    | PROJECT_ACCESSOR
    | COMMA
    ;

// Tokens from statements such as enabled = true are ignored while walking a block's nested structure.
sea
    : UNICODE_LATIN
    | ID
    | NAME
    | DIGIT
    | FILE
    | FILES
    | TEST_FIXTURES
    | ENFORCED_PLATFORM
    | PLATFORM
    | PROJECT
    | PROJECT_ACCESSOR
    | BUILDSCRIPT
    | PATH
    | CONFIGURATION
    | EQUALS
    | SEMI
    | QUOTE_SINGLE
    | QUOTE_DOUBLE
    | PARENS_OPEN
    | PARENS_CLOSE
    | BACKSLASH
    | COMMA
    ;

// Balanced arguments keep create("Database") attached to its following block.
callArguments
    :   PARENS_OPEN callArgument* PARENS_CLOSE
    ;

// Argument values such as "Database" are grouped without interpreting their Groovy semantics.
callArgument
    :   callArguments
    |   prefixedCallArguments
    |   closure
    |   callArgumentToken
    ;

// Lexer tokens such as files( include their opening parenthesis and only need a matching closing one.
prefixedCallArguments
    :   (FILE|FILES|TEST_FIXTURES|ENFORCED_PLATFORM|PLATFORM) callArgument* PARENS_CLOSE
    ;

callArgumentToken
    :   UNICODE_LATIN
    |   ID
    |   NAME
    |   DIGIT
    |   PROJECT
    |   PROJECT_ACCESSOR
    |   BUILDSCRIPT
    |   PATH
    |   CONFIGURATION
    |   EQUALS
    |   SEMI
    |   QUOTE_SINGLE
    |   QUOTE_DOUBLE
    |   BACKSLASH
    |   COMMA
    ;
