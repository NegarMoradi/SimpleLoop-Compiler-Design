grammar SimpleLOOP;

simpleLOOP
    : NewLine? program NewLine* EOF
    ;

program
    : varDefSection classSection
    ;

varDefSection
    : (varDef NewLine+)*
    ;

varDef
    : types identifierGroup
    ;

classVarDef
    : (types | Void) r = Identifier{System.out.println("MethodDec : " + $r.text);}
    ;

types
    : Int
    | Bool
    | array_type
    | fptr_type
    | set_type
    ;


identifierGroup
    : r = Identifier{System.out.println("VarDec : " + $r.text);} (Comma z = Identifier{System.out.println("VarDec : " + $z.text);})* SemiCollon?
    | r = Identifier{System.out.println("VarDec : " + $r.text);}
    | expressionStatement
    ;

fptr_type
    : Fptr Less (types | Void) (Comma (types | Void))* Arrow (types | Void) Greater
    ;

array_type
    : ( Int |  Bool | ClassIdentifier ) ((LBrack commaExpression RBrack)+ | )
    ;

set_type
    : Set Less Int Greater
    ;

classSection
    : ((Class z = ClassIdentifier {System.out.println("ClassDec : " + $z.text);}
        Less r = ClassIdentifier {System.out.println("Inheritance : " + $z.text + " < " + $r.text);} classStatementBlock)
        |  (Class r = ClassIdentifier {System.out.println("ClassDec : " + $r.text);} classStatementBlock))*
    ;

classStatementBlock
    : (LCurlyBrack NewLine+ classScope RCurlyBrack NewLine+) |
       (NewLine+ (((Public | Private) (varDef | constructor)) | (Public initClass)) NewLine+)
    ;


classScope
    : classDef (Public initClass NewLine)? ((Public | Private) (varDef | constructor) NewLine*)*
    ;


classDef
    : ((Public | Private) (varDef | constructor) NewLine*)*
    ;


initClass
    : Initialize mArgument mainStatementBlock?
    ;

constructor
    : classVarDef mArgument mainStatementBlock?
    ;

mArgument
    : LPar (argVarDef (Assign literal)? (Comma argVarDef (Assign literal)? )* )? RPar
    ;

argVarDef
    : types argIdentifierGroup
    ;

argIdentifierGroup
    : r = Identifier{System.out.println("ArgumentDec : " + $r.text);} (Comma z = Identifier{System.out.println("ArgumentDec : " + $z.text);})*
    | r = Identifier{System.out.println("ArgumentDec : " + $r.text);}
    ;

mainStatementBlock
    : NewLine* LCurlyBrack NewLine+ scope RCurlyBrack
    | NewLine* statement SemiCollon?
    | NewLine LCurlyBrack NewLine RCurlyBrack
    ;

scope
    : statement SemiCollon? NewLine+ scope*
    ;

statement
    : varDef
    | expressionStatement
    | ifStatement
    | eachLoop
    | returnStatement
    | printStatement
    ;


returnStatement
    : Return{System.out.println("Return");} commaExpression
    | Return{System.out.println("Return");}
    ;

ifStatement
    : If{System.out.println("Conditional : if");} commaExpression NewLine* mainStatementBlock
    | If{System.out.println("Conditional : if");} commaExpression NewLine? mainStatementBlock (NewLine Elsif{System.out.println("Conditional : elsif");} commaExpression NewLine* mainStatementBlock)+
    | If{System.out.println("Conditional : if");} commaExpression NewLine? mainStatementBlock (NewLine+ Else{System.out.println("Conditional : else");} NewLine? mainStatementBlock)+
    | If{System.out.println("Conditional : if");} commaExpression NewLine? mainStatementBlock (NewLine Elsif{System.out.println("Conditional : elsif");} commaExpression NewLine mainStatementBlock)+ NewLine+ Else{System.out.println("Conditional : else");} NewLine mainStatementBlock
    ;

eachLoop
    : ((LPar commaExpression Dot Dot commaExpression RPar) | Identifier) Dot Each{System.out.println("Loop : each");} Do Line Identifier Line mainStatementBlock
    ;

printStatement
    : Print{System.out.println("Built-in : print");} LPar (Identifier | commaExpression) RPar
    ;

expressionStatement
    : {System.out.println("MethodCall");} memberExpression LPar params RPar
    | commaExpression
    ;

// Expressions
commaExpression
    : assignExpression commaExpressionL
    ;

commaExpressionL
    : Comma assignExpression {System.out.println("Operator : ,");} commaExpressionL
    |
    ;

assignExpression
    : ternaryExpression Assign assignExpression {System.out.println("Operator : =");}
    | ternaryExpression
    ;

ternaryExpression
    : logicalOrExpression ternaryExpressionL
    ;

