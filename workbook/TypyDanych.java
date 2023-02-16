package pl.sdacademy.java.workbook;

import java.time.LocalDate;
import java.util.stream.IntStream;


public class TypyDanych {

    public static void main() {
        parsing();
        wrappingSimple();
        businessCard();
        localDate();
    }

    public static void parsing() {
        int a = 200;
        long b;
        b = a;
        a = (int) b;
        System.out.println(a);
        double c = b;
        a = (byte) c;
        System.out.println(a);
    }

    public static void wrappingSimple() {
        int a = 100;
        long b = 99L;

        String aContainer = String.valueOf(a);
        System.out.println(aContainer + 1);
        System.out.println();

        Byte bContainer = (byte) b;
        System.out.println(bContainer.doubleValue());
        System.out.println();

        System.out.println(aContainer);
        double c = Double.parseDouble(aContainer);
        System.out.println(c);
    }

    public static void businessCard() {

        String a = "############################";
        String b = "#  ul. Grunwaldzka 345/7b  #";

        a = a.replace("#", "-");

        System.out.println(a + "\n"
                + "#                          #" + "\n"
                + "#      Jan Kowalski        #" + "\n"
                + b + "\n"
                + "#     00-950 Warszawa      #" + "\n"
                + "#                          #" + "\n"
                + a);

//        testing of String class methods

        System.out.println("1. " + b.charAt(19) + "" + b.charAt(20)); /* charAt(int index) */
        System.out.println("2. " + b.endsWith("#") + "," + b.endsWith("3")); /* endsWith(String suffix) */

        IntStream.range(0, b.length()).forEach(i -> {   /* charAt(int index) */
            char x = 97;
            if (x == b.charAt(i))
                System.out.println((x == b.charAt(i)) + " " + x + " presented in column " + i);
        });
        System.out.println();

        System.out.println("3. " + a.equalsIgnoreCase(b)); /* equalsIgnoreCase(String otherString) */
        System.out.println("3. " + b.indexOf("Grunwaldzka")); /* indexOf(String str) */
        System.out.println("4. " + a.isEmpty()); /* isEmpty() */
        System.out.println("5. " + b.lastIndexOf("al")); /* lastIndexOf(String str) */
        System.out.println("6. " + b.startsWith("# ")); /* startsWith(String prefix) */
        System.out.println("7-8. " + b.toUpperCase()); /* toUpperCase() ; toLowerCase()*/
        a = "          " + a + "                    ";
        System.out.println("9. " + a + "; trim :" + a.trim()); /* trim() */
    }

    public static void localDate() {
        LocalDate aNow = LocalDate.now();
        System.out.println(aNow);
        LocalDate b = LocalDate.of(2020, 9, 12);
        System.out.println("b is " + b);
        aNow = aNow.plusDays(12);
        System.out.println("aNow + 12 is " + aNow + " | Is it Leap Year : " + aNow.isLeapYear());
        System.out.println(LocalDate.parse("2018-12-13").plusDays(31));
        System.out.println(b.isBefore(aNow));
        System.out.println(b + " | getDayOfMonth is " + b.getDayOfMonth() + " | getDayOfYear is " + b.getDayOfMonth()
                + " | getYear is " + b.getYear() + " | lengthOfMonth is " + b.lengthOfMonth()
                + " | lengthOfYear is " + b.lengthOfYear());
        System.out.println("Math.pow(2, 10) : " + Math.pow(2, 10));
    }

}
