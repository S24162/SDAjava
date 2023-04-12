package pl.sdacademy.java.basic.library;

import java.util.Arrays;

public class Library {
    public Book[] books;

    public void search (String word) {
        System.out.println();
        word = "(.*)" + word.toLowerCase() + "(.*)";
        for (Book book : books) {
            if (book.author.surname.toLowerCase().matches(word) ||
                    book.author.name.toLowerCase().matches(word)) {
                System.out.println(book.title + " | " + book.author.name + " "+ book.author.surname + " | " + book.publishmentYear);
            }
        }
    }

    public Book[] getBooksByPublishmentDate(int from, int to) {
        Book[] result = new Book[books.length];

        int j = 0;
        for (Book book : books) {
            int publishmentYear = book.publishmentYear;
            if (publishmentYear >= from && publishmentYear <= to) {
                result[j] = book;
                j++;
            }
        }
        return Arrays.copyOf(result,j);
    }
}
