package pl.sdacademy.java.workbook.stack;

import java.util.Arrays;

public class IntArray {
    private Integer[] arr;

    public IntArray() {
        arr = new Integer[2];
    }

    public Integer[] getArr () {
       return arr;
    }

    public void add(Integer value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length - 1] == null) {
                if (arr[i] == null) {
                    arr[i] = value;
                    break;
                }
            } else {
                arr = Arrays.copyOf(arr, arr.length*2);
                if (arr[arr.length - 1] != null) {
                    if (arr[i] == null) {
                        arr[i] = value;
                        break;
                    }
                }
            }
        }
    }

    public void add(Integer value, int idx) {
        while (idx > arr.length)
            arr = Arrays.copyOf(arr, arr.length*2);
        arr[idx-1] = value;
    }

    public Integer get(int idx) {
        if (idx <= arr.length)
        return arr[idx-1];
        else return null;
    }

    public void remove(int idx) {
        if (idx <= arr.length)
            arr[idx-1] = null;
    }

    public void swap(int from, int to) {
        Integer t = arr[to-1];
        arr[to-1]=arr[from-1];
        arr[from-1]=t;
    }

    public String toString() {
        String result = Arrays.toString(arr);
        return result;
    }

}
