package pl.sdacademy.java.advanced.F_FinalKeyword;

// Final classes cannot be inherited from
public final class ChildClass extends BaseClass {
    @Override
    public void someMethod() {
        System.out.println("Not hello.");
    }

//    @Override  // Final methods cannot be overriden!
//    public void someOtherMethod() {
//        System.out.println("Very important message!");
//    }
}
