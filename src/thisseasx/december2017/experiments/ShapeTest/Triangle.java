package thisseasx.december2017.experiments.ShapeTest;

public class Triangle implements Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    double getAreaHeron() {
        return Math.sqrt(((sideA + (sideB + sideC)) *
                (sideC - (sideA - sideB)) *
                (sideC + (sideA - sideB)) *
                (sideA + (sideB - sideC)))) / 4;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}