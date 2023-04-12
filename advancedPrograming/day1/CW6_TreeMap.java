package pl.sdacademy.java.advancedPrograming.day1;

import java.util.TreeMap;

public class CW6_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1,"aaa");
        map.put(3,"ccc");
        map.put(2,"bbb");
        treeMap(map);
    }

    public static void treeMap(TreeMap<Integer,String> map) {
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
    }
}
