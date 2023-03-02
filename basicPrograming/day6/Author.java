package pl.sdacademy.java.basicPrograming.day6;

public class Author {
    private String surname;
    private String nationality;

    public String getSurname() {
        return surname;
    }

    public Author(String surname, String nationality){
        this.surname=surname;
        this.nationality=nationality;
    }

    public String getNationality() {
        return nationality;
    }
}
