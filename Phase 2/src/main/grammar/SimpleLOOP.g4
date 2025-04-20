grammar SimpleLOOP;

@header{
     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.classDec.*;
     import main.ast.nodes.declaration.classDec.classMembersDec.*;
     import main.ast.nodes.declaration.variableDec.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.nodes.statement.set.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import main.ast.types.set.*;
     import main.ast.types.functionPointer.*;
     import main.ast.types.array.*;
     import java.util.*;
 }

simpleLOOP returns [Program simpleLOOPProgram]:
    NEWLINE* p = program {$simpleLOOPProgram = $p.programRet;} NEWLINE* EOF;

program returns[Program programRet]:
    {$programRet = new Program();
     int line = 1;
     $programRet.setLine(line);}
    (v = varDecStatement NEWLINE+
    {
        for (VariableDeclaration varDec: $v.varDecStmtRet)
            $programRet.addGlobalVariable(varDec);
    })*
    (c = classDeclaration NEWLINE+ {$programRet.addClass($c.classDeclarationRet);})*;

//todo done
constructor returns [ConstructorDeclaration constructorRet]:
    PUBLIC init = INITIALIZE
    {   $constructorRet = new ConstructorDeclaration();
        $constructorRet.setLine($init.getLine());}
      args = methodArgsDec NEWLINE*
       { $constructorRet.setArgs( $args.argsRet ); }
       bod = methodBody
       { $constructorRet.setLocalVars($bod.localVars);
            $constructorRet.setBody( $bod.statements ); };

//todo done
classDeclaration returns [ClassDeclaration classDeclarationRet]
    : cls = CLASS clsn = class_identifier
    { $classDeclarationRet = new ClassDeclaration( $clsn.idRet);
        $classDeclarationRet.setLine( $cls.getLine()) ;}

     (LESS_THAN pname = class_identifier
       { $classDeclarationRet.setParentClassName( $pname.idRet ); } )?
    NEWLINE* ((LBRACE NEWLINE+ ( fd = field_decleration
            { for (Declaration field : $fd.decRet) {
                if (field instanceof FieldDeclaration) {
                    $classDeclarationRet.addField((FieldDeclaration) field); }
                else if (field instanceof ConstructorDeclaration) {
                    $classDeclarationRet.setConstructor((ConstructorDeclaration) field); }
                else if (field instanceof MethodDeclaration) {
                    $classDeclarationRet.addMethod((MethodDeclaration) field); }

                }
            }

    NEWLINE+)+ RBRACE) | (fds = field_decleration{
                for (Declaration field : $fds.decRet) {
                                if (field instanceof FieldDeclaration) {
                                    $classDeclarationRet.addField((FieldDeclaration) field); }
                                else if (field instanceof MethodDeclaration) {
                                    $classDeclarationRet.addMethod((MethodDeclaration) field); }
                                else if (field instanceof ConstructorDeclaration) {
                                    $classDeclarationRet.setConstructor((ConstructorDeclaration) field); }


                }}));

//todo done
field_decleration returns[ArrayList<Declaration> decRet]:
    {
        $decRet = new ArrayList<>();
    }
    ((( acs = (PUBLIC | PRIVATE) (vs = varDecStatement{
        for (VariableDeclaration varDec: $vs.varDecStmtRet){
            var nField = new FieldDeclaration(varDec, $acs.toString() == "public" ? true : false);

            nField.setLine(varDec.getLine());
            $decRet.add(nField);
            }
    } | mt = method{
        var nMethod = $mt.methodDecRet;
        if($acs.toString() == "public")
            nMethod.setPrivate(false);
        else
            nMethod.setPrivate(true);
        $decRet.add($mt.methodDecRet);

    })) | cs = constructor{
        $decRet.add($cs.constructorRet);
    }));

//todo done
method returns [MethodDeclaration methodDecRet]
    locals [Type mtype]:
     (tp = type{
        $mtype = $tp.typeRet;
     } | VOID{
        $mtype = new VoidType();
     }) (id = identifier) (magd = methodArgsDec) NEWLINE* mbody = methodBody{
        $methodDecRet = new MethodDeclaration($id.idRet, $mtype, false);
        $methodDecRet.setArgs($magd.argsRet);
        $methodDecRet.setLocalVars($mbody.localVars);
        $methodDecRet.setBody($mbody.statements);
        $methodDecRet.setLine($id.idRet.getLine());
     };

