package pl.sdacademy.java.programowanie.day3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        cw7Fibonacci(12);
//        System.out.println(Integer.MAX_VALUE + " is max integer value");
//        prePostIncrementation();
//        calcFourOperation();
//        treesDrawing(5);
    }

    public static void treesDrawing (int number){
        System.out.println("*      *".repeat(number));
        System.out.println(" *    * ".repeat(number));
        System.out.println("  *  *  ".repeat(number));
        System.out.println("   **   ".repeat(number));
    }

    public static float calcFourOperation() {
        System.out.print(" Give me first number : ");
        float x = numberIn();
        System.out.print(" Operation : ");
        byte sign = mathSignIn();
        System.out.print(" Give me second number : ");
        float y = numberIn();
        float res = 0;

        if ( y == 0 && sign == 4 )
            System.out.println(" Division by zero is not possible. Fine ");

        switch (sign) {
            case 1 -> res = x+y;
            case 2 -> res = x-y;
            case 3 -> res = x*y;
            case 4 -> res = x/y;
            case 0 -> System.out.println(" Sign must be +,-,*,/ . Wrong sign was given. ");
        }
        System.out.println("Result is : " + res);
        return res;
    }

    public static float numberIn() {
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }

    public static byte mathSignIn() {
        Scanner sc = new Scanner(System.in);
        char sign = sc.next().charAt(0);
        return switch (sign) {
            case '+' -> 1;
            case '-' -> 2;
            case '*' -> 3;
            case '/' -> 4;
            default -> 0;
        };
    }

    public static void cw7Fibonacci(int indexOfFibonacci) {
        int num1 = 1;
        int num2 = 1;
        System.out.print(num1+" "+num2+" ");
        int x = 0;
        for (int i = 2 ; i < indexOfFibonacci ; i++) {
            x = num1 + num2;
            num1 = num2;
            num2 = x;
            System.out.print(x+" ");
        }
        System.out.println("\nSo, answer is " + x);
    }

    public static void prePostIncrementation(){
        int i = 0;
        System.out.println(++i);
        i = 0;
        System.out.println(i++);
        System.out.println(i);
    }
}
