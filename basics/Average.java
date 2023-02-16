package pl.sdacademy.java.basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Average {
    public static void main() {
        System.out.println("Average.main");

//        System.out.println(average( 3, 7, 13, 4, 9));
//        System.out.println(averageForEach( 3, 7, 13, 4, 9));

    }

    public static double average(double... values){
        double sum = 0;
        int i=0;
        while (i< values.length){
            sum= sum +values[i];
            i++;
        }
        return sum/values.length;
    }

    public static double averageForEach(double... values){
        double sum = 0;
        for(double value : values){
            sum = sum + value;
        }
        return sum/values.length;
    }
}
