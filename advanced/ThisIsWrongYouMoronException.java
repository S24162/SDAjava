package pl.sdacademy.java.advanced;

import java.util.Scanner;

public class ThisIsWrongYouMoronException extends Exception {
    public static void example() throws Exception {
        System.out.println("Please write 3");
        Scanner scanner = new Scanner(System.in);
        Integer userInput = scanner.nextInt();

        if (userInput == 3) {
            System.out.println("Bravo!");
        }
        else {
            throw new ThisIsWrongYouMoronException();
        }
    }
}
