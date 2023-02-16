package pl.sdacademy.java.programowanie.day6;

import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        LocalTime time1 = LocalTime.of(12,51);
//        LocalDate date1 = LocalDate.parse("2023-01-01");
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        Instant instant = Instant.now();
//        Instant instant1 = Instant.ofEpochMilli(1L);
////        cw17("2023-02-01"); //?????????????
//
//        String text = "wiadomosc";
//        if (text.matches("[ab]+")){
//            System.out.println("Tak!");
//        } else System.out.println("Nie");
//        ---------------------------------------------------------------linkedin.com/in/emil-rafalko-4067301b9

        Author first = new Author("First", "Poland");
        Author second = new Author("Second", "Germany");

        Poem firstP = new Poem(first, 10);
        Poem secondP = new Poem(second, 187);
        Poem thirdP = new Poem(first, 97);

        Poem[] arr = new Poem[]{firstP, secondP, thirdP};
        System.out.println(authorMaxStrophe(arr) + " has maximum strophe number");
    }

    public static String authorMaxStrophe(Poem... arr) {
        Poem x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getStropheNumbers() > arr[i - 1].getStropheNumbers()) {
                x = arr[i];
            }
        }
        return "\n" + x.getCreator().getSurname() + " (" + x.getCreator().getNationality() + ")";
    }

    public static void cw17(String dateIn) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Year is (YYYY) : ");
//        String date = sc.nextLine();
//        System.out.print("Month is MM : ");
//        date = date + "-" + sc.nextLine();
//        System.out.print("Day is DD : ");
//        date = date + "-" + sc.nextLine();

//        String date = dateIn;
//
//        LocalDate nextDay = LocalDate.parse(date);
//        LocalDate now = LocalDate.now();
//
//        System.out.println(now+"\n"+nextDay);
//        int daysLeft = (int) ( nextDay.toEpochDay() - now.toEpochDay());
//        System.out.println(daysLeft + " days left");
//        System.out.println("Compare " + nextDay.compareTo(now));
//
//        Duration dur = Duration.between(now,nextDay);
//        System.out.println(dur);

    }
}


