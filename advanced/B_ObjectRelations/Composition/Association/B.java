package pl.sdacademy.java.advanced.B_ObjectRelations.Composition.Association;

public class B {
    private C myCObj;

    public C getMyCObj() {
        return myCObj;
    }

    public B(C myCObj) {
        this.myCObj = myCObj;
    }
}
