package thisseasx.december2017.experiments;

public class Circle implements AnyShape {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
