package pl.sdacademy.java.basicPrograming.day2;

public class Main {
    public static void main(String[] args) {
//        cw4(42);
//        cw5(100);
//        cw6(4);
//        powerOut(5, 6);
    }

    public static void cw4(int a) {
        if (a < 0)
            System.out.println("Wrong number");
        else for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 && i % 7 == 0)
                System.out.println("Pif Paf ");
            else if (i % 3 == 0)
                System.out.println("Pif ");
            else if (i % 7 == 0)
                System.out.println("Paf ");
            else
                System.out.println(i + " ");
        }
        System.out.println("-----------------");

        StringBuilder outputText = new StringBuilder();

        for (int i = 1; i <= a; i++) {

            outputText.setLength(0);

            if (i % 3 == 0 || i % 7 == 0) {
                if (i % 3 == 0) outputText.append("Pif ");
                if (i % 7 == 0) outputText.append("Paf ");
            } else outputText.append(i);

            System.out.println(outputText);
        }
    }

    public static void cw5(int a) {
        int totalNumber = 0;
        for (int i = 2; i < a; i++) {
            boolean counter = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0)
                    counter = false;
            }
            if (counter) {
                System.out.println(i);
                totalNumber++;
            }
        }
        System.out.println("Total is " + totalNumber);
    }

    public static void cw6(int x) {
        double res = 1;
        for (int i = 2; i <= x; i++) {
            res += 1d / i;
        }
        System.out.printf("%3.2f\n", res);
    }

    public static void powerOut(int a, int n) {
        int x = a;
        for (int i = 1; i < n; i++) {
            x = powerInside(x,a);
            System.out.println(" Do "+ i + " Returned : " + x);
        }
        System.out.println(x);
        System.out.println("-----------------");
        System.out.println(power( a, n));
    }

    public static int powerInside(int in, int a) {
        int res = 0;
        for (int i = 0; i < a; i++) {
            res += in;
            System.out.print(in +"+");
        }
        return res;
    }

    public static int power(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = multiply(a, result);
//            System.out.println(result);
        }
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a;
        for (int i = 1; i < b; i++) {
            result += a;
        }
        return result;
    }
}
