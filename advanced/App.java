package pl.sdacademy.java.advanced;

import pl.sdacademy.java.advanced.A_EnumExample.Product;
import pl.sdacademy.java.advanced.C_SingletonExample.Sun;
import pl.sdacademy.java.advanced.C_StaticVsNonStatic.Person;
import pl.sdacademy.java.advanced.D_Collections.*;
import pl.sdacademy.java.advanced.E_Encapsulation.PackageA.ClassInTheSamePackage;
import pl.sdacademy.java.advanced.E_Encapsulation.PackageA.VeryDefaultClass;
import pl.sdacademy.java.advanced.E_Encapsulation.PackageA.VeryProtectedClass;
import pl.sdacademy.java.advanced.E_Encapsulation.PackageA.VeryPublicClass;
import pl.sdacademy.java.advanced.G_DataAccessObject.AppLogic;
import pl.sdacademy.java.advanced.H_Files.JSON.BookShopJSON;
import pl.sdacademy.java.advanced.I_FunctionalProgramming.Streams.VideoGame;
import pl.sdacademy.java.advanced.I_FunctionalProgramming.Streams.VideoGameQueries;
import pl.sdacademy.java.advanced.I_FunctionalProgramming.StreamsClassWork.Queries;
import pl.sdacademy.java.advanced.K_MultiThreading.*;


class App {
    public static void main(String[] args) throws ThisIsWrongYouMoronException {

//        a_EnumApp();
//        b_ObjectRelations();
//        c_StaticVsNonstaticAndSingleton();
//        d_Collections();
//        e_OrganismsAndShapes();
//        e_encapsulation();
//        f_interfaces();
//        g_genericTypes();
//        h_Files();
//        i_FuncProgramming();
//        j_Reflections();
        k_MultiThreading();
    }


    //    Testing apps
    private static void a_EnumApp() {
        Product myProduct = Product.SAUSAGE;
        System.out.println(myProduct.name());

        myProduct.toPrint();
        myProduct.a = 1;
        myProduct.toPrint();

    }

    private static void b_ObjectRelations() {
        pl.sdacademy.java.advanced.B_ObjectRelations.Association.A a =
                new pl.sdacademy.java.advanced.B_ObjectRelations.Association.A
                        (new pl.sdacademy.java.advanced.B_ObjectRelations.Association.B());
    }

    private static void c_StaticVsNonstaticAndSingleton() {
//        Sun s = new Sun(50);
//        System.out.println(s.getRadius());
        System.out.println(Sun.getInstance().getRadius());
//        System.out.println(s.getInstance().getRadius());
        System.out.println(Sun.getInstance().getRadius());

        System.out.println("x = " + Person.x);

        System.out.println(Person.getAllPersons().size());
        Person james = new Person("James", 22, "Warsaw");
        System.out.println(Person.getAllPersons().size());
        Person john = new Person("John", 40, "New York");
        System.out.println(Person.getAllPersons().size());

        // accessing non-static fields on different objects
        System.out.println(james.getName());
        System.out.println(john.getName());
        System.out.println(james.getAge());
        System.out.println(john.getCity());

        // invoking non-static methods on different objects
        james.introduce();
        john.introduce();

        // invoking static method via class
        Person.helloWorld();
//        System.out.println(john.x);
//        john.x = 13;
        System.out.println(Person.x);

        // invoking non-static methods on objects, while iterating
        // on a static collection
        for (Person person : Person.getAllPersons()) {
            person.introduce();
        }
    }

    private static void d_Collections() {
//        ArrayExample.createPrefilledArrayAndReadValuesAtIndexes();
//        TwoDimensionalArrayExample.printOut2DArray();
//        ListExample.removeFromList();
//        ListExample.insertIntoList();
//        SetExample.createSetAndAddElementsAndIterate();
        MapExample.createMapOfSalaries();
    }

    private static void e_OrganismsAndShapes() {
//        Human.example();
//        System.out.println();
//        Mammal.example();
//        Computer.example().getRam();
//        ShapesExample.example();
//        ShapesExample.example();
    }

