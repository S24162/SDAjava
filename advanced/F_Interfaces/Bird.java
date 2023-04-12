package pl.sdacademy.java.advanced.F_Interfaces;

public class Bird implements Soundable, Eatable {
    @Override
    public void makeSound() {
        System.out.println("Tweet tweet!");
    }

    @Override
    public void eat(String food) {
        System.out.println("Tweet yummy " + food);
    }
}
