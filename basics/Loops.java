package pl.sdacademy.java.basics;

import java.util.ArrayList;
import java.util.Arrays;

public class Loops {
    //    public static void copy() {}
    public static void main() {
        System.out.println("    Main.main playing Loops.main" + "\n");

//        isDivisible(17, 3);
//        System.out.println(26 + " : " + isPrime(26));
//        System.out.println(31 + " : " + isPrime(31));
//        printPrimeNumbers(10);
//        printAllowedHeights(199, 251);
//        array();
//        arraysExample();
//        numbersArr();
//        numbersArr2();
//        System.out.println(Arrays.toString(sort(stringSort)));


    }

    public static void numbersArr2() {

        int[][] emptyArrayTwoDimension = new int[2][4];
        int[][] arrayTwoDimension = new int[][]{
                new int[]{},
                new int[]{4, 20, 30, 45, 3, 8, 32, 10, 1},
                new int[]{7, 5, 3, 1, -2, -4, -6}
        };
        String[] stringSort = new String[]{"a", "f", "c", "ba "};
    }

    public static void sort(String[] strings) {
        for (int j = 0; j < strings.length; j++) {

            int iMin = j;

            for (int i = j; i < strings.length; i++) {
                if (strings[i].compareTo(strings[iMin]) < 0) {
                    iMin = i;
                }
            }
            String min = strings[iMin];
            strings[iMin] = strings[j];
            strings[j] = min;
        }
    }

    public static void numbersArr() {
        int[] numbers = new int[]{4, 20, 30, 45, 3, 8, 32, 10, 1};
        System.out.println(Arrays.toString(numbers));
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] numbers) {
        for (int j = 0; j < numbers.length; j++) {

            int iMin = j;

            for (int i = j; i < numbers.length; i++) {
                if (numbers[i] < numbers[iMin]) {
                    iMin = i;
                }
            }
            int min = numbers[iMin];
            numbers[iMin] = numbers[j];
            numbers[j] = min;
        }
    }


    public static void arraysExample() {
        double[] values = new double[3];
        values[0] = 2.5;
        values[1] = 3.5;
        values[2] = 6.2;
        System.out.println(sum(values));
    }

    public static double sum(double[] values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }

    public static void array() {
//        int integers[]; // poprawnie , ale tak nie piszemy
        int[] someIntegers;
        double[] someDoubles;
        String[] someString;
//        byte[] someBytes;

        someIntegers = new int[5];
        someIntegers[0] = 1;
        someIntegers[1] = 2;
        someIntegers[2] = 3;
        someIntegers[3] = 5;
        someIntegers[4] = 7;

        System.out.println(Arrays.toString(someIntegers));

        for (int i = 0; i < someIntegers.length; i++) {
            System.out.println(someIntegers[i]);
        }
    }

    public static void printAllowedHeights(int from, int to) {

        for (int checkedVal = from; checkedVal <= to; checkedVal++) {
            if (checkedVal % 5 == 0) {
                System.out.println(checkedVal);
            }
        }
    }

    public static void printPrimeNumbers(int count) {
        int primes = 0;
        for (int checkedValue = 1; primes < count; checkedValue++) {
            if (isPrime(checkedValue)) {
                System.out.println(checkedValue);
                primes++;
            }
        }
    }

    public static boolean isDivisible(int value, int divider) {
//        System.out.println(value % divider);
//        System.out.println(value % divider == 0);
        return value % divider == 0;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < (number / 2) + 1; i++) {
            if (isDivisible(number, i)) {
                return false;
            }
        }
        return true;
    }

}
