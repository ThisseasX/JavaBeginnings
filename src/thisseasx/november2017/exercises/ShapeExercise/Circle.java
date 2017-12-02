package thisseasx.november2017.exercises.ShapeExercise;

public class Circle {

    private double radius;
    private String color;

    static int count;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this(radius, "red");
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        count++;
    }

    Circle(Circle c) {
        this(c.getRadius(), c.getColor());
    }

    double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("Hello! I am the %.1f circle and I am %s!", radius, color);
    }
}
