package pl.sdacademy.java.advanced.B_ObjectRelations.Association;

// 1 has 1 B
// A associate with B

public class A {
    private B objB;

    public A(B objB) {
        this.objB = objB;
    }

    public B getObjB() {
        return objB;
    }
}