//todo done
methodBody returns[ArrayList<VariableDeclaration> localVars, ArrayList<Statement> statements]:
    ({
        $localVars = new ArrayList<>();
        $statements = new ArrayList<>();
    }
    (LBRACE NEWLINE+ (vs = varDecStatement NEWLINE+ {
          for (VariableDeclaration varDec : $vs.varDecStmtRet)
               $localVars.add(varDec);
    })* (ss = singleStatement NEWLINE+{
        $statements.add($ss.singleRet);
    })* RBRACE)
    | {
            $localVars = new ArrayList<>();
            $statements = new ArrayList<>();
    }((vs = varDecStatement{
        for (VariableDeclaration varDec : $vs.varDecStmtRet)
             $localVars.add(varDec);
    }) | (ss=singleStatement{
         $statements.add($ss.singleRet);
    })));


//todo bdone
methodArgsDec returns[ArrayList<VariableDeclaration> argsRet]
    : LPAR {
        $argsRet = new ArrayList<>();
    }(arg1 = argDec {
        $argsRet.add($arg1.argDecRet);
    } ((ASSIGN orExpression) | (COMMA arg2 = argDec {
        $argsRet.add($arg2.argDecRet);
    })*) (COMMA arg3=argDec {
        $argsRet.add($arg3.argDecRet);
    } ASSIGN orExpression)*)? RPAR ;

//todo done e
argDec returns [VariableDeclaration argDecRet]:
    t = type i = identifier
    {
        $argDecRet = new VariableDeclaration($i.idRet, $t.typeRet);
        $argDecRet.setLine($i.idRet.getLine());
    };

//todo done
methodArgs returns[ArrayList<Expression> methodCallArgsRet]:
    { $methodCallArgsRet = new ArrayList<>(); }
    (e1=expression
    { $methodCallArgsRet.add($e1.expRet); }
    (COMMA e2=expression
    { $methodCallArgsRet.add($e2.expRet); }
    )*)?;

//todo done
body returns[Statement statementRet]:
     (bls = blockStatement{
        $statementRet = $bls.blockRet;
     } | (NEWLINE+ sns = singleStatement{
        $statementRet = $sns.singleRet;
     }));

//todo done
blockStatement returns[BlockStmt blockRet]:
    lb = LBRACE{
        $blockRet = new BlockStmt();
        $blockRet.setLine($lb.getLine());
    } NEWLINE+ (sns = singleStatement{
        $blockRet.addStatement($sns.singleRet);
    } NEWLINE+)* RBRACE;

//todo done
singleStatement returns[Statement singleRet]
    :
    iff = ifStatement { $singleRet = $iff.ifRet; }
    | ps = printStatement { $singleRet = $ps.printRet; }
    | ms = methodCallStmt { $singleRet = $ms.methRet; }
    | rs = returnStatement { $singleRet = $rs.returnStmtRet; }
    | as = assignmentStatement { $singleRet = $as.assignmentRet; }
    | ls = loopStatement { $singleRet = $ls.loopRet; }
    | ads = addStatement { $singleRet = $ads.addSRet; }
    | mgs = mergeStatement { $singleRet = $mgs.mergeRet; }
    | ds = deleteStatement { $singleRet = $ds.delRet; }
    ;

//todo done
addStatement returns [SetAdd addSRet]
    :
    expr = expression DOT adds = ADD LPAR  orexpr = orExpression RPAR
    {
        $addSRet = new SetAdd($expr.expRet, $orexpr.orExprRet);
        $addSRet.setLine($adds.getLine());
    };

//todo done
mergeStatement returns [SetMerge mergeRet]
    locals [ArrayList <Expression> exprArgs]:
    expr = expression DOT merge = MERGE LPAR orexpr = orExpression {
        $exprArgs = new ArrayList <> ();
        $exprArgs.add($orexpr.orExprRet); }
    (COMMA orexpr = orExpression{
        $exprArgs.add($orexpr.orExprRet);
    })*
    {
        $mergeRet = new SetMerge($expr.expRet, $exprArgs);
        $mergeRet.setLine($merge.getLine());
    }
    RPAR;

