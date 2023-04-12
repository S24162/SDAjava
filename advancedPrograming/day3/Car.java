package pl.sdacademy.java.advancedPrograming.day3;

public enum Car {
    FERRARY(100, 500),
    PORCSHE(100, 450),
    MERCEDES(90, 400),
    BMW(90, 400),
    OPEL(80, 200),
    FIAT(70, 150),
    TOYOTA(75, 150);

    private final int price; //niezmienna, pole ktore moze zostac zminione
    private final double power; // te pola muszą zostac zinicializowane w konstruktorze

    Car(int price, double power) {
        this.price = price;
        this.power = power;
    }

    boolean isRegular() {
        if (price < 90)
            return true;
        else
            return false;
    }

    boolean isPremium() {
        return !isRegular();
    }

    boolean isFasterThan(Car car) {
        System.out.println(this.compareTo(car));
//        wzystkie enumy implementuja interfejsy Comparable
//        implementacja polega na porownaniu kolejnych pol (parametruw) enum - zaczynajonc od konca
        if (this.compareTo(car) > 0)
            return true;
        else
            return true;
    }
}
