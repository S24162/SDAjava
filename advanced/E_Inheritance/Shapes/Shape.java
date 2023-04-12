package pl.sdacademy.java.advanced.E_Inheritance.Shapes;

// Shape - a general base class for all shapes
// Defines, that all shapes have a name, a circumference and an area
// Shape is an abstract class; it cannot be instantiated (have objects)
// instead, it serves as a base/template for its concrete (non-abstract) subclasses
public abstract class Shape {
    int a ;
    static  int b ;
    public static final int c = 0;
    abstract String getName();
    protected abstract Double getCircumference();
    public abstract Double getArea();
}
