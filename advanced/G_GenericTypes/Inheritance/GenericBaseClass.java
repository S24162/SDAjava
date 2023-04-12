package pl.sdacademy.java.advanced.G_GenericTypes.Inheritance;

public class GenericBaseClass<T> {
    public void doGenericStuff(T element) {
        System.out.println(element.toString());
    }
}
