package pl.sdacademy.java.basicPrograming.day1;


import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
//            cyrcle();
//        bodyMassIndex();
//        quadraticEquation(3, 7, -1);
    }

    public static void quadraticEquation(int a, int b, int c) {
        double delta = b * b - (4 * a * c);
        if (delta < 0)
            System.out.println("Delta < 0");
        else {
            double x1 = (-b - sqrt(delta)) / (2 * a);
            double x2 = (-b + sqrt(delta)) / (2 * a);
            if (x1==x2) {
                System.out.printf("X1 is %1.4f ", x1);
            } else
                System.out.printf("\nX1 is %1.3f\nX2 is %1.3f\n", x1, x2);
        }
    }

    public static void bodyMassIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Body mass: ");
        float mass = sc.nextFloat();
        System.out.print("Height : ");
        double height = Math.pow(sc.nextInt() / 100f, 2);

        double bmi = mass / height;
        if (bmi < 18.5 || bmi > 24.9)
            System.out.printf("Index BMI is %1.2f. Are you human?", bmi);
        else
            System.out.printf("Index BMI is %1.2f. So, you are OK", bmi);
    }

    public static void cyrcle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = scanner.nextFloat();

        double area = Math.PI * (r * r);
        System.out.println("Cyrcle area is " + area);

        double circumreference = Math.PI * r;
        System.out.println("Circumreference is " + circumreference);
        System.out.println();

        System.out.println("Circumreference: " + circumreference);
        System.out.printf("Circumreference with specyfikator formatu: %8.4f", circumreference);
        // specyfikator formatu zaczyna się od "%" i drukuje wartość zmiennej "result" w polu o szerokości 1 znaku oraz z czterema miejscami po przecniku.
        // "f" to znak konwersji - oznacza liczbę zmiennoprzecinkową
    }
}

