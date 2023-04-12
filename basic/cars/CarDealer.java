package pl.sdacademy.java.basic.cars;

import java.util.Arrays;

public class CarDealer {
    private String name;
    private Car[] arrayOfCars;
    private int maxMileage;
    private int minProductionYear;
    private int maxProductionYear;


    public CarDealer(String name) {
        this.name = name;
        arrayOfCars = new Car[0];
        setMaxMileage(100000);
        setMaxProductionYear(2020);
        setMinProductionYear(2005);
    }

    public void addCar(String brand, String model, int productionYear,
                       int mileage, String registrationNumber) {
        Car temp = Car.addCar(brand, model, productionYear, mileage, registrationNumber);
        if (addCarConditions(temp)) {
            arrayOfCars = Arrays.copyOf(arrayOfCars, arrayOfCars.length + 1);
            arrayOfCars[arrayOfCars.length - 1] = temp;
        } else {
            System.out.println("Car " + temp.getBrand() + " " + temp.getModel() + " is not pass conditions");
        }
    }

    private void addCar(Car car) {
        if (addCarConditions(car)) {
            arrayOfCars = Arrays.copyOf(arrayOfCars, arrayOfCars.length + 1);
            arrayOfCars[arrayOfCars.length - 1] = car;
        } else
            System.out.println("Car " + car.getBrand() + " " + car.getModel() + " is not pass conditions");
    }

    boolean addCarConditions(Car car) {
        if (car.getMileage() > maxMileage) {
            System.out.print(car.getMileage() + "km | ");
            return false;
        }
        if (car.getProductionYear() > maxProductionYear || car.getProductionYear() < minProductionYear) {
            System.out.print(car.getProductionYear() + " year | ");
            return false;
        }
        return true;
    }

    public void printArrayOfCars() {
        System.out.println("\n            " + name + " :");
        for (Car car : this.arrayOfCars) {
            System.out.print(car.getBrand() + " " + car.getModel() + " "
                    + car.getProductionYear() + " " + car.getMileage() + "km "
                    + car.getRegistrationNumber() + "\n");
        }
        if (arrayOfCars.length == 0)
            System.out.println("Empty");
        System.out.println();
    }

    public void printArrayOfCars(Car[] arrayOfCars) {
        System.out.println("\n            " + name + " :");
        for (Car car : arrayOfCars) {
            System.out.print(car.getBrand() + " " + car.getModel() + " "
                    + car.getProductionYear() + " " + car.getMileage() + "km "
                    + car.getRegistrationNumber() + "\n");
        }
        if (arrayOfCars.length == 0)
            System.out.println("Empty");
        System.out.println();
    }

    public Car[] findCarsByMileage(int from, int to) {
        System.out.print("   Matches for miles " + from + " to " + to);
        CarDealer temp = new CarDealer(name);
        for (Car car : arrayOfCars) {
            if (car.getMileage() >= from && car.getMileage() <= to) {
                temp.addCar(car);
            }
        }
        return temp.arrayOfCars;
    }

    public Car[] findCarsByProductionYear(int from, int to) {

        System.out.print("   Matches for years " + from + " to " + to);
        CarDealer temp = new CarDealer(name);
        for (Car car : arrayOfCars) {
            if (car.getProductionYear() >= from && car.getProductionYear() <= to) {
                temp.addCar(car);
            }
        }
        return temp.arrayOfCars;
    }

    public Car[] findCarsByBrandOrModel(String query) {

        System.out.print("    Matches for " + query);
        CarDealer temp = new CarDealer(name);
        String toMatcher = "(.*)" + query.toLowerCase() + "(.*)";

        for (Car car : arrayOfCars) {

            if (car.getModel().toLowerCase().matches(toMatcher)
                    || car.getBrand().toLowerCase().matches(toMatcher)) {
                temp.addCar(car);
            }
        }
        return temp.arrayOfCars;
    }

    public Car[] findCarsByRegistrationNumber(String regex) {

        System.out.print("    Matches of reg. number for " + regex);
        CarDealer temp = new CarDealer(name);
        String toMatcher = "(.*)" + regex.toLowerCase() + "(.*)";

        for (Car car : arrayOfCars) {

            if (car.getRegistrationNumber().toLowerCase().matches(toMatcher)) {
                temp.addCar(car);
            }
        }
        return temp.arrayOfCars;
    }

    public String getName() {
        return name;
    }

    public void setMaxMileage(int maxMileage) {
        this.maxMileage = maxMileage;
    }

    public void setMinProductionYear(int minProductionYear) {
        this.minProductionYear = minProductionYear;
    }

    public void setMaxProductionYear(int maxProductionYear) {
        this.maxProductionYear = maxProductionYear;
    }
}
