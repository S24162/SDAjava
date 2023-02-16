package pl.sdacademy.java.workbook.calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return add(add(a, b), c);
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return subtract(subtract(a, b), c);
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return multiply(multiply(a, b), c);
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int divide(int a, int b, int c) {
        return divide(divide(a, b), c);
    }

    public boolean isPositive(int a) {
        return a >= 0;
    }

    public boolean isNegative(int a) {
        return a < 0;
    }

    public boolean isOdd(int a) {
        return a % 2 != 0;
    }

    public int min(int a, int b) {
        return Math.min(a, b);
    }

    public int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public double average(int a, int b) {
        return ((double) a + (double) b) / 2;
    }

    public double average(int a, int b, int c) {
        return ((double) a + b + c) / 3;
    }

    public int power(int a, int m) {
        return (int) Math.pow(a, m);
    }
}
