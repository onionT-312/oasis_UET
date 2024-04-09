import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create circles
        Circle circle1 = new Circle(new Point(1, 2), 3);
        Circle circle2 = new Circle(new Point(5, 6), 2);

        // Create triangles
        Triangle triangle1 = new Triangle(new Point(1, 2), new Point(2, 3), new Point(3, 0));
        Triangle triangle2 = new Triangle(new Point(-1, -3), new Point(-5, 3), new Point(0, 0));

        // Add shapes to a list
        List<GeometricObject> shapes = new ArrayList<>();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(triangle1);
        shapes.add(triangle2);

        // Create a ShapeUtil instance
        ShapeUtil shapeUtil = new ShapeUtil();

        // Print information of circles and triangles
        System.out.println(shapeUtil.printInfo(shapes));
    }
}
