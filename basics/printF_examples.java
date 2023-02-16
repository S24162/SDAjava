package pl.sdacademy.java.basics;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class printF_examples {
    public static void main(String[] args) {
        String firstName = "Jan";
        String lastName = "Kowalski";
        System.out.println("Imię: " + firstName + ", Nazwisko: " + lastName);

        //%s - zastępnik dla typu tekstowego
        String template = "Imię: %s, Nazwisko: %s\n";
        System.out.printf(template, firstName, lastName);
        System.out.printf(template, "Anna", "Nowak");

        //%n - łamanie linii
        System.out.printf("Liczba: %s%n", 12345);

        //%d - zastępnik dla liczb całkowitych (int, long)
        System.out.printf("Liczba: %d%n", 12345);

        //%6d - wyrównanie pustymi znakami do długości 6
        System.out.printf("Liczba: %6d%n", 12345);
        System.out.printf("Liczba: %6d%n", 123456);
        System.out.printf("Liczba: %6d%n", 123);

        //%06d - wyrównanie zerami do długości 6
        System.out.printf("Liczba: %06d%n", 12345);
        System.out.printf("Liczba: %06d%n", 123456);
        System.out.printf("Liczba: %06d%n", 123);

        //%f - zastępnik dla liczb zmiennoprzecinkowych (float, double)
        System.out.printf("PI: %s%n", Math.PI);
        System.out.printf("PI: %f%n", Math.PI);
        System.out.printf("PI: %010f%n", Math.PI);
        System.out.printf("PI: %010.7f%n", Math.PI);
        System.out.printf("PI: %010.2f%n", Math.PI);

        System.out.printf(
                "Imię: %s, PI: %.4f,%nliczba: %03d, nazwisko: %s%n",
                firstName, Math.PI, 34, lastName
        );

        String formattedString = String.format(
                "Imię: %s, PI: %.4f,%nliczba: %03d, nazwisko: %s",
                firstName, Math.PI, 34, lastName
        );

        System.out.println(formattedString);
    }
}
