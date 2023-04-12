package pl.sdacademy.java.tests;

import java.lang.reflect.Array;
import java.util.Arrays;


public class FindFirstLetterInString {
    public static void main(String[] args) {
        System.out.println(FindFirstLetterInString.play("BACDGBAF","B"));
    }

    public static String play(String sentence, String letterToFind) {

        char[] arr = sentence.toCharArray();

            for (char c : arr) {
                if (letterToFind.charAt(0) == c)
                    return String.valueOf(c);
            }
        return null;
    }

}
