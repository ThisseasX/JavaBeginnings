package thisseasx.november2017.exercises;

public class CircleExercise {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(8, "blue");

        System.out.printf("%.2f\n", c1.getArea());
        System.out.printf("%.2f\n", c2.getArea());
        System.out.printf("%.2f\n", c3.getArea());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println(Circle.count);
    }
}
