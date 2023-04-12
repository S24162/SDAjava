package pl.sdacademy.java.advanced.F_Interfaces;

public class Car implements Soundable {

    @Override
    public void makeSound() {
        System.out.println("Brrrrrrr!");
    }
}
