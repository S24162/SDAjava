package pl.sdacademy.java.programowanie.day4;

import java.util.Arrays;

public class HomerWork {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(arrayDuplicateDeleting(20, 20, 30, 40, 50, 50, 50)));
//        System.out.println(isArrayHasSumOfTwoElementsWithIsK(17, 10, 15, 3, 7));
//        System.out.println(caesarCipher("MĘŻNY BĄDŹ, CHROŃ PUŁK TWÓJ I SZEŚĆ FLAG",2));
//                                               OHBÓŻ DĆFĄ, EKTRP ŚZŃM YŹSŁ L UAGWĘ INCJ
//  Ó	ALT 0211
//  Ą	ALT 0260
//  Ć	ALT 0262
//  Ę	ALT 0280
//  Ł	ALT 0321
//  Ń	ALT 0323
//  Ś	ALT 0346
//  Ź	ALT 0377
//  Ż	ALT 0379
//  DZ	ALT 0497
    }

    public static String caesarCipher(String stringIn, int arg) {
        char[] charArrBefore = stringIn.toCharArray();
        int[] intArrBefore = new int[stringIn.length()];
        int[] intArrAfter = new int[stringIn.length()];
        int counter = 0;
        System.out.println(intArrBefore.length + " " + charArrBefore.length);
        for (char i : charArrBefore) {

            intArrBefore[counter] = i;
            System.out.printf("String %3s %3c %4d\n", (int) i, i, intArrBefore[counter]);
            counter++;
        }

        for (int i = 0; i < intArrBefore.length; i++) {
            if (intArrBefore[i] > 64 && intArrBefore[i] < 89) {
                intArrAfter[i] = intArrBefore[i] + arg;
            }
        }
        System.out.println();
        for (int i : intArrBefore) {
            System.out.print((char) i);
        }
        System.out.println();
        for (int i : intArrAfter) {
            System.out.print((char) i);
        }
        System.out.println();
        System.out.println("OHBÓŻ DĆFĄ, EKTRP ŚZŃM YŹSŁ L UAGWĘ INCJ");

        return "";
    }

    public static boolean isArrayHasSumOfTwoElementsWithIsK(int k, int... arrIn) {
        for (int i = 0; i < arrIn.length; i++) {
            for (int j = i + 1; j < arrIn.length; j++) {
                if (arrIn[i] + arrIn[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }


    public static int[] arrayDuplicateDeleting(int... arrayIn) {

        int[] resultArr = new int[1];
        resultArr[0] = arrayIn[0];

        for (int i : arrayIn) {
            boolean sameness = false;
            for (int j = 0; j < resultArr.length; j++) {
                if (i == resultArr[j]) {
                    sameness = true;
                    break;
                }
            }
            if (!sameness)
                resultArr = resultArrAdd(i, resultArr);
        }

        return resultArr;
    }

    public static int[] resultArrAdd(int numberToAdd, int[] oldArr) {

        int[] newArr = Arrays.copyOf(oldArr, oldArr.length + 1);
        newArr[newArr.length - 1] = numberToAdd;

        return newArr;
    }
}
