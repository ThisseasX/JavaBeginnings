package thisseasx.november2017.experiments;

class Circle {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    //////////////////////////////////

    double getDiameter() {
        return 2 * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    //////////////////////////////////

    void printDiameter() {
        System.out.printf("The %.1f circle's diameter is: %.02f\n",
                radius, getDiameter());
    }

    void printPerimeter() {
        System.out.printf("The %.1f circle's perimeter is: %.02f\n",
                radius, getPerimeter());
    }

    void printArea() {
        System.out.printf("The %.1f circle's area is: %.02f\n",
                radius, getArea());
    }

    //////////////////////////////////

    void printAll() {
        printDiameter();
        printPerimeter();
        printArea();
        System.out.println();
    }
}
