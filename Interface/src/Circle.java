public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;


    /**
     * Circle construction1.
     */
    public Circle() {
        this.center = new Point();
        this.radius = 0;
    }

    /**
     * Circle construction2.
     *
     * @param center point of center
     * @param radius radius
     */
    public Circle(Point center, double radius) {
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

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String getInfo() {
        return String.format("Circle[%s,r=%.2f]",
                this.center.toString(),
                this.radius
        );
    }
}