//todo done
deleteStatement returns [SetDelete delRet]
    :
    expr = expression DOT del = DELETE LPAR orexpr = orExpression RPAR
    {
        $delRet = new SetDelete($expr.expRet, $orexpr.orExprRet);
        $delRet.setLine($del.getLine());
    };

//todo bdone
varDecStatement returns [ArrayList<VariableDeclaration> varDecStmtRet]
    locals [VariableDeclaration varDecTmp] :
    {$varDecStmtRet = new ArrayList<>();}
    t = type id = identifier
    {
        $varDecTmp = new VariableDeclaration($id.idRet, $t.typeRet);
        $varDecTmp.setLine($id.line);
        $varDecStmtRet.add($varDecTmp); }
    ( COMMA id2=identifier
    {
        $varDecTmp = new VariableDeclaration($id2.idRet, $t.typeRet);
        $varDecTmp.setLine($id2.line);
        $varDecStmtRet.add($varDecTmp);
    })*;

//todo bdone
ifStatement returns [ConditionalStmt ifRet]
    locals [ElsifStmt elif]:
    i = IF c = condition b = body{
        $ifRet = new ConditionalStmt($c.conditionRet, $b.statementRet);
        $ifRet.setLine($i.getLine());
    }
    (elsif = elsifStatement{
        $elif = new ElsifStmt($elsif.elseifRet.getCondition(), $elsif.elseifRet.getThenBody());
        $elif.setLine($elsif.elseifRet.getLine());
        $ifRet.addElsif($elif);
    })*
    (els = elseStatement{
        $ifRet.setElseBody($els.elseRet);
    })?;


//todo bdone
elsifStatement returns[ElsifStmt elseifRet]:
     NEWLINE* el = ELSIF
     c = condition
     b = body{
        $elseifRet = new ElsifStmt($c.conditionRet, $b.statementRet);
        $elseifRet.setLine($el.getLine());
     };

//todo done
condition returns[Expression conditionRet]
    :
    (LPAR exp = expression{
        $conditionRet = $exp.expRet;
    } RPAR) | (exp = expression { $conditionRet = $exp.expRet; });

//todo done
elseStatement returns[Statement elseRet]
    :
    NEWLINE* ELSE b = body{
        $elseRet = $b.statementRet;
    };

//todo done
printStatement returns[PrintStmt printRet]:
    p = PRINT LPAR exp = expression{
        $printRet = new PrintStmt($exp.expRet);
        $printRet.setLine($p.getLine());
    } RPAR;

//todo
methodCallStmt returns[MethodCallStmt methRet]
    locals [Expression emstm, MethodCall mcallexp]:
    acexp = accessExpression{
        $emstm = $acexp.accessExpRet;
    } (DOT (init = INITIALIZE{
        $emstm = new ObjectMemberAccess($emstm, new Identifier($init.toString()));
    } | i = identifier{
        $emstm = new ObjectMemberAccess($emstm, new Identifier($i.idRet.toString()));
    }))*
    ((lp = LPAR mag = methodArgs{
        $mcallexp = new MethodCall($emstm, $mag.methodCallArgsRet);
        $mcallexp.setLine($lp.getLine());
    } RPAR) {
        $methRet = new MethodCallStmt($mcallexp);
        $methRet.setLine($lp.getLine());
    }| ((INC | DEC)));

//todo done
returnStatement returns[ReturnStmt returnStmtRet]:
    r=RETURN
    {
        $returnStmtRet = new ReturnStmt();
        $returnStmtRet.setLine($r.getLine());
    }(e=expression
         { $returnStmtRet.setReturnedExpr($e.expRet); }
         )?
         {
             if($returnStmtRet.getReturnedExpr() instanceof NullValue) {
                 NullValue newNullValue = new NullValue();
                 newNullValue.setLine($r.getLine());
                 $returnStmtRet.setReturnedExpr(newNullValue);
             }
         };

//todo done
assignmentStatement returns[AssignmentStmt assignmentRet]:
    fexp = orExpression a = ASSIGN sexp = expression
    {
        $assignmentRet = new AssignmentStmt($fexp.orExprRet, $sexp.expRet);
        $assignmentRet.setLine($a.getLine());
    };

