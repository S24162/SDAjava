package pl.sdacademy.java.advanced.H_Files.CSV;

public class Book {
    private final String title;
    private final String author;
    private final Integer releaseYear;
    private final Integer pagesAmount;
    private final Double soldAmountInMillions;

    public Book(String title, String author, Integer releaseYear, Integer pagesAmount, Double soldAmountInMillions) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pagesAmount = pagesAmount;
        this.soldAmountInMillions = soldAmountInMillions;
    }

    public Book(String[] record) {
        try {
            this.title = record[0];
            this.author = record[1];
            this.releaseYear = Integer.parseInt(record[2]);
            this.pagesAmount = Integer.parseInt(record[3]);
            this.soldAmountInMillions = Double.parseDouble(record[4]);
        }
        catch (IndexOutOfBoundsException | NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    public String[] toRecord() {
        return new String[] {
                this.title,
                this.author,
                this.releaseYear.toString(),
                this.pagesAmount.toString(),
                this.soldAmountInMillions.toString()
        };
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public Integer getPagesAmount() {
        return pagesAmount;
    }

    public Double getSoldAmountInMillions() {
        return soldAmountInMillions;
    }
}
