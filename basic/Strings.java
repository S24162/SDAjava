package pl.sdacademy.java.basic;

import java.util.Scanner;

public class Strings {
    public static void main() {
        String something = "Siala baba mak";
        String somethingElse = "Nie wiadomo jak";
        char newLine = '\n';
        char letterA = 'A';
        char spase = ' ';

        char mysteriousSymbol2 = '\uD83D';
        char mysteriousSymbol3 = '\uDE3C';
        char arrowSymbol = '\u21CF';

        String  text = something + newLine+somethingElse+newLine+letterA
                +" dziad wiedział, nie powiedził" + arrowSymbol;

        System.out.println(text.toUpperCase());
        System.out.println("\uD83D\uDE3C");

        System.out.println("Standad out");
        System.err.println("Errors out");

        Scanner scan = new Scanner(System.in);
        String stringValue = scan.nextLine();
        System.out.println(stringValue);

        int value = Integer.parseInt(stringValue);
        System.out.println(65 +value);



//        int v = System.in.read();
//        System.out.println(v);

    }
}
