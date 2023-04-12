package pl.sdacademy.java.advanced.H_Files.CSV;

import pl.sdacademy.java.advanced.H_Files.DAO;

import java.util.Arrays;

public class BookShopCSV {
    private static String filePath = "D:\\SDA\\HelloSD\\src\\main\\java\\pl\\sdacademy\\java\\advanced\\H_Files\\Files\\fileCSV.csv";

    public static void example() {
        DAO<Book> bookDAO = new BookCSVDAO(filePath);

        bookDAO.create(new Book("Pan Tadeusz", "Adam Mickiewicz", 2023, 400, 100.5));
        bookDAO.create(new Book("Harry Potter", "JK Rowling", 2001, 300, 1000.0));
        bookDAO.create(new Book("Bible", "God", -4000, 1000, 8000000.0));
        bookDAO.delete(0);

        for (Book book : bookDAO.read()) {
            System.out.println(book.getTitle() + " " + book.getAuthor());
        }
//        System.out.println(Arrays.toString(bookDAO.read(1).get().toRecord()));
    }
}
