package thisseasx.december2017.experiments;

abstract class SquareShape {

    private double length;
    private double width;

    SquareShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return 2 * (length + width);
    }
}
