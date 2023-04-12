package pl.sdacademy.java.advanced.E_Encapsulation.PackageB;

import pl.sdacademy.java.advanced.E_Encapsulation.PackageA.VeryDefaultClass;
import pl.sdacademy.java.advanced.E_Encapsulation.PackageA.VeryProtectedClass;
import pl.sdacademy.java.advanced.E_Encapsulation.PackageA.VeryPublicClass;

public class ClassInAnotherPackage {
    public static void example() {
        VeryDefaultClass defaultObj = new VeryDefaultClass();
        // defaultObj.name = "Text";
        // defaultObj.number = 2222;
        // defaultObj.doSomethingNonStatic();
        // VeryDefaultClass.doSomethingStatic();

        VeryProtectedClass protectedObj = new VeryProtectedClass();
        // protectedObj.word = "xxx";
        // protectedObj.number = 21.96;
        // protectedObj.myNonStaticMethod();
        // VeryProtectedClass.myStaticMethod();

        VeryPublicClass publicObj = new VeryPublicClass();
        publicObj.myNumber = 77.99;
        publicObj.myWord = "HAHA";
        publicObj.myMethodNonStatic();
        VeryPublicClass.myMethodStatic();
    }
}
