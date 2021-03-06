package thisseasx.december2017.experiments.ShapeTest;

 class Circle implements Shape {

    private float radius;

    Circle(float radius) {
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
