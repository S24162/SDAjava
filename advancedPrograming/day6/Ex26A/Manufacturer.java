package pl.sdacademy.java.advancedPrograming.day6.Ex26A;

import java.util.List;

public class Manufacturer {
    public String name;
    public int yearOfCreation;
    public List<Model> models;

    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
    }
}
