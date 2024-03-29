public class Circle {
    private double radius;
    private String color;

    protected static final double PI = 3.1415926535;

    /**
     * circle constructor 1.
     */
    public Circle() {
        this.radius = 0;
        color = "red";
    }

    /**
     * circle constructor 2.
     * @param radius radius
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    /**
     * circle constructor 3.
     * @param radius radius
     * @param color color
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * circle to String.
     * @return  circle string
     */
    @Override
    public String toString() {
        return "Circle[radius=" + this.radius + ",color=" + this.color + "]";
    }
}