    private static void e_encapsulation() {
        VeryPublicClass pub = new VeryPublicClass();
        VeryPublicClass.myMethodStatic();
        VeryDefaultClass def = new VeryDefaultClass();
        def.getClass().getSimpleName();
        VeryDefaultClass.class.getSimpleName();
        VeryProtectedClass prot = new VeryProtectedClass();
        prot.getClass().getSimpleName();
        ClassInTheSamePackage.example();

    }

    private static void f_interfaces() {
//        F_Example.example();
//        A.example();
//        ExceptionExample.tryCatchBlock();
    }

    private static void g_genericTypes() throws ThisIsWrongYouMoronException {
//        NonGenericSafe.example();
//        SafeWithGenericValue.example();
//        SafeWithGenericValueAndPassword.example();
//        AnimalCage.example();
//        GenericSafe.example();
        AppLogic.staticTestDAO();

      /*  int userInput = 3;
        if (userInput == 3)
            System.out.println("wright");
        else throw new ThisIsWrongYouMoronException();*/
//        ThisIsWrongYouMoronException.example();

    }

    private static void h_Files() {
//        ToDoList.test();
//        BookShopCSV.example();
        BookShopJSON.example();
    }

    private static void i_FuncProgramming() {
//        System.out.println(NonBuilderVideoGame.example().getTitle() +" | "+NonBuilderVideoGame.example().getGenre());
//        CalculatingObject.example();
//        MessageDisplayerLAMBDA.example();
//        LambdaCalculatingObject.example();
        VideoGameQueries.init();
        System.out.println(VideoGameQueries.getTitles());
        System.out.println(VideoGameQueries.getByPublisher("Konami").stream().map(VideoGame::getTitle).toList());
        System.out.println(VideoGameQueries.games.get(1).getTitle());

//        System.out.println(VideoGameQueries.games.stream().filter(videoGame -> videoGame.getTitle().equals("The Witcher 3"))
//                .findFirst().get().getPublisher());
//        System.out.println(VideoGameQueries.games.stream()
//                .max(Comparator.comparingDouble(VideoGame::getSoldUnitsInMillions)).get().getTitle());
//        System.out.println(VideoGameQueries.games.stream().map(videoGame -> videoGame.getTitle()).toList().get(1));
        VideoGameQueries.optionalIfPresentExample("Assasin's Creed");

    }

    private static void j_Reflections() {
//        ReflectionExamples.example(new Book());
//        Book book = new Book();
//        ReflectionExamples.printAllFieldsWithCurrentValues(book);
//        ReflectionExamples.changeFieldValue(book, "author", "newAuthor");
//        ReflectionExamples.printAllFieldsWithCurrentValues(book);
//        ReflectionExamples.invokeMethod(book, "printInfo");
//        ReflectionExamples.invokeMethodWithReturnValue(book, "getTitle");
//        System.out.println();
//        ReflectionExamples.invokeMethodWithParametersAndReturnValue(book, "someMethodWithParameters"
//        , new Object[] {"Hello ", 1000, "world! ", 55.45});
//        ReflectionExamples.createNewInstanceOfClass(Book.class, new Object[] {"The Witcher", "Gratch", 303});

        Queries.init();
        Queries.personByNameAndSurname("Gomer", "Hero")
                .ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));
        Queries.personOldest().ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));
        System.out.println(Queries.personYoungestName() + "\n");
        System.out.println(Queries.personListLessThan30() + "\n");
        System.out.println(Queries.personListAverageAge() + "\n");
        System.out.println(Queries.personAllNamesList() + "\n");
        System.out.println(Queries.personSortedByAgeList() + "\n");
        System.out.println(Queries.personHobbyList() + "\n");
        System.out.println(Queries.personListMoreThanAge20SortedByHobbyNumber() + "\n");
        System.out.println(Queries.personListWithAgeAdd10() + "\n");
    }

    private static void k_MultiThreading() {
//        SingleThreadFizzBuzz.example();
//        MultiThreadFizzBuzz.example();
//        RaceConditionFizzBuzz.example();
//        SynchronizedFizzBuzz.example();
//        DeadlockExample.example();
    }
}
