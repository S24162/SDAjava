package pl.sdacademy.java.basic.library;

public class Book {
    String title;
    Person author = new Person();
    Person translator = new Person();;
    int publishmentYear;


    public String toString() {
        return title + " (" + publishmentYear + ")";
    }
}
