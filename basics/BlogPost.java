package pl.sdacademy.java.basics;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class BlogPost {
    private String title;
    private String author;
    private String content;
    private int views;
    private LocalDateTime publicationDateTime;

    public BlogPost(String title, String author, String content, int views, LocalDateTime publicationDate) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.views = views;
        this.publicationDateTime = publicationDate;
    }

    public BlogPost(String title, String author, String content, int views) {
        this(title, author, content, views, LocalDateTime.now(ZoneId.of("UTC")));
//        this.title = title;
//        this.author = author;
//        this.content = content;
//        this.views = views;
//        this.publicationDateTime = LocalDateTime.now();


    }

    public String toString() {
        return this.toString(ZoneId.systemDefault());
    }

    public String toString(ZoneId zoneId) {
        // pierwszy parametr - czas lokalny, drugi parametr - offset dla tego podanego czasu lokalnego(najlepiej używać UTC),
        // trzeci parametr - pożądana strefa czasowa
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(publicationDateTime, ZoneOffset.UTC, zoneId);
        return String.format("Tytuł: %s\n Autor: %s\n Zawartość %s\n Liczba wyświetleń: %d\n Data publikacji: %s",
                title, author, content, views, zonedDateTime);
    }


    public static void main(String[] args) {
        BlogPost blog1 = new BlogPost("Programowanie", "Maciek", "Programistyka", 1000);
        BlogPost blog2 = new BlogPost("Przegrywanie", "Szpak", "Gaming", 700, LocalDateTime.of(2023, 10, 15, 19, 30));
//        System.out.println(blog1);
//        System.out.println();
//        System.out.printf(blog2.toString());

        BlogPost[] blogs = new BlogPost[]{blog1, blog2};

        printBlogPosts("UTC", blogs);
        printBlogPosts("Europe/Warsaw", blogs);
        printBlogPosts("America/Los_Angeles", blogs);
        printBlogPosts("Africa/Accra", blogs);
        printBlogPosts("Asia/Tokyo", blogs);

        for (BlogPost blogPost : blogs) {
            System.out.println(blogPost);
            System.out.println();
        }
        System.out.println(LocalDateTime.now(ZoneId.of("UTC")));
        System.out.println(LocalDateTime.now(ZoneId.of("GMT")));
    }

    public static void printBlogPosts(String zoneIdString, BlogPost[] blogPosts) {
        for (BlogPost blogPost : blogPosts) {
            ZoneId zoneId = ZoneId.of(zoneIdString);
            System.out.println(blogPost.toString(zoneId));
            System.out.println();
        }
        System.out.println("---------------");
    }


}