//todo bdone
loopStatement returns[EachStmt loopRet]
    locals [Expression re]:
    ((ae = accessExpression {
        $re = $ae.accessExpRet;
        $re.setLine($ae.accessExpRet.getLine());})
    | (lp=LPAR lex = expression DOT DOT rex = expression RPAR{
        $re = new RangeExpression($lex.expRet, $rex.expRet);
        $re.setLine($lp.getLine());}))
    DOT each=EACH DO BAR id=identifier BAR b=body{
        $loopRet = new EachStmt($id.idRet, $re);
        $loopRet.setBody($b.statementRet);
        $loopRet.setLine($each.getLine());}
   ;


//todo done
expression returns [Expression expRet]
    :
    trexp = ternaryExpression
     { $expRet = $trexp.trExpRet ;}
     (assign = ASSIGN exp = expression {
        BinaryOperator op = BinaryOperator.assign;
        $expRet = new BinaryExpression($expRet, $exp.expRet, op);
        $expRet.setLine($assign.getLine());
        }
     )? (dot = DOT inc=INCLUDE LPAR oe=orExpression RPAR{
        $expRet = new SetInclude($expRet, $oe.orExprRet);
        $expRet.setLine($dot.getLine());
     })?;

//todo done
ternaryExpression returns [Expression trExpRet]:
    orexp = orExpression
     { $trExpRet = $orexp.orExprRet; }
     (tif = TIF trexp = ternaryExpression TELSE trexpl = ternaryExpression{
        TernaryOperator op = TernaryOperator.ternary;
        $trExpRet = new TernaryExpression($trExpRet, $trexp.trExpRet, $trexpl.trExpRet);
        $trExpRet.setLine($tif.getLine());
     })?;

//todo done
orExpression returns [Expression orExprRet]:
    andexp = andExpression
    { $orExprRet = $andexp.andExpRet; }
    (o = OR andexp=andExpression
    {
        BinaryOperator op = BinaryOperator.or;
        $orExprRet = new BinaryExpression($orExprRet, $andexp.andExpRet, op);
        $orExprRet.setLine($o.getLine());
    })*;

//todo done
andExpression returns [Expression andExpRet]
    :
    eqexp = equalityExpression
    { $andExpRet = $eqexp.eqExpRet ;}
    (and = AND expr = equalityExpression{
        BinaryOperator op = BinaryOperator.and;
        $andExpRet = new BinaryExpression($andExpRet, $expr.eqExpRet, op);
        $andExpRet.setLine($and.getLine());
    })*;

//todo done
equalityExpression returns [Expression eqExpRet]
    :
    reexp = relationalExpression
     { $eqExpRet = $reexp.relExprRet; }
     (eq = EQUAL expr = relationalExpression{
        BinaryOperator op = BinaryOperator.eq;
        $eqExpRet = new BinaryExpression($eqExpRet, $expr.relExprRet, op);
        $eqExpRet.setLine($eq.getLine());
     })*;

//todo done
relationalExpression returns [Expression relExprRet]
    locals[BinaryOperator op, int line]:
    adtexpf=additiveExpression
        { $relExprRet = $adtexpf.addExpRet; }
        ((gt=GREATER_THAN{
            $op = BinaryOperator.gt;
            $line = $gt.getLine();
        }
        | lt=LESS_THAN{
            $op = BinaryOperator.lt;
            $line = $lt.getLine();
        }
        ) adtexps=additiveExpression{
            $relExprRet = new BinaryExpression($relExprRet, $adtexps.addExpRet, $op);
            $relExprRet.setLine($line);
        })*;


//todo done
additiveExpression returns [Expression addExpRet]
     locals[BinaryOperator op, int line]:
     mel = multiplicativeExpression
     { $addExpRet = $mel.exp; }
     ((add=PLUS{
         $op = BinaryOperator.add;
         $line = $add.getLine();
     }
     | sub=MINUS{
         $op = BinaryOperator.sub;
         $line = $sub.getLine();
     }
     ) mer=multiplicativeExpression{
         $addExpRet = new BinaryExpression($addExpRet, $mer.exp, $op);
         $addExpRet.setLine($line);
     })*;

