package thisseasx.december2017.experiments.ShapeTest;

abstract class Parallelogram implements Shape {

    private double length;
    private double width;

    Parallelogram(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}
