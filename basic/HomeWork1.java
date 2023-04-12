package pl.sdacademy.java.basic;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import static pl.sdacademy.java.basic.HomerWork2Loops.factorialRecursion;

public class HomeWork1 {
    public static void main() {
        System.out.println("Playing HomeWork1.main" + "\n");

//        conditionalOperator(10, 1, 2);

//        System.out.println(VolumeCalculator.galsToLiters(1));
//        System.out.println(VolumeCalculator.litersToGals(1));
//        System.out.println(VolumeCalculator.litersToCubicMeters(1));

//        System.out.println(GeometryCalculator.triangleArea(3, 3));
//        System.out.println(GeometryCalculator.coneVolume(3, 3));
//        System.out.println(GeometryCalculator.cuboidVolume(3, 3, 3));
//        System.out.println(GeometryCalculator.pyramidVolume(3,2));

//        System.out.println(NumberComparator.min(1,3));
//        System.out.println(NumberComparator.max(1,3));
//        System.out.println(NumberComparator.isInRange(1,3,1));
//        System.out.println(NumberComparator.compare(3,3));

//        System.out.println(PolynomialCalculator.linearHasPointZero(1, 1));
//        System.out.println(PolynomialCalculator.squareSmallerPointZero(1,6,1));

//        System.out.println(SpeedCalculator.distanceInTimeToSpeed(100, 1));
//        System.out.println(SpeedCalculator.isSafeSpeed((short) 100, (short) 3, (short) 3));
//        System.out.println(SpeedCalculator.isSafeSpeedOnHighway(100,3));

//        System.out.println(Math.round(TaxCalculator.taxByRate(2000, 12)));
//        System.out.println(Math.round(TaxCalculator.lumpTax(121000)));
//        System.out.println(TaxCalculator.linearTax(2000,1000));
//        System.out.println(TaxCalculator.scaleTax2022(121000));

//        ClockHands.calculateAngle(5, 27.2727272);

//        Recursion.main();

    }

    //    public static void copy() {}

    public static class Recursion {
        public static void main() {
            System.out.println("Working Recursion.main" + '\n');

//            countdown(3);
//            System.out.println(power(2,5));
//            binaryPowers(5);
//            System.out.println(Recursion.factorial(3));
//            System.out.println(fibonacci(9));
//            fizzBuzz(1);

        }

        public static void countdown(int number) {
            if (number >= 0) {
                System.out.println(number);
                countdown(number - 1);
            }
        }

        public static double power(int x, int y) {
            double result = 1;
            if (y > 0)
                result = x * power(x, y - 1);
            else if (y < 0)
                result = (1 / (double) x) * power(x, y + 1);
            return result;
        }

        public static void binaryPowers(int power) {
            if (power >= 0) {
                System.out.println(Math.round(Math.pow(2, power)));
                binaryPowers(power - 1);
            }
        }

        public static long factorial(int x) {
            if (x < 2)
                return x;
            return x * factorialRecursion(x - 1);
        }

        public static int fibonacci(int n) {
            int result = 1;
            if (n > 2)
                result = fibonacci(n - 2) + fibonacci(n - 1);
            return result;
        }

