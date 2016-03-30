.class public Vardec
.super java/lang/Object

.method public <init>()V
  aload_0
  invokenonvirtual java/lang/Object/<init>()V
  return
.end method

.method public static main([Ljava/lang/String;)V
  .limit stack 10
  .limit locals 10
  
  ; lets make a variable x in register 0
  ; lets make it equal to 100
  ldc 100
  istore 0
  ; lets print it out now
  getstatic java/lang/System/out Ljava/io/PrintStream;
  ldc "x = "
  invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
  ; lets print out the value now
  ; push the method onto the stack
  getstatic java/lang/System/out Ljava/io/PrintStream;
  ; push the number onto the stack
  iload 0
  ; now invoke the method
  invokevirtual java/io/PrintStream/print(I)V
  return
.end method
