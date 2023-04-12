package pl.sdacademy.java.advanced.B_ObjectRelations.Composition.AggregationOne;

public class B {
    private C[] myCObjs;

    public C[] getMyCObjs() {
        return myCObjs;
    }

    public B(C[] myCObjs) {
        this.myCObjs = myCObjs;
    }
}
