package pl.sdacademy.java.advancedPrograming.day4.Ex27;


public class Joiner<T> {
    String separator;
    T[] arrayIn;

    @SafeVarargs
    public Joiner(String separator, T... t) {
        this.separator = separator;
        this.arrayIn = t;
    }

    @Override
    public String toString() {
        String a = "";
        for (int i = 0; i < arrayIn.length - 1; i++) {
            a += arrayIn[i].toString() + separator;
        }
        a += arrayIn[arrayIn.length - 1];
        return a;
    }

    public static void main(String[] args) {
        Joiner<Integer> a = new Joiner<>("-", 1, 3, 5, 7);
        System.out.println(a);
        Joiner<String> b = new Joiner<>("-", "1", "G", "5", "f");
        System.out.println(b);
    }
}
