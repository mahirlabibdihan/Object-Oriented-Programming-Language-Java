class X {
    int a=10;
    X() {
        System.out.println("Inside X's constructor");
    }
}

class Y extends X {
    int a;
    Y() {
        System.out.println(super.a);
    }
}

class Z extends Y {
    int c;
    Z() {
        System.out.println("Inside Z's constructor");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Z z = new Z();
        z.a = 10;
        z.a = 20;
        z.c = 30;
    }
}
