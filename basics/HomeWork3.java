package pl.sdacademy.java.basics;

import java.util.Scanner;

public class HomeWork3 {
    public static void main() {
        System.out.println("Playing HomeWork3.main");

//        int[] numbers = new int[]{4, 20, 30, 45, 3, 8, 32, 10, 1};
//        System.out.println(Arrays.toString(sort(numbers)));
//        scannerRegex();

//        System.out.print(sumDigits(987L)+"\n");
//        sumScanner();
        drawChristmasTree((byte) 10);
        drawChristmasTree2(10);
//        game20();
//        stringBuilderAndNewString();
    }

    public static void drawChristmasTree2(int height) {
        StringBuilder line = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            String spaces = " ".repeat(height - i);
            String stars = "*".repeat(i * 2 - 1);
            line.append(spaces).append(stars).append("\n");
        }
        System.out.println(line);
    }

    public static void stringBuilderAndNewString(){
        String a = new String(new char[4]).replace("\0","9");
        System.out.println(a);
        StringBuilder b = new StringBuilder(a);
        a = a.replaceAll("9","ab");
        System.out.println(a);
        b.append(a);
        System.out.println(b);

    }

    public static void game20() {
        int x = (int) (Math.random() * 20 + 1);
        System.out.println(x);
        System.out.println("\n" + "Give me a integer number from 1 to 20!");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int count = 1;
        while (y < 1 || y > 20) {
            System.out.println("Are you dumb..");
            y = sc.nextInt();
            count++;
            if (count == 3) {
                System.out.println("Yes,you are dumb, asshole. End.");
                return;
            }
        }
        count = 1;
        while (y != x) {
            if (count == 5) {
                System.out.println("Five times, looser.");
                break;
            }
            if (y < x) {
                count++;
                System.out.print("Too low");
                if (x - y <= 3) {
                    System.out.print(" but hot");
                } else if (x - y <= 7) {
                    System.out.print(" but cold");
                }
                System.out.println();
                y = sc.nextInt();
            } else if (y > x) {
                count++;
                System.out.print("Too high");
                if (y - x <= 3) {
                    System.out.print(" but hot");
                } else if (y - x <= 7) {
                    System.out.print(" but cold");
                }
                System.out.println();
                y = sc.nextInt();
            }
        }
        if (y == x)
            System.out.println("BINGO");
        else System.out.println("Get lost");
    }

    public static void drawChristmasTree(byte height) {
        String starSum = "*";
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--)
                System.out.print(" ");
            System.out.println(starSum);
            starSum += "*".repeat(2);
        }
    }

    public static void sumScanner() {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        for (boolean i = true; i; ) {
            String x = sc.nextLine();
            if (x.matches("^\\d+$")) {
                sum += Integer.parseInt(x);
                count++;
            } else {
                System.out.println("You are chump!");
                i = false;
            }
        }
        System.out.println("Average is " + sum / count);
    }

    public static int sumDigits(long number) {
        int sum = 0;
        String numberString = String.valueOf(number);
        System.out.print(numberString + " --> ");
        for (int i = 0; i < numberString.length(); i++) {
            sum += Character.getNumericValue(numberString.charAt(i));
            if (i < numberString.length() - 1)
                System.out.print(numberString.charAt(i) + " + ");
            else System.out.print(numberString.charAt(i) + " = ");
        }
        return sum;
    }

    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int iMin = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[iMin])
                    iMin = j;
            }
            int change = numbers[i];
            numbers[i] = numbers[iMin];
            numbers[iMin] = change;
        }
        return numbers;
    }

    public static void scannerRegex() {
        Scanner sc = new Scanner(System.in);
        String i;
        do {
            i = String.valueOf(sc.nextInt());
            if (i.equals(String.valueOf(2))) {
                return;
            }
        }
        while (!i.matches("\\d{2,3}"));
        System.out.println(" Rocket");
    }

}
