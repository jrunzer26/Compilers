.class public Forloop
.super java/lang/Object

.method public <init>()V
  aload_0
  invokenonvirtual java/lang/Object/<init>()V
  return
.end method

.method public static main([Ljava/lang/String;)V
  .limit stack 10
  .limit locals 10
  ; for (int i = 0; i < x; i++) {
  ;   print "i = " + i
  ; }

  ; declare a variable i in register 0 starting at value 0
  ldc 0
  istore 0
  ; declare a variable x in register 1 at a random value
  ldc 5
  istore 1
  ; now lets make a branch number 1 and branch to it
  ; if  i < x
loop1:
  ; lets do the print statement/ body
  getstatic java/lang/System/out Ljava/io/PrintStream;
  ldc "i = "
  invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
  getstatic java/lang/System/out Ljava/io/PrintStream;
  ; push the number onto the stack
  iload 0
  ; now invoke the method
  invokevirtual java/io/PrintStream/println(I)V
  ; lets increment i so then it's not in an infinite loop
  iinc 0 1
  ; load i and x onto the stack
  iload 0
  iload 1
  ; compare i < x
  if_icmplt loop1
  return
.end method
