package pl.sdacademy.java.advanced.G_GenericTypes.AnimalCages;

import java.util.ArrayList;
import java.util.List;

// Generic type constraints
// T extends SomeClass (T is a subclass of SomeClass)
// T super SomeClass (T is a superclass of SomeClass)
// T implements SomeInterface (T implements SomeInterface)
// Type constraints allow for more functionalities than unconstrained types
public class AnimalCage<T extends Animal> {
    private T capturedAnimal;

    public Boolean putIn(T animal) {
        if (this.capturedAnimal != null) {
            throw new IllegalArgumentException();
        }
        else {
            this.capturedAnimal = animal;
            capturedAnimal.sleep();
            return true;
        }
    }
    private void putInCat(Cat cat) {

    }

    public T takeOut() {
        if (this.capturedAnimal == null) {
            throw new NullPointerException();
        }
        else {
            T animal = this.capturedAnimal;
            this.capturedAnimal = null; // Nullification
            animal.eat();
            return animal;
        }
    }

    public static void example() {
        Dog dog = new Dog();
        AnimalCage<Dog> dogCage = new AnimalCage<>();
        dogCage.putIn(dog);

        Cat cat = new Cat();
        AnimalCage<Cat> catCage = new AnimalCage<>();
        catCage.putIn(cat);
        cat = null;
        System.out.println(cat);
        cat = catCage.takeOut();
        System.out.println(cat);
        catCage.putIn(cat);

        AnimalCage<Animal> newCage = new AnimalCage<>();
        newCage.putIn(new Dog());


        // A collection of generic objects, where the generic type is unknown, but has a constraint
        // That constraint gives us some functionalities
        List<AnimalCage<? extends Animal>> cages = new ArrayList<>();
        cages.add(dogCage);
        cages.add(catCage);
        cages.add(newCage);
        System.out.println("fot starts " + cages.size());

        // We don't know, what animals are inside these cages
        // But we know that they ARE animals
        // Therefore, we can safely upcast them into animals
        // And invoke Animal methods on them
        for (AnimalCage<?> cage : cages) {
            System.out.print(cage.getClass().getSimpleName() + " with ");
            System.out.println(cage.capturedAnimal.getClass().getSimpleName());
            Animal animalFromCage = cage.takeOut();
            animalFromCage.sleep();
        }

        for (AnimalCage<?> cage : cages) {
            Cat kotek = new Cat();
            System.out.println(cage.capturedAnimal);
            cage.putInCat(kotek);
//            cage.putIn(new Dog());
            System.out.println(" put in koteka");
        }

//         AnimalCage<Integer> intCage = new AnimalCage<>();
        // intCage.putIn(42);
    }

}
