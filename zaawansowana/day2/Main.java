package pl.sdacademy.java.zaawansowana.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        arrayExercise(1, 2, 3, 4, 5);
        arrays();
    }


    public static void arrays() {
        String[][] grid = new String[][]{
                new String[]{"0","1","2"},
                new String[]{"0","1","22"},
                new String[]{"0"}
        };
        System.out.println(grid.length);
        System.out.println(Arrays.toString(grid[1]));

        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        System.out.println(list.toString());
        list.remove("second");
        System.out.println(list.toString());
        list.remove(0);
        System.out.println(list);
        list.toString();


    }

//??????????????????????????????
//    public  void toString() {
//        for (Object index : this){
//            System.out.println(index);
//        }
//    }

    public static float arrayExercise(int... arr) {
        float arrSum = 0;
        int arrMaxValue = Integer.MIN_VALUE;
        int arrMinValue = arr[arr.length-1];

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("every");

        for (int i = arr.length-1; i >= 0;i-=2) {
            System.out.println(arr[i]);

        }
        System.out.println("every second");

        for (int i = arr.length-1; i >= 0; i--) {
            arrSum +=arr[i];
        }

        Maximum_SEARCHING : for (int number : arr) {
            if (arrMaxValue<number){
                arrMaxValue = number;
            }
        }

        for (int i = arr.length-2; i >= 0; i--) {
            if (arrMinValue>arr[i]){
                arrMinValue = arr[i];
            }
        }


        System.out.println(arrSum/arr.length + " is arithmetic average");
        System.out.println(arrMaxValue + " is max value");
        System.out.println(arrMinValue + " is min value");
        return arrSum/arr.length;
    }
}
