package pl.sdacademy.java.advanced.I_FunctionalProgramming.StreamsClassWork;

import java.util.Arrays;

public class Person {
    String name;
    String surname;
    int age ;
    String[] hobbies;

    public Person(String name, String surname, int age, String... hobbies) {
        this.name = name;
        this.surname = surname;
        this.hobbies = hobbies;
        this.age = age;
    }

    public Person(Person original) {
        this.name = original.name;
        this.surname = original.surname;
        this.age = original.age;
        this.hobbies = original.hobbies;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString () {
        String summary = name + " " + surname + " Age:" + age + " | " + "Hobbies : ";
        for (String hobby : hobbies){
            summary += hobby + " ";
        }
        summary += "\n";
        return summary;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String[] getHobbies() {
        return hobbies;
    }
}
