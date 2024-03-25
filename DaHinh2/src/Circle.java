import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected double radius;


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
        this.center = new Point();
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
        this.center = new Point();
        this.radius = radius;
    }

    /**
     * Circle constructor.
     *
     * @param center center
     * @param radius radius
     * @param color  Shape color
     * @param filled Shape filled
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        final double PI = 3.1415926535;
        return PI * radius * radius;
    }

    public double getPerimeter() {
        final double PI = 3.1415926535;
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return String.format(
                "Circle[center=%s,radius=%.1f,color=%s,filled=%s]",
                this.center.toString(),
                this.radius,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return Math.abs(radius - circle.radius) < 0.001
                && Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
