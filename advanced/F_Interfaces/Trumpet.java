package pl.sdacademy.java.advanced.F_Interfaces;

public class Trumpet implements Soundable  {
    @Override
    public void makeSound() {
        System.out.println("Troooot!");
    }
}
