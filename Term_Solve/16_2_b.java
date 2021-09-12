interface A {
default void f() {
System.out.println("A's f");
}
}

interface B {
default void f(){
System.out.println("B's f");
}
}

public class C implements A, B {
}