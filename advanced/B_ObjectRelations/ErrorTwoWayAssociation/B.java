package pl.sdacademy.java.advanced.B_ObjectRelations.ErrorTwoWayAssociation;

public class B {
    private A myAObj;

    public A getMyAObj() {
        return myAObj;
    }

    public B(A myAObj) {
        this.myAObj = myAObj;
    }
}
