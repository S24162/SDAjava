package pl.sdacademy.java.basics.library;

public class Book {
    String title;
    Person author = new Person();
    Person translator = new Person();;
    int publishmentYear;


    public String toString() {
        return title + " (" + publishmentYear + ")";
    }
}
