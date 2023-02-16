package pl.sdacademy.java.programowanie.day4;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.*;

public class Main {
    public static void main(String[] args) {
        ex10(1331);
    }

    public static void ex10(int positiveNumber) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        int sum = 0;
        String numberInString = Integer.toString(positiveNumber);
        for (int i =0; i<numberInString.length(); i++)
            sum += getNumericValue(numberInString.charAt(i));
        System.out.println(sum);
        sum=0;
        int nextNumber = positiveNumber;
        for (int i =0; i<Integer.toString(positiveNumber).length(); i++){
            sum += nextNumber%10;
            nextNumber /=10;
        }
        System.out.println(sum);
    }
}
