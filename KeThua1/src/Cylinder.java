public class Cylinder extends Circle {
    private double height;

    /**
     * cylinder constructor 1.
     */
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    /**
     * cylinder constructor 2.
     * @param radius radius
     * @param height height
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * cylinder constructor 3.
     * @param radius radius
     * @param height height
     * @param color color
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2.0 * PI * getRadius() * (height + getRadius());
    }

    /**
     * cylinder to String.
     * @return cylinder string
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + this.height + "]";
    }
}
