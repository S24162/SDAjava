package pl.sdacademy.java.advanced.B_ObjectRelations.Composition.AggregationOne;

// 1 A has Many C via 1 B
// A associates with B, which aggregates C
public class A {
    private B myBObj;

    public B getMyBObj() {
        return myBObj;
    }

    public A(B myBObj) {
        this.myBObj = myBObj;
    }

    public C useComposition() {
        C[] myCObjs = myBObj.getMyCObjs();
        return myCObjs[0];
    }
}
