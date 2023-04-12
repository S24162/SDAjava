package pl.sdacademy.java.advancedPrograming.day3;

public class App {
    public static void main(String[] args) {
        System.out.println(Car.FERRARY.isPremium());
        System.out.println(Car.OPEL.isRegular());
        System.out.println(Car.TOYOTA.isFasterThan(Car.OPEL));
        System.out.println(Car.FERRARY.isFasterThan(Car.OPEL));
    }
}
