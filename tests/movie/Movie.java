package pl.sdacademy.java.tests.movie;

/*Zadania zaawansowane
        Napisz mechanizm parsujący poniższy ciąg znaków na obiekt typu Movie
        The Shawshank Redemption;Frank Darabont;73_300_000;September 10, 1994*/

class Movie {
    String title;
    String director;
    int boxOffice;
    String releaseDate;

    public Movie() {}

    public Movie(String title, String director, int boxOffice, String releaseDate) {
        this.title = title;
        this.director = director;
        this.boxOffice = boxOffice;
        this.releaseDate = releaseDate;
    }
}