//todo done
multiplicativeExpression returns[Expression exp]
    locals[BinaryOperator op, int line]:
    pel=preUnaryExpression
    { $exp = $pel.preUExpRet; }
    ((mult = MULT{
         $op = BinaryOperator.mult;
         $line = $mult.getLine();
    }
    | div=DIVIDE{
         $op = BinaryOperator.div;
         $line = $div.getLine();
    }
//c
    ) per = preUnaryExpression{
         $exp = new BinaryExpression($exp, $per.preUExpRet, $op);
         $exp.setLine($line);
    })*;

//todo done
preUnaryExpression returns[Expression preUExpRet]
    locals[UnaryOperator op, int line]:
    (not=NOT{
        $op = UnaryOperator.not;
        $line = $not.getLine();
    }
    | minus=MINUS{
        $op = UnaryOperator.minus;
        $line = $minus.getLine();
    }
    ) pre = preUnaryExpression {
        $preUExpRet = new UnaryExpression($pre.preUExpRet, $op);
        $preUExpRet.setLine($line);
    }
    | post = postUnaryExpression
    { $preUExpRet = $post.postUExpRet; }
    ;


//todo done
postUnaryExpression returns[Expression postUExpRet]:
        ae = accessExpression
        { $postUExpRet = $ae.accessExpRet; }
        (postinc = INC{
            UnaryOperator op = UnaryOperator.postinc;
            $postUExpRet = new UnaryExpression($postUExpRet, op);
            $postUExpRet.setLine($postinc.getLine());
        }
        | postdec = DEC{
            UnaryOperator op = UnaryOperator.postdec;
            $postUExpRet = new UnaryExpression($postUExpRet, op);
            $postUExpRet.setLine($postdec.getLine());
        })?;

//todo bdone d
accessExpression returns[Expression accessExpRet]:
    oe=otherExpression
    { $accessExpRet = $oe.otherExprRet; }
    ((l=LPAR m=methodArgs
    {
        if($accessExpRet instanceof NewClassInstance)
            ((NewClassInstance) $accessExpRet).setArgs($m.methodCallArgsRet);
        else{
            $accessExpRet = new MethodCall($accessExpRet, $m.methodCallArgsRet);
            $accessExpRet.setLine($l.line);
        }
    }
    RPAR)
    | (dot = DOT ( i = identifier {
        $accessExpRet = new ObjectMemberAccess($accessExpRet, $i.idRet);
        $accessExpRet.setLine($dot.getLine());
    }| n = NEW {
        $accessExpRet = new NewClassInstance(new ClassType((Identifier) $accessExpRet));
        $accessExpRet.setLine($n.getLine());
    }| INITIALIZE)))*

    ((dt = DOT i=identifier){
         $accessExpRet = new ObjectMemberAccess($accessExpRet, $i.idRet);
         $accessExpRet.setLine($dt.getLine());
    }
    | (l=LBRACK index=expression RBRACK){
         $accessExpRet = new ArrayAccessByIndex($accessExpRet, $index.expRet);
         $accessExpRet.setLine($l.getLine());
    })*;

//todo done
otherExpression returns [Expression otherExprRet]
    :
    s = SELF{
        $otherExprRet = new SelfClass();
        $otherExprRet.setLine($s.getLine());
    }
    | ci = class_identifier { $otherExprRet = $ci.idRet; }
    | val = value { $otherExprRet = $val.valuesRet; }
    | id = identifier { $otherExprRet = $id.idRet; }
    | sn = setNew { $otherExprRet =  $sn.setNewRet; }
    | LPAR (exp = expression) RPAR { $otherExprRet = $exp.expRet; }
    ;

//todo done
setNew returns[Expression setNewRet]
    locals [ArrayList<Expression> args]:
    { $args = new ArrayList<>(); }
    SET DOT n = NEW LPAR (LPAR orexp = orExpression{
        $args.add($orexp.orExprRet);}
    (COMMA orex = orExpression {
        $args.add($orex.orExprRet); }
        )* RPAR)?  RPAR;

