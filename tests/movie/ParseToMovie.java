package pl.sdacademy.java.tests.movie;


public class ParseToMovie {
    public static void main(String[] args) {
        String example = "The Shawshank Redemption;Frank Darabont;73_300_000;September 10, 1994";
        Movie a = ParseToMovie.stringToMovie(example);
        System.out.println(
                a.title + ";" +
                a.director + ";" +
                a.boxOffice + ";" +
                a.releaseDate);
    }

    public static Movie stringToMovie (String sentenceToConvert) {
        String[] split = sentenceToConvert.split(";");
        if (split.length != 4)
            return null;

        Movie movie = new Movie();
        movie.title = split[0];
        movie.director = split[1];
        movie.boxOffice = Integer.parseInt(split[2].replace("_",""));
        movie.releaseDate = split[3];

        return movie;
    }
}
