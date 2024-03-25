import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    double PI = 3.1415926535;

    public Circle() {
        super();
        this.radius = 0;
    }

    /**
     * Circle constructor.
     *
     * @param radius radius
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Circle constructor.
     *
     * @param radius radius
     * @param color  Shape color
     * @param filled Shape filled
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return String.format(
                "Circle[radius=%.1f,color=%s,filled=%s]",
                this.radius,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }
}
