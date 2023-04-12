package pl.sdacademy.java.advanced.G_GenericTypes.AnimalCages;

public abstract class Animal {
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " are eating");
    }
    public void sleep() {
        System.out.println(this.getClass().getSimpleName() + " are sleeping ");
    }
}
