package pl.sdacademy.java.basics;

public class Scopes {
    public static final int CONST = 5;

    public static void main() {
        System.out.println("Plaing Scopes.main");
        method1();
        method2();
    }

    public static void method1() {
        System.out.println(CONST);
        int x = 1;

        System.out.println(x);

        if (x > 0) {
            int y = 2;
            System.out.println(x + " x if");
            System.out.println(y + " y if");
        }
    }

    public static void method2() {
        int x = 2;
        System.out.println(x);
    }
}
