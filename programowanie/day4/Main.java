package pl.sdacademy.java.programowanie.day4;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Character.*;

public class Main {
    public static void main(String[] args) {
        String text = "There is a small   house on the opposite side of the 321riv321er.";
//        System.out.println(ex10(1331));
//        System.out.println(spacesPercent(text));
//        System.out.println(ex13(text));
//        ex11();
    }

    public static void ex11() {
        Scanner sc = new Scanner(System.in);
        String text = "";
        String textCopy = "";

        do {
            text = sc.nextLine();
            if (text.equals("Starczy") && textCopy.isEmpty())
                System.out.println("Nie podane zadnego tekstu");
            else if (text.length() > textCopy.length() && !text.equals("Starczy")) {
                textCopy = text;
            }
        }
        while (!text.equals("Starczy"));
        if (!textCopy.isEmpty())
            System.out.println(textCopy);
    }

    public static String ex13(String text) {
        String res = "";
        String[] textFormatted = text.split(" +");
        for (int i = 0; i < textFormatted.length - 1; i++) {
            res += textFormatted[i] + " " + textFormatted[i] + " ";
        }

        String lastTextElement = textFormatted[textFormatted.length - 1];
        String[] lastElementInArray = lastTextElement.split("");
        Pattern pat = Pattern.compile("[A-Za-z]");

        StringBuilder newLast = new StringBuilder();
        for (int i = 0; i < lastElementInArray.length; i++) {
            Matcher matcher = pat.matcher(lastElementInArray[i]);
            if (!matcher.matches()) {
                lastElementInArray[i] = "";
            }
            newLast.append(lastElementInArray[i]);
        }

        textFormatted[textFormatted.length - 1] = newLast + " " + newLast;
        res += newLast + " " + newLast;
        return res;

    }

    public static String spacesPercent(String stringIn) {
        String[] nowy = stringIn.split("");
        for (String a : nowy)
            System.out.print(a + "|");
        System.out.println("\n" + stringIn.length() + " length of string in");
        System.out.println(nowy.length + " Length of massive producing by splitting");
        double spacesNumber = 0;
        for (char simbol : stringIn.toCharArray()) {
            if (simbol == ' ')
                spacesNumber++;
        }
        double result = spacesNumber / stringIn.length() * 100;
        DecimalFormat formattedResulPercents = new DecimalFormat("0.00");
        return formattedResulPercents.format(result) + "%";
    }

    public static int ex10(int positiveNumber) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        int sum = 0;
        String numberInString = Integer.toString(positiveNumber);
        for (int i = 0; i < numberInString.length(); i++)
            sum += getNumericValue(numberInString.charAt(i));
        System.out.println(sum);

        sum = 0;
        while (positiveNumber >= 1) {
            sum += positiveNumber % 10;
            positiveNumber /= 10;
        }
        String[] split = numberInString.split("");
        for (String digit : split) {
            System.out.print(Integer.parseInt(digit) + " ");
        }
        int digitFromString = Character.getNumericValue(numberInString.charAt(1));
        System.out.println('\n' + "digit in position 1 is " + numberInString.charAt(1) + "|" + digitFromString);
        return sum;
    }
}
