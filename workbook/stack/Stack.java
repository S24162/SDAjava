package pl.sdacademy.java.workbook.stack;

import java.util.Arrays;

public class Stack {
   private Integer[] arr;

    public Stack(int count) {
        arr = new Integer[count];
    }

    public void push(Integer e) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = e;
                break;
            }
        }
    }

    public Integer pop() {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != null) {
                Integer ret = arr[i];
                arr[i] = null;
                return ret;
            }
        }
        return null;
    }
    public boolean isEmpty() {
        return arr[0] == null;
    }
    public boolean isFull() {
        return arr[arr.length-1] != null;
    }
    public String toString() {
        String result = Arrays.toString(arr);
            return result;
    }

    public static void main(String[] args) {
        Stack a = new Stack(3);
        System.out.println(a.isEmpty());
        a.push(0);
        a.push(1);
        a.push(1);
        System.out.println(Arrays.toString(a.arr));
        System.out.println(a.pop());
        a.push(1);
        System.out.println(Arrays.toString(a.arr));
        System.out.println(a.isEmpty());
        System.out.println(a.isFull());
        System.out.println(a.toString());
    }
}
