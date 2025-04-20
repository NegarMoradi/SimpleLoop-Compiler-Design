.class public Main
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
.end method
.method public <init>()V
.limit stack 128
.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		aconst_null
		astore 3
		ldc 0
		istore 4
	Label_2:
		iload 4
		new Array
		dup
		ldc 0
		ldc 9
		invokespecial Array/<init>(II)V
		getfield Array/elements Ljava/util/ArrayList;
		invokevirtual java/util/ArrayList/size()I
		if_icmpge Label_1
		new Array
		dup
		ldc 0
		ldc 9
		invokespecial Array/<init>(II)V
		iload 4
		invokevirtual Array/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		astore 1
		ldc 0
		istore 5
	Label_5:
		iload 5
		new Array
		dup
		ldc 0
		aload 1
		invokevirtual java/lang/Integer/intValue()Iinvokespecial Array/<init>(II)V
		getfield Array/elements Ljava/util/ArrayList;
		invokevirtual java/util/ArrayList/size()I
		if_icmpge Label_4
		new Array
		dup
		ldc 0
		aload 1
		invokevirtual java/lang/Integer/intValue()Iinvokespecial Array/<init>(II)V
		iload 5
		invokevirtual Array/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		astore 2
		; Print Statement 25
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		; Print Statement 26
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		;Assign Statement
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		
		iadd
		dup ; keep value on stack
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		pop
	Label_3:
		iload 5
		ldc 1
		iadd
		istore 5
		goto Label_5
	Label_4:
		;Assign Statement
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		
		iadd
		dup ; keep value on stack
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		pop
	Label_0:
		iload 4
		ldc 1
		iadd
		istore 4
		goto Label_2
	Label_1:
		; Print Statement 31
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3 ; object field access
		getfield A/a Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		;Assign Statement
		aload 3
		dup ; to getfield for putting back on stack
		aload 3 ; object field access
		getfield A/a Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield A/a Ljava/lang/Integer;
		getfield A/a Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		; Print Statement 33
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3 ; object field access
		getfield A/a Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		;Assign Statement
		aload 3
		dup ; to getfield for putting back on stack
		aload 3 ; object field access
		getfield A/a Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield A/a Ljava/lang/Integer;
		getfield A/a Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		;Assign Statement
		aload 3 ; object field access
		getfield A/a Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		
		iadd
		dup ; keep value on stack
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		pop
		; Print Statement 36
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3 ; object field access
		getfield A/a Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		; Print Statement 37
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		; Print Statement 39
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3 ; object field access
		getfield A/b LB; ; object field access
		getfield B/b Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		;Assign Statement
		aload 3 ; object field access
		getfield A/b LB;
		dup ; to getfield for putting back on stack
		aload 3 ; object field access
		getfield A/b LB; ; object field access
		getfield B/b Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield B/b Ljava/lang/Integer;
		getfield B/b Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		; Print Statement 41
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3 ; object field access
		getfield A/b LB; ; object field access
		getfield B/b Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		; Print Statement 42
		getstatic java/lang/System/out Ljava/io/PrintStream;
		
		new Fptr ;object method access
		dup
		aload_0
		ldc "foo"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V ;methodCall
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		aload 3 ; object field access
		getfield A/b LB;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		return
.end method
.method public foo(LB;)Ljava/lang/Integer;
.limit stack 128
.limit locals 128
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		;Assign Statement
		aload 1
		dup ; to getfield for putting back on stack
		ldc 10
		
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield B/b Ljava/lang/Integer;
		getfield B/b Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		ldc 0
		istore 3
	Label_2:
		iload 3
		new Array
		dup
		ldc 10
		ldc 17
		invokespecial Array/<init>(II)V
		getfield Array/elements Ljava/util/ArrayList;
		invokevirtual java/util/ArrayList/size()I
		if_icmpge Label_1
		new Array
		dup
		ldc 10
		ldc 17
		invokespecial Array/<init>(II)V
		iload 3
		invokevirtual Array/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		astore 1
		;Assign Statement
		aload 1
		dup ; to getfield for putting back on stack
		aload 1 ; object field access
		getfield B/b Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield B/b Ljava/lang/Integer;
		getfield B/b Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
	Label_0:
		iload 3
		ldc 1
		iadd
		istore 3
		goto Label_2
	Label_1:
		; Print Statement 16
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1 ; object field access
		getfield B/b Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		return
.end method
