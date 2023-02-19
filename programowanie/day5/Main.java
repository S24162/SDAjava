package pl.sdacademy.java.programowanie.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        cw15();
        cw16(1, 3, 8, 4, 2, 5, 6, 11, 13, 14);
    }

    public static void cw16(int... arr) {
        int count = 0;
        int countA = 1;
        int i = 0;

        while (i < arr.length - 1) {
            if (arr[i] < arr[i + 1]) {
                countA++;
            } else {
                if (count<countA)
                    count = countA;
                countA = 1;
            }
            i++;
        }

        if (countA>count)
            count = countA;

        System.out.println(count);
    }

    public static void cw15() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] resultArr = new int[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        FIRST : for (int i = 0; i < arr.length; i++) {
            SECOND : for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    resultArr = check(arr[i], resultArr);
                }
            }
        }
        for (int i : resultArr) {
            System.out.println(i);
        }
    }

    public static int[] check(int x, int[] checkedArr) {
        Arrays.sort(checkedArr);
        boolean isNotRepeate = true;
        int[] resultArr;
        for (int j : checkedArr) {
            if (j == x) {
                isNotRepeate = false;
                break;
            }
        }
        if (isNotRepeate) {
            resultArr = Arrays.copyOf(checkedArr, checkedArr.length + 1);
            resultArr[resultArr.length - 1] = x;
            return resultArr;
        }
        return checkedArr;
    }
}
