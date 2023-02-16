package pl.sdacademy.java.basics.library;

import java.util.ArrayList;
import java.util.Arrays;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1;
        book1 = new Book();
        book1.title = "Java Podstawy";
        book1.publishmentYear = 2019;
        book1.author.name = "Eugeniusz";
        book1.author.surname = "Flawiusz";

        Book book2;
        book2 = new Book();
        book2.title = "Java Zaawansowana";
        book2.publishmentYear = 2005;
        book2.author.name = "Ludwig";
        book2.author.surname = "Beethoven";

        Book book3;
        book3 = new Book();
        book3.title = "Hobbit";
        book3.publishmentYear = 2015;
        book3.author.name = "Dolf";
        book3.author.surname = "Lungren";

        Book book4;
        book4 = new Book();
        book4.title = "Metro";
        book4.publishmentYear = 2002;
        book4.author.name = "Adolf";
        book4.author.surname = "Wessarionowich";

        Library Lib = new Library();
        Lib.books = new Book[]{book1, book2, book3, book4};

        System.out.println(Arrays.toString(Lib.getBooksByPublishmentDate(2010, 2020)));
        Lib.search("dOlF");
    }
}
