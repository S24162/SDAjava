package pl.sdacademy.java.workbook;

import java.time.*;

public class Loops {
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_RESET = "\u001B[0m";
    public static String left = ANSI_RESET + "[" + ANSI_RED;
    public static String right = ANSI_RESET + "]" + ANSI_RED;


    public static void main() {

//        numbers(-20, 20);
//        numbers(-20, -15);
//        numbers(15, 20);
//        evenNumbers(-20, 20);
//        date();
//        calenderTest();
//        calenderArr();
//        calenderTestArr();


    }

    public static void calenderArr(int actDay, int lastDay, int firstDay) {
        System.out.println("          " + LocalDate.now().getMonth());
        System.out.println(" Pn  Wt  Śr  Cz  Pt  Sb  Nd");
        System.out.println(ANSI_RED + " \\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-");

        String[][] cal = new String[5][7];
        int count = 0;

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 7; j++) {
                count++;
                cal[i][j] = day(i, j, count, actDay, lastDay, firstDay);
            }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(cal[i][j]);
            }
            System.out.println();
        }
    }

    public static String day(int i, int j, int count, int actDay, int lastDay, int firsDay) {
        String day = null;
//        int firsDay = 2;
//        int lastDay = 31;
//        int actDay = 14;

        count -= firsDay - 1;

        if (count < 10) {
            if (count < 1) {
                day = "    ";
            } else {
                if (actDay == count) {
                    day = " " + left + count + right;
                } else {
                    day = "  " + count + " ";
                }
            }
        } else {
            if (count <= lastDay) {
                if (actDay == count) {
                    day = left + count + right;
                } else {
                    day = " " + count + " ";
                }

            } else {
                day = "    ";
            }
        }
        return day;
    }

    public static void calenderTestArr() {

        int actDay = LocalDate.now().getDayOfMonth();
        int lastDay = LocalDate.now().lengthOfMonth();
        int firsDay = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), 1).getDayOfWeek().getValue();
        calenderArr(actDay, lastDay, firsDay);
//        for (int i = 1; i <= 31; i++) {
//            calenderArr(i);
//            System.out.println();
//        }
    }

    public static void calender(int day) {
        LocalDate date = LocalDate.now();
//        int day = date.getDayOfMonth();
//        day = 10;
        System.out.println(" Pn Wt Śr Cz Pt Sb Nd");
        System.out.println(ANSI_RED + " \\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-");

        int count = 3;
        System.out.print("   " + "   ");
        for (int j = 1; j <= 31; j++) {
            if (j < 10) {
                if (j == 9 && j == day - 1) {
                    System.out.print(" " + j + "");
                } else if (j == day - 1) {
                    System.out.print(" " + j + " ");
                } else if (j == day) {
                    System.out.print(left + j + right);
                } else
                    System.out.print(" " + j + " ");
            } else {
                if (j == day - 1) {
                    System.out.print("" + j + "");
                } else if (j == day) {
                    System.out.print(left + j + right);
                } else
                    System.out.print("" + j + " ");
            }

            if (count % 7 == 0)
                System.out.print("\n" + "");
            count++;
        }


    }

    public static void calenderTest() {
//        calender(13);
        for (int i = 1; i <= 31; i++) {
            calender(i);
            System.out.println();
            System.out.println();
        }
    }

    public static void date() {

        System.out.println("Aktualny czas : " + ANSI_RED + LocalTime.now().toString().substring(0, 2) + ANSI_RESET
                + LocalTime.now().toString().substring(2, 8));

        System.out.println("Hour:");
        int count = 0;
        for (int i = LocalTime.now().getHour(); i > 0; i--) {
            System.out.print("*");
            count++;
            if (count == 10)
                System.out.println();
        }

        System.out.println('\n' + "Minute:");
        count = 0;
        for (int i = LocalTime.now().getMinute(); i > 0; i--) {
            System.out.print("*");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }

        System.out.println('\n' + "Second:");
        count = 0;
        for (int i = LocalTime.now().getSecond(); i > 0; i--) {
            System.out.print("*");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }

    public static void evenNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0)
                numbers(i, i);
        }

        System.out.println();
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0)
                numbers(i, i);
        }

        System.out.println();
        int sum = 0;
        for (int i = start; i <= end; i++)
            sum += i;
        System.out.println(sum);

        sum = 0;
        for (int i = start; i <= end; i++)
            if (i >= 4)
                sum += i;
        System.out.println(sum);
    }

    public static void numbers(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i >= 0) {
                if (String.valueOf(i).length() == 1)
                    System.out.print(" " + i + "  ");
                if (String.valueOf(i).length() == 2)
                    System.out.print(" " + i + " ");
                if (String.valueOf(i).length() == 3)
                    System.out.print(" " + i + "");
            }
            if (i < 0) {
                if (String.valueOf(i).length() == 1)
                    System.out.print(i + "   ");
                if (String.valueOf(i).length() == 2)
                    System.out.print(i + "  ");
                if (String.valueOf(i).length() == 3)
                    System.out.print(i + " ");
            }
            count++;
            if (count % 10 == 0)
                System.out.println();
        }
    }

    public static void numbersSimple() {
        for (int i = -20; i <= 20; i++) {
            if (i >= 0) {

            }
        }
    }
}
