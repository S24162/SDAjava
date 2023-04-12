package pl.sdacademy.java.basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalTime localTime1= LocalTime.now();
        String formattedLocalTime = localTime1.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        System.out.println(formattedLocalTime);
        Date d = new Date();
        d.getYear();
        System.out.println(d.getYear());
        System.out.println(d);
        d.setTime(0);
        System.out.println(d);

//
        Date date = new Date(); //tak naprawdę reprezentuje nie datę, tylko tzw. timestamp
        System.out.println(date);
        System.out.println(date.getYear()); //niezalecane!
        System.out.println(date.getTime());
        date.setTime(0); //1970-01-01
        System.out.println(date);

        //---
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); //ISO-8601 - ogólny standard
        System.out.println(localDateTime.getYear());
        System.out.println(LocalDateTime.MIN);
        System.out.println(LocalDateTime.MAX);

        LocalDateTime endOfFebruary = LocalDateTime.of(2023,2,28,15,15);
        System.out.println(endOfFebruary);

        System.out.println("----");

        LocalDateTime afterEndOfFebruary = endOfFebruary.plusDays(1);
        System.out.println(endOfFebruary);
        System.out.println(afterEndOfFebruary);

        System.out.println("----");

        LocalDateTime parsedDateTime = LocalDateTime.parse("2023-06-15T12:17");
        System.out.println(parsedDateTime);

        System.out.println("----");
        LocalDateTime endOfFebruaryLeapYear = LocalDateTime.of(2024, 2, 28, 11, 11);
        LocalDateTime afterEndOfFebruaryLeapYear = endOfFebruaryLeapYear.plusDays(1);
        System.out.println(afterEndOfFebruaryLeapYear);

        System.out.println("\nPorównania:");
        System.out.println("endOfFebruaryLeapYear isBefore afterEndOfFebruaryLeapYear = " +
                (endOfFebruaryLeapYear.isBefore(afterEndOfFebruaryLeapYear))
        );

        System.out.println("endOfFebruaryLeapYear isAfter afterEndOfFebruaryLeapYear = " +
                (endOfFebruaryLeapYear.isAfter(afterEndOfFebruaryLeapYear))
        );

        System.out.println("\nOsobno data i czas");
        LocalDate localDate = LocalDate.of(2023, Month.JANUARY, 10);
        LocalTime localTime = LocalTime.of(14, 16);
        LocalDateTime customLocalDateTime = LocalDateTime.of(localDate, localTime);
        System.out.printf("localDate: %s, localTime: %s, customLocalDateTime: %s%n",
                localDate, localTime, customLocalDateTime
        );

        System.out.println("\nPrawie północ danego dnia");
        LocalDateTime almostMidnight = LocalDateTime.of(localDate, LocalTime.MAX);
        System.out.println(almostMidnight);
    }
}
