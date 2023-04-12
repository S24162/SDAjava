package pl.sdacademy.java.advanced.E_Encapsulation.PackageB;

import pl.sdacademy.java.advanced.E_Encapsulation.PackageA.VeryProtectedClass;

public class SubClassOfVeryProtectedClass extends VeryProtectedClass {
    public static void example() {
        SubClassOfVeryProtectedClass subObj = new SubClassOfVeryProtectedClass();
        subObj.word = "";
        subObj.number = 7777.78;
        subObj.myNonStaticMethod();
        VeryProtectedClass.myStaticMethod();
//        packagePrivate.anIntB;
    }
}
