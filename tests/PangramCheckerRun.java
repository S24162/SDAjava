package pl.sdacademy.java.tests;

public class PangramCheckerRun {
    public static void main(String[] args) {
        chars();
        System.out.println(PangramChecker.isPangram("abcba"));
        char letter = 'a';
        System.out.println(letter+1);
        System.out.println((int)letter);
    }

    static void chars() {
        char a = 'a';
        int bInt = 98;
        System.out.println(a);
        System.out.println((char) bInt);
    }
}
