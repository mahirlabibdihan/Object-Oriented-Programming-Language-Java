class TestClass {
public void f1() {
for (int i = 0; i < 5; i++) {
System.out.println(i);
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
System.out.println(e);
}
}
}
public static void f2() {
for (int i = 0; i < 5; i++) {
System.out.println(i);
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
System.out.println(e);
}
}
}
}