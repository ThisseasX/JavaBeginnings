package thisseasx.december2017.experiments.ShapeTest;

public class ShapeTest {

    public static void main(String[] args) {
        Square s = new Square(5, 5);
        Triangle t = new Triangle(5, 5, 5);
        Circle c = new Circle(4);
        Rectangle r = new Rectangle(7, 4);

        System.out.printf("The square's perimeter is: %s\n", s.getPerimeter());
        System.out.printf("The square's area is: %s\n\n", s.getArea());

        System.out.printf("The triangle's perimeter is: %s\n", t.getPerimeter());
        System.out.printf("The triangle's area is: %s\n\n", t.getArea());

        System.out.printf("The circle's perimeter is: %s\n", c.getPerimeter());
        System.out.printf("The circle's area is: %s\n\n", c.getArea());

        System.out.printf("The rectangle's perimeter is: %s\n", r.getPerimeter());
        System.out.printf("The rectangle's area is: %s\n\n", r.getArea());
    }
}
