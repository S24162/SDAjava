package pl.sdacademy.java.advanced.F_FinalKeyword;

//Abstract classes cannot be final (and vice versa)
//Abstract methods cannot be final (and vice versa)

//        Final fields cannot have their value changed after declaration or by constructor
//        Final methods cannot be overriden
//        Final classes cannot be inherited from
public abstract class AbstractClassWithFinalField {
    protected final String myField;

    public AbstractClassWithFinalField(String myField) {
        this.myField = myField;
    }
}