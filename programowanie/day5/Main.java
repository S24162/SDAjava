package pl.sdacademy.java.programowanie.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        cw15();
        cw16(1, 3, 8, 4, 2, 5, 6, 11, 13, 7);
    }

    public static void cw16(int... arr) {
        int count = 0;
        int countA = 0;
        int i = 0;
        while (i < arr.length-1) {
            if (arr[i] < arr[i + 1]) {
                while (arr[i] < arr[i + 1]) {
                    countA++;
                    i++;
                }
            } else {
                i++;
            }
            if (count < countA)
                count = countA;
        }

        System.out.println(count);
    }

    public static void cw15() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] resultArr = new int[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i == j)
                    continue;
                if (arr[i] == arr[j]) {
                    resultArr = check(arr[i], resultArr);
                }
            }
        }
        for (int x = 0; x < resultArr.length; x++) {
            System.out.println(resultArr[x]);
        }
    }

    public static int[] check(int x, int[] checkedArr) {
        boolean a = true;
        int[] b;
        for (int i = 0; i < checkedArr.length; i++) {
            if (checkedArr[i] == x) {
                a = false;
            }
        }
        if (a) {
            b = Arrays.copyOf(checkedArr, checkedArr.length + 1);
            b[b.length - 1] = x;
            return b;
        }
        return checkedArr;
    }
}
