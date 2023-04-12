package pl.sdacademy.java.advancedPrograming.day6.Ex26A;

import java.util.List;

public class Model {
    public String name;
    public int productionStartYear;
    List<Car> cars;

    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }

    public static void newCarList() {
    }
}