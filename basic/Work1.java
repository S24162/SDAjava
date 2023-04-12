package pl.sdacademy.java.basic;

public class Work1 {
    public static void main() {
        bmiCalculator(200, 1.8);
        numbers();

    }

    public static double bmiCalculator(double bodyMass, double bodyHeight) {
        final short result;
        boolean invalidBodyMass = (bodyMass <= 0);
        boolean invalidBodyHeight = (bodyHeight <= 0);

        if (invalidBodyHeight || invalidBodyHeight) {
            return -1;
        }

        if (!invalidBodyMass && !invalidBodyHeight) {
            System.out.println("Watrości poprawne");
        }

        double bmi = bodyMass / (bodyHeight * bodyHeight);
        System.out.println(Math.round(bmi));
        if (bmi < 18.5)
            result = -1;
        else if (bmi < 25) {
            result = 0;
        } else
            result = 1;
        return result;
    }

    public static void numbers() {
        long integer1 = 1000000000000000000L;
        long integer2 = 2000000000000000000L;
        long integerSum = integer1 + integer2;
        System.out.println(integerSum);

        double folat1 = 0.1;
        double folat2 = 0.2;
        double floatSum = folat1 + folat2;
        System.out.println(floatSum);


    }
}