        public static void fizzBuzz(int i) {
            if (i <= 100) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println(i + " Fizz Buzz");
                else if (i % 3 == 0)
                    System.out.println(i + " Fizz");
                else if (i % 5 == 0)
                    System.out.println(i + " Buzz");
                else System.out.println(i);

                fizzBuzz(i + 1);
            }
        }

    }

    public static class ClockHands {
        public static void calculateAngle(int hours, double minutes) {
            double hh = (double) 360 / 60 / 12 * minutes;
            double h = (double) 360 / 12 * hours + hh;
            double m = (double) 360 / 60 * minutes;
            double angle;
            if (h <= m) {
                angle = m - h;
            } else {
                angle = h - m;
            }
            System.out.println("Return : " + angle);
        }
    }

    public static class TaxCalculator {

        public static double taxByRate(double amount, double percentage) {
            return (amount * percentage / 100);
        }

        public static double lumpTax(double amount) {
            return taxByRate(amount, 12);
        }

        public static double linearTax(double amount, double costs) {
            return taxByRate(amount - costs * 0.19, 19);
        }

        public static double scaleTax2022(double amount) {
            double a = 120000;
            double b = lumpTax(amount);
            if (amount <= a)
                return b;
            return b + (amount - a) * 0.32;
        }

    }

    public static class SpeedCalculator {

        public static double distanceInTimeToSpeed(int distanceInMeters, int timeInSec) {
            double lToKm = (double) distanceInMeters / 1000;
            double secToHours = (double) timeInSec / 3600;
            return lToKm / secToHours;
        }

        public static boolean isSafeSpeed(short distanceInMeters, short timeInSec, short roadType) {

            short speed = (short) Math.round(distanceInTimeToSpeed(distanceInMeters, timeInSec));
            System.out.println(speed + " Km/h");

            boolean ret = true;
            switch (roadType) {
                case 1 -> {
                    if (speed > 50) {
                        ret = false;
                    }

                }
                case 2 -> {
                    if (speed > 90) {
                        ret = false;
                    }
                }
                case 3 -> {
                    if (speed > 140) {
                        ret = false;
                    }
                }
                default -> {
                    System.out.println("Wrong road type");
                    ret = false;
                }
            }
            return ret;
        }

        public static boolean isSafeSpeedOnHighway(int distanceInMeters, int timeInSec) {

            return SpeedCalculator.isSafeSpeed((short) distanceInMeters, (short) timeInSec, (short) 3);
        }

    }

    public static class PolynomialCalculator {

        public static boolean linearHasPointZero(int a, int b) {
            return !((a == 0) && !(b == 0));
        }

        public static double squareSmallerPointZero(double a, double b, double c) {
            double x = 0.1;

            if (a == 0)
                System.out.println("rownanie liniowe");
            else {
                double delta;
                delta = b * b - 4 * a * c;
                if (delta < 0)
                    System.out.println("Brak rozwiązań");
                else if (delta == 0) {
                    System.out.print("Jedno podwójne rozwiązanie x = ");
                    x = -b / (2 * a);
                } else {
                    double x1, x2;
                    x1 = (-b + sqrt(delta)) / (2 * a);
                    x2 = (-b - sqrt(delta)) / (2 * a);
                    if (x1 < x2) {
                        x = x1;
                        System.out.println("x1 < x2");
                    } else {
                        x = x2;
                        System.out.println("x1 > x2");
                    }
                }
            }
            System.out.print("X min = ");
            return x;
        }

        static void liniowe(double a, double b) {
            if (a == 0)
                if (b == 0)
                    System.out.println("Rownaie tozsamosciowe");
                else
                    System.out.println("Rownanie sprzeczne");
            else {
                double x;
                x = -b / a;
                System.out.print("Równanie liniowe, x = ");
                System.out.println(x);
            }
        }
    }

    public static class NumberComparator {

        public static double min(double a, double b) {
            if (a < b)
                return a;
            return b;
        }

        public static double max(double a, double b) {
            if (a > b)
                return a;
            return b;
        }

        public static boolean isInRange(int a, int b, int c) {
            if (a < b && a == c)
                System.out.println("wartość równa lewej stronie przedziału");
            if (a < b && b == c)
                System.out.println("wartość równa prawej stronie przedziału");
            if (a > b && b == c)
                System.out.println("wartość równa lewej stronie przedziału");
            if (a > b && a == c)
                System.out.println("wartość równa prawej stronie przedziału");

            return c >= a && c <= b || c >= b && c <= a;
        }

        public static int compare(int a, int b) {
            if (a < b)
                return -1;
            if (a > b)
                return 1;
            else return 0;
        }

    }

    public static class GeometryCalculator {

        public static double triangleArea(double base, double height) {
            return base * height / 2;
        }

        public static double coneVolume(double radius, double height) {
            return (Math.PI * radius * radius * height) / 3;
        }

        public static double cuboidVolume(double length, double breadth, double height) {
            return length * breadth * height;
        }

        public static double pyramidVolume(double baseSide, double height) {
            return (baseSide * baseSide) * height / 3;
        }

    }

    public static class VolumeCalculator {
        static final double galToLi_CONST = 3.7854;
        static final double liToGal_CONST = 0.264172052358148;
        static final double liToCubicM_CONST = 0.001;

        public static double galsToLiters(double gallons) {
            return gallons * galToLi_CONST;
        }

        public static double litersToGals(double liters) {
            return liters * liToGal_CONST;
        }

        public static double litersToCubicMeters(double liters) {
            return liters * liToCubicM_CONST;
        }
    }


    public static void conditionalOperator(int x, int a, int b) {
        System.out.println("booleanExpression ? expression1 : expression2");
        int d;
        d = (x > b && x > a) ? 1 : ((int) -1.1);
        System.out.println(d);

        if (x > b)
            d = 1;
        else
            d = -1;
        System.out.println(d);

    }

}
