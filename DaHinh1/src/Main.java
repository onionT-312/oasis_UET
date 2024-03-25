public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());
        // System.out.println(s1.getRadius()); // Cannot access getRadius() from Shape

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Filled: " + c1.isFilled());
        System.out.println("Radius: " + c1.getRadius());

        // Shape s2 = new Shape(); // Shape is an abstract class and cannot be instantiated

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());
        System.out.println("Perimeter: " + s3.getPerimeter());
        System.out.println("Color: " + s3.getColor());
        // System.out.println(s3.getLength()); // Cannot access getLength() from Shape

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Color: " + r1.getColor());
        System.out.println("Length: " + r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println("Area: " + s4.getArea());
        System.out.println("Color: " + s4.getColor());
        // System.out.println(s4.getSide()); // Cannot access getSide() from Shape

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Color: " + r2.getColor());
        // System.out.println(r2.getSide()); // Cannot access getSide() from Rectangle
        System.out.println("Length: " + r2.getLength());

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Color: " + sq1.getColor());
        System.out.println("Side: " + sq1.getSide());
        System.out.println("Length: " + sq1.getLength());
    }
}
