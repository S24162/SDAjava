package pl.sdacademy.java.basic;

import java.util.Arrays;

public class HomerWork2Loops {
    public static void main() {
        System.out.println("Playing Home2Loops.main" + "\n");

//        arithmeticSequence(5, 3);
//        System.out.println(power(3, 3));
//        System.out.println(factorialRecursion(3));

//        System.out.println(Arrays.toString(arithmeticSequenceArray(5, 3)));
//        System.out.println(Arrays.toString(primeNumbers(5)));
//        System.out.println(min( 1,0 ,23,-3,8,2,18,3));
//        double[] aar = new double[]{3.0, 5.5};
//        System.out.println(average(aar));
        int[] arr1 = new int[]{3,4,5,2};
//        printEvens(arr1);
//        System.out.println(Arrays.toString(revert(arr1)));
//        System.out.println(Arrays.toString(onlyEvens(arr1)));

    }

    public static int[] onlyEvens(int[] numbers) {
        int n = 0;
        for (int i : numbers)
            if (i%2==0)
                n++;

        int[] result = new int[n];
        int j = 0;

        for ( int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0) {
                result[j]=numbers[i];
                j++;
            }
        }
        return result;
    }

    public static int[] revert(int[] numbers) {
        int[] result = new int[numbers.length];
            int j = numbers.length-1;
            for ( int i : numbers) {
                result[j] =i;
                j--;
            }
        return result;
    }

    public static void printEvens(int[] numbers) {
        for (int i : numbers) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static double average(double[] numbers) {
        double sum=0;
        for (int i=0; i< numbers.length;i++){
            sum = sum + numbers[(int) i];
        }
        return sum/numbers.length;
    }

    public static int min(int... numbers) {
        System.out.println(Arrays.toString(numbers));
        int min=numbers[0];
        for (int i=1; i < numbers.length; i++) {
            if (numbers[i]> min)
                min = numbers[i];
        }

        return min;
    }

    public static long[] primeNumbers(int n) {
        long[] arr=new long[n];
        int primes = 0;
        for (int checkedValue = 1; primes < n; checkedValue++) {
            if (Loops.isPrime(checkedValue)) {
                arr[primes] = checkedValue;
                primes++;
            }
        }
        return arr;
    }

    public static int[] arithmeticSequenceArray(int n, int difference) {
        int[] arr = new int[n];
        int i = 0;
        int x = 1;
        while (i<n) {
            arr[i] = x;
            x = x+ difference;
            i++;
        }
        return arr;
    }

    public static long factorialRecursion(int x) {
        if (x < 2)
            return x;
        return x * factorialRecursion(x-1);
    }

    public static long power(int x, int exponent) {
        return (long) Math.pow(x,exponent);
    }

    public static void arithmeticSequence(int n, int difference) {
        int i = 1;
        int x = 1;
        while (i <= n) {
            System.out.println(x);
            x = x + difference;
            i++;
        }
    }
}
