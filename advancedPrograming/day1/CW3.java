package pl.sdacademy.java.advancedPrograming.day1;

import java.util.HashMap;
import java.util.Map;

public class CW3 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Java",18);
        map.put("Python",1);
        map.put("PHP",0);
        System.out.println(map.get("Java"));
        toString(map);
    }

    public static void toString(Map<String,Integer> map) {

    }
}
