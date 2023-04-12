package pl.sdacademy.java.advancedPrograming.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CW1 {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("C");
        arr.add("b");
        arr.add("Z");
        arr.add("D");
        System.out.println(stringListSort(arr));
        System.out.println(stringListSort_CASE_INSENSITIVE_ORDER(arr));
    }

    public static List<String> stringListSort(List<String> arr) {
        arr.sort(Collections.reverseOrder());
        Collections.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static List<String> stringListSort_CASE_INSENSITIVE_ORDER(List<String> arr) {
//        arr.sort(String.CASE_INSENSITIVE_ORDER);
        arr.sort(Collections.reverseOrder(String::compareToIgnoreCase));
        return arr;
    }
}
