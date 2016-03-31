.class public SimpleStuff
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 10
ldc 10
istore 0
ldc 10
istore 1
ldc 0
istore 2
ldc 3
istore 3
loop0:
getstatic java/lang/System/out Ljava/io/PrintStream;
; load the variable from the register
iload 0
invokevirtual java/io/PrintStream/print(I)V
 ; print a space inbetween each result
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
; Print the value
getstatic java/lang/System/out Ljava/io/PrintStream;
; load the variable from the register
iload 1
ldc 1
iadd
invokevirtual java/io/PrintStream/print(I)V
; newline after a statement
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
; load the variable from the register
iload 0
ldc 1
iadd
istore 0
; load the variable from the register
iload 1
; load the variable from the register
iload 0
isub
istore 1
ldc 0
istore 4
ldc 3
istore 5
loop1:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 10
invokevirtual java/io/PrintStream/print(I)V
 ; print a space inbetween each result
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
; Print the value
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 20
invokevirtual java/io/PrintStream/print(I)V
; newline after a statement
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "\n"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
iinc 4 1
iload 4
iload 5
if_icmplt loop1
iinc 2 1
iload 2
iload 3
if_icmplt loop0
return
.end method
