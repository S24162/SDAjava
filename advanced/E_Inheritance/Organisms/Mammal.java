package pl.sdacademy.java.advanced.E_Inheritance.Organisms;

import java.util.ArrayList;
import java.util.List;

public class Mammal extends Animal {
    public void produceMilk() {
        System.out.println("milking");
    }

    public static void example() {
        Organism organism = new Mammal();
        organism.reproduce();
        organism.nutrition();

        ((Mammal) organism).produceMilk();
        System.out.println(organism.getClass().getSimpleName());

        Mammal mamFromOrg = (Mammal) organism;
        mamFromOrg.produceMilk();
        List<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        System.out.println(a.isEmpty());
        b.ensureCapacity(3);
        System.out.println(((ArrayList) a).size());
        ((ArrayList<Integer>) a).ensureCapacity(3);




    }
}
