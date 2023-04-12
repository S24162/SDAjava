package pl.sdacademy.java.advanced.E_Inheritance.Shapes;

// Square inherits from Rectangle; Square is a Rectangle
// Defines, that all squares have one length - a

public class Square extends Rectangle {

    // We only use minimum amount of code, to modify Rectangle's behaviour into a Square behaviour
    // Square is a Rectangle, for which a=b (that's what we do in the constructor)

    public Square(Double a) {
        super(a, a);
        // Super call - uses the logic from a superclasses constructor
    }

    // Square::getName overrides Rectangle::getName
    // And Rectangle::getName overrides Shape::getName
    @Override
    public String getName() {
        return "Square";
    }
}
