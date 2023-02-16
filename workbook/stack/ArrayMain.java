package pl.sdacademy.java.workbook.stack;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {

        IntArray a = new IntArray();
        System.out.println(Arrays.toString(a.getArr()));
        a.add(13,4);
        System.out.println(Arrays.toString(a.getArr()));
        System.out.println(a.get(5));
        a.remove(4);
        System.out.println(a);
        a.add(3,3);
        a.add(4,4);
        System.out.println(a);
        a.swap(1,4);
        System.out.println(a);

    }
}
