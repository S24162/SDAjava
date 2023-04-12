package pl.sdacademy.java.advanced.I_FunctionalProgramming.StreamsClassWork;


import java.util.*;
import java.util.stream.Collectors;

public class Queries {
    static List<Person> personList;

    public static void init() {
        personList = new ArrayList<>();
        personList.add(new Person("Arthur", "Ironfist", 38, "Ruling", "Sneaking", "Falling"));
        personList.add(new Person("Nikola", "Ironfist", 9, "Ruling", "Playing", "Run off"));
        personList.add(new Person("Anthony", "Stone", 44, "Hiding"));
        personList.add(new Person("Gomer", "Hero", 34, "Fighting", "Learning"));
    }

    //        1. Zwróć osobę o danym imieniu i nazwisku.
    public static Optional<Person> personByNameAndSurname(String name, String surname) {
        return personList.stream().filter(p -> p.name.equals(name) && p.surname.equals(surname)).findFirst();
    }

    //    2. Zwróć najstarszą osobę.
    public static Optional<Person> personOldest() {
        return personList.stream().max(Comparator.comparingInt(Person::getAge));
    }

    //    3. Zwróć imię najmłodszej osoby.
    public static String personYoungestName() {
//        String resultName = "Not found";
//        Optional<Person> p = personList.stream().min(Comparator.comparingInt(Person::getAge));
//        if (p.isPresent())
//            resultName = p.get().name;
//        return resultName;
        return personList.stream().min(Comparator.comparingInt(Person::getAge))
                .map(Person::getName).orElse("Not found");
    }

    //    4. Zwróć listę osób po 30stce.
    public static List<Person> personListLessThan30() {
        return personList.stream().filter(person -> person.age > 30).toList();
    }

    //    5. Zwróć średni wiek wszystkich osób z listy.
    public static double personListAverageAge() {
//        List<Integer> ageList = personList.stream().map(person -> person.age).toList();
//        double sum = 0;
//        for (int x : ageList)
//            sum += x;
//        return sum / ageList.size();
        return personList.stream().mapToInt(person -> person.age).average().orElse(0);
    }

    //    6. Zwróć listę imion wszystkich osób.
    public static List<String> personAllNamesList() {
        return personList.stream().map(Person::getName).toList();
    }

    //    7. Zwróć listę osób, w kolejności od najmłodszego do najstarszego.
    public static List<Person> personSortedByAgeList() {
        return personList.stream().sorted(Comparator.comparingInt(Person::getAge)).toList();
    }

    //    8. Zwróć listę hobby wszystkich osób (bez powtórzeń).
    public static List<String> personHobbyList() {
//        List<String> hobby = new ArrayList<>();
//
//        List<String[]> hobbies = personList.stream().map(person -> person.hobbies).toList();
//
//        for (String[] x : hobbies) {
//            hobby.addAll(Arrays.asList(x));
//        }
//        return hobby.stream().distinct().toList();
        return personList.stream().flatMap(person -> Arrays.stream(person.getHobbies())).distinct().toList();
    }

    //    9. Zwróć listę osób po 20stce, w kolejności od osoby z największą ilością hobby
    //    do osoby z najmniejszą ilością hobby.
    public static List<Person> personListMoreThanAge20SortedByHobbyNumber() {
        return personList.stream().filter(person -> person.age > 20)
                .sorted(Comparator.comparingInt(Person -> -Person.hobbies.length)).toList();
    }

    //    10. Zwróć listę osób, z czego każdej zwiększyłeś wiek o 10
    //    (zmiana ta nie występuje w oryginalnej liście).
    public static List<Person> personListWithAgeAdd10() {
//        List<Person> personListAdd10ToAge = new ArrayList<>(personList);
//        personListAdd10ToAge.forEach(person -> person.setAge(person.age + 10));
//        return personListAdd10ToAge;
    return personList.stream().map(person -> new Person(person).setAge(person.age + 10)).toList();
    }
}
