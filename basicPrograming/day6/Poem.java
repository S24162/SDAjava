package pl.sdacademy.java.basicPrograming.day6;

public class Poem {
    private Author creator;
    private int stropheNumbers;

    public Poem(Author author, int stropheNumbers){
        creator=author;
        this.stropheNumbers=stropheNumbers;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public Author getCreator() {
        return creator;
    }
}
