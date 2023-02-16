package pl.sdacademy.java.basics;

public class Work2 {
    /**
     * Wylich prędkość w km/h
     *
     * @param mm need distance in [m]
     */
    public static void main(int mm) {
        System.out.println("Playing Work2.main");

//        HomeWork1.main();
//        switch();
//        milesCalc();
//        andTest();
    }


    public static void andTest() {
        int x = 5, y = 7, z = 9;

        System.out.println("Demonstrating && operator");
        if ((x > y) && (x++ > z))
            ;
        else
            System.out.println("Value of x: " + x);

        System.out.println("\nDemonstrating & operator");
        if ((x > y) & (x++ > z))
            ;
        else
            System.out.println("Value of x: " + x);
    }

    public static void switc() {
        short bmi = (short) Work1.bmiCalculator(200, 1.80);
        switch (bmi) {
            case -1: {
                System.out.println("too low");
                break;
            }
            case 0: {
                System.out.println("write");
                break;
            }
            case 1: {
                System.out.println("too hi");
                break;
            }
            default: {
                System.out.println("BMI not idetified");
            }
        }

        switch (bmi) {
            case -1 -> {
                System.out.println("too low");
            }
            case 0 -> {
                System.out.println("write");
            }
            case 1 -> {
                System.out.println("too hi");
                break;
            }
            default ->
                System.out.println("BMI not idetified");
        }
    }

    public static void milesCalc() {

        double km = 15;
        double km2 = 40;
        double kg = 10;
        double rKoła = 15;
        double celsius = 36.6;

        double miles = kmToMiles(km);
        double miles2 = kmToMiles(km2);
        double pounds = kgToPounds(kg);
        double sKoła = poleKola(rKoła);
        double farenheit = celsiusToFahrenheit(celsius);

        System.out.print(miles);
        System.out.print(miles2);
        System.out.print(pounds);
        System.out.print(sKoła);
        System.out.print(farenheit);
    }

    public static double kmToMiles(double km) {

        final double scaleKmToMilesRatio = 0.621371192;
        double miles = km * scaleKmToMilesRatio;
        return miles;
    }

    public static double kgToPounds(double kg) {

        final double scalePounds = 2.20462262185;
        double pounds = kg * scalePounds;
        return pounds;
    }

    public static double poleKola(double r) {

        final double pi = 3.1415926535;
        double s;
        return s = pi * r * r;
    }

    public static double celsiusToFahrenheit(double c) {
        double f = ((c * 9) / 5) + 32;
        return f;
    }

    public static void count(int max) {
        int counter = 1;
        while (counter <= max) {
            System.out.println("x : " + counter);
//            counter = counter + 1;
            counter++;
        }
    }
}
