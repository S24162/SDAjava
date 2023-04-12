package pl.sdacademy.java.advanced.F_FinalKeyword;

public class BaseClass {
    public void someMethod() {
        System.out.println("Hello!");
    }

    // Final methods cannot be overriden!
    public final void someOtherMethod() {
        System.out.println("Very important message!");
    }
}
