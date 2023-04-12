package pl.sdacademy.java.advancedPrograming.day4.Ex28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MyArrayList<E> extends ArrayList<E> {
    public MyArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public MyArrayList() {
    }

    public MyArrayList(Collection<? extends E> c) {
        super(c);
    }

    List<E> getEveryNthElement(int starIndex, int skip) {
        List<E> result = new MyArrayList<>();
        for (int i = starIndex; i < this.size(); i += skip + 1) {
            result.add(this.get(i));
        }
        return result;
    }


    public static void main(String[] args) {
        MyArrayList<String> arr = new MyArrayList<>(Arrays.asList("a","b","c","d","e","f","g"));
        System.out.println(arr.getEveryNthElement(2, 3));
    }
}
