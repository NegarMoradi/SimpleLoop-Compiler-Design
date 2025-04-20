.class public A
.super java/lang/Object
.field a Ljava/lang/Integer;
.field b LB;
.method public <init>()V
.limit stack 128
.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		aload_0
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield A/a Ljava/lang/Integer;
		aload_0
		aconst_null
		putfield A/b LB;
		return
.end method
