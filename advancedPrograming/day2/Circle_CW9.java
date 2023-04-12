package pl.sdacademy.java.advancedPrograming.day2;

public class Circle_CW9 {
    private Point2D_CW9 center, point;

    public Circle_CW9(Point2D_CW9 center, Point2D_CW9 point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius(){
        return Math.sqrt(Math.pow(point.getX() - center.getX(), 2.0) + Math.pow(point.getY() - center.getY(),2.0));
    }

    public double getPerimeter() {
        return 2.0;
    }
}
