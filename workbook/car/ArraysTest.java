package pl.sdacademy.java.workbook.car;

public class ArraysTest {
    public static void main() {
//        array(1, 3, 5, 2, 5, 6, 7, 4, 9, 7);
//        array2(105, 1, 2, 5, 10, 20);
    }

    public static void array(int... arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            count++;
            if (count == 6) {
                count = 0;
                break;
            }
        }
        System.out.println();

        do {
            System.out.print(arr[arr.length - 1 - count] + " ");
            count++;
        }
        while (count != 6);
        count = 0;
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();

        for (int x : arr) {
            if (x != 5)
                System.out.print(x + " ");
        }
        System.out.println();

        for (int x : arr) {
            System.out.print(x + " ");
            if (x == 7)
                break;
        }
        System.out.println();

        for (int x : arr) {
            if (x % 3 == 0)
                System.out.print(x + " ");
        }
        System.out.println(" cyfry podzielne przez 3");

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println("min = " + min + " | " + "max = " + max);

    }

    public static void array2(int total, int... money) {
        int sum = 0;
        while (sum < total) {
            int idx = (int) (Math.random() * money.length);
            System.out.print(sum + " + " + money[idx] + " = " );
            sum += money[idx];
            System.out.print(sum);
            System.out.println();
        };
    }
}
