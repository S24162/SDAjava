package pl.sdacademy.java.advanced.F_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class F_Example {
    public static void example() {
        // Object human has an actual type of Human
        Human human = new Human();
        Bird bird = new Bird();

        Eatable mouse = new Eatable() {
            @Override
            public void eat(String food) {
                System.out.println(" Mouse eat " + food);
            }
        };
        mouse.eat("chedder");

        List<Soundable> soundables = new ArrayList<>();
        soundables.add(human); // Here it becomes perceived as a Soundable
        soundables.add(bird);
        soundables.add(new Car());
        soundables.add(new Speaker());
        soundables.add(new Trumpet());

        for (Soundable soundable : soundables) {
            soundable.makeSound();
        }

        List<Eatable> eatables = new ArrayList<>();
        eatables.add(human); // And here it becomes perceived as an Eatable
        eatables.add(bird);

        for (Eatable eatable : eatables) {
            eatable.eat("Bread");
        }
    }
}
