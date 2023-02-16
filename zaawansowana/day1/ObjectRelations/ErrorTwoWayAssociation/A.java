package pl.sdacademy.java.zaawansowana.day1.ObjectRelations.ErrorTwoWayAssociation;

public class A {
    private B myBObj;

    public B getMyBObj() {
        return myBObj;
    }

    public A(B myBObj) {
        this.myBObj = myBObj;
    }
}