//todo done
value returns[Value valuesRet]:
    b=boolValue
    {
        $valuesRet = new BoolValue($b.boolValueRet);
        $valuesRet.setLine($b.line);
    }
    | i=INT_VALUE
    {
        $valuesRet = new IntValue($i.int);
        $valuesRet.setLine($i.getLine());
    }
    ;

//todo don e
boolValue returns[boolean boolValueRet, int line]:

    t=TRUE
    {
        $boolValueRet = (true);
        $line = $t.getLine();
    }
    | f=FALSE
    {
        $boolValueRet = (false);
        $line = $f.getLine();
    };

//todo done
class_identifier returns[Identifier idRet, int line]:
    cid = CLASS_IDENTIFIER{
        $idRet = new Identifier($cid.text);
        $idRet.setLine($cid.getLine());
        $line = $cid.getLine();
    };

//todo done
identifier returns[Identifier idRet, int line]:
    id = IDENTIFIER{
        $idRet = new Identifier($id.text);
        $idRet.setLine($id.getLine());
        $line = $id.getLine();
    };

//todo done
type returns[Type typeRet]:
    INT { $typeRet = new IntType(); }
    | BOOL { $typeRet = new BoolType(); }
    | arr = array_type { $typeRet = $arr.arrTypeRet; }
    | fpt = fptr_type { $typeRet = $fpt.fptrTypeRet; }
    | st = set_type { $typeRet = $st.setTypeRet; }
    | cid = class_identifier { $typeRet = new ClassType($cid.idRet); }
    ;

//todo done
array_type returns[ArrayType arrTypeRet]
    locals [Type t, ArrayList<Expression> df]:
    { $df = new ArrayList<>(); }
    (INT { $t = new IntType(); }
    | BOOL { $t = new BoolType(); }
    | cid = class_identifier { $t = new ClassType($cid.idRet); })
    (LBRACK exp = expression RBRACK{
        $df.add($exp.expRet);
    })+
    { $arrTypeRet = new ArrayType($t, $df);}
    ;

//todo done
fptr_type returns[FptrType fptrTypeRet]
    locals [ArrayList<Type> args, Type _return]:
    FPTR
    {$args = new ArrayList<Type>();}
    LESS_THAN (VOID
    {$args.add(new VoidType());}
    | (t=type
    {$args.add($t.typeRet);}
    (COMMA t=type
    {$args.add($t.typeRet);}
    )*)) ARROW (t=type
    {$_return = $t.typeRet;}
    |
    VOID
    {$_return = new VoidType();}
    ) GREATER_THAN
    {$fptrTypeRet = new FptrType($args, $_return);}
    ;

//todo done
set_type returns [SetType setTypeRet]:
    SET LESS_THAN (INT) GREATER_THAN {
        $setTypeRet = new SetType();
    };


LINE_BREAK: ('//\n') -> skip;

CLASS: 'class';
PUBLIC: 'public';
PRIVATE: 'private';
INITIALIZE: 'initialize';
NEW: 'new';
SELF: 'self';


RETURN: 'return';
VOID: 'void';


DELETE: 'delete';
INCLUDE: 'include';
ADD: 'add';
MERGE: 'merge';
PRINT: 'print';


IF: 'if';
ELSE: 'else';
ELSIF: 'elsif';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';
INC: '++';
DEC: '--';

EQUAL: '==';
GREATER_THAN: '>';
LESS_THAN: '<';

ARROW: '->';
BAR: '|';

AND: '&&';
OR: '||';
NOT: '!';

TIF: '?';
TELSE: ':';

TRUE: 'true';
FALSE: 'false';
NULL: 'null';

BEGIN: '=begin';
END: '=end';

INT: 'int';
BOOL: 'bool';
FPTR: 'fptr';
SET: 'Set';
EACH: 'each';
DO: 'do';

ASSIGN: '=';
SHARP: '#';
LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

COMMA: ',';
DOT: '.';
SEMICOLON: ';' -> skip;
NEWLINE: '\n';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-z_][A-Za-z0-9_]*;
CLASS_IDENTIFIER: [A-Z][A-Za-z0-9_]*;

COMMENT: '#' .*? '\n' -> skip;
MLCOMMENT: ('=begin' .*? '=end') -> skip;
WS: ([ \t\r]) -> skip;