ternaryExpressionL
    : QMark ternaryExpression Colon ternaryExpression{System.out.println("Operator : ?:");} ternaryExpressionL
    |
    ;

logicalOrExpression
    : logicalAndExpression logicalOrExpressionL
    ;

logicalOrExpressionL
    : Or logicalAndExpression{System.out.println("Operator : ||");} logicalOrExpressionL
    |
    ;

logicalAndExpression
    : equalityExpression logicalAndExpressionL
    ;

logicalAndExpressionL
    : And equalityExpression{System.out.println("Operator : &&");} logicalAndExpressionL
    |
    ;

equalityExpression
    : relationExpression equalityExpressionL
    ;

equalityExpressionL
    : Equals relationExpression{System.out.println("Operator : ==");} equalityExpressionL
    |
    ;

relationExpression
    : additiveExpression relationExpressionL
    ;

relationExpressionL
    : r = (Less | Greater) additiveExpression{System.out.println("Operator : " + $r.text);} relationExpressionL
    |
    ;

additiveExpression
    : multExpression additiveExpressionL
    ;

additiveExpressionL
    : r = (Plus | Minus) multExpression{System.out.println("Operator : " + $r.text);} additiveExpressionL
    |
    ;

multExpression
    : unaryExpression multExpressionL
    ;

multExpressionL
    : r = (Multiply | Division) unaryExpression{System.out.println("Operator : " + $r.text);} multExpressionL
    |
    ;

unaryExpression
    : r = (Minus | Not) unaryExpression{System.out.println("Operator : " + $r.text);}
    | incDecExpression
    ;

incDecExpression
    : memberExpression incDecExpressionL
    ;

incDecExpressionL
    : r = (PPlus | MMinus){System.out.println("Operator : " + $r.text);} incDecExpressionL
    |
    ;

memberExpression
    : valExpression memberExpressionL
    ;

memberExpressionL
    : LPar params RPar memberExpressionL
    | Dot (specialExpression | memberExpression) memberExpressionL
    | LBrack commaExpression RBrack memberExpressionL
    |
    ;

specialExpression
    : newFuncExpression
    | (Add{System.out.println("ADD");} | Include{System.out.println("INCLUDE");} | Delete{System.out.println("DELETE");}) LPar (IntLiteral | Identifier | assignExpression) RPar
    | Merge{System.out.println("MERGE");} LPar (Set Dot newFuncExpression | commaExpression) RPar
    ;

newFuncExpression
    : New{System.out.println("NEW");} ((LPar IntLiteral (Comma IntLiteral) RPar) | (LPar LPar IntLiteral (Comma IntLiteral) RPar RPar) | LPar RPar)
    ;

valExpression
    : LPar commaExpression RPar
    | literal
    | Identifier
    | Self
    | Set
    | IntLiteral
    | ClassIdentifier
    | Initialize
    ;

params
    : (assignExpression (Comma assignExpression)*)?
    ;

literal
    : IntLiteral
    | boolLiteral
    | setLiteral
    ;

setLiteral
    : LPar params RPar
    ;

boolLiteral
    : True
    | False
    ;


//KeyWords

IntLiteral: [1-9] [0-9]* | [0];

Class: 'class';

Private: 'private';

Public: 'public';

Self: 'self';

Initialize: 'initialize';

Print: 'print';

New: 'new';

Null: 'null';

Delete: 'delete';

Include: 'include';

Add: 'add';

Merge: 'merge';

Begin: 'begin';

End: 'end';

Int: 'int';

Bool: 'bool';

True: 'true';

False: 'false';

Set: 'Set';

Fptr: 'fptr';

Main: 'main';

Void: 'void';

While: 'while';

Do: 'do';

If: 'if';

Else: 'else';

Elsif: 'elsif';

Each: 'each';

Return: 'return';

SemiCollon: ';';

LPar: '(';

RPar: ')';

LBrack: '[';

RBrack: ']';

LCurlyBrack: '{';

RCurlyBrack: '}';

Comma: ',';

Equals: '==';

PPlus: '++';

MMinus: '--';

Assign: '=';

Plus: '+';

Minus: '-';

Not: '!';

Multiply: '*';

Division: '/';

DSlahs: '//';

Dot: '.';

Arrow: '->';

Less: '<';

Greater: '>';

And: '&&';

Or: '||';

Line: '|';

Colon: ':';

QMark: '?';

NONZERODIGIT: [1-9];

Identifier: [a-z_] [a-zA-Z0-9_]*;

ClassIdentifier: [A-Z] [a-zA-Z0-9_]*;

NewLine: ('\n' | '\r')+;

Comment: (('=begin' .* '=end') | ('#' ~[\n]+)) -> skip;

WS: ([ \t\r]) -> skip;