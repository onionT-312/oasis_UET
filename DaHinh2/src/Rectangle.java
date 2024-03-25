import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * Rectangle constructor.
     */
    public Rectangle() {
        super();
        this.topLeft = new Point();
        this.width = 0;
        this.length = 0;
    }

    /**
     * Rectangle constructor.
     *
     * @param width  width
     * @param length length
     */
    public Rectangle(double width, double length) {
        super();
        this.topLeft = new Point();
        this.width = width;
        this.length = length;
    }

    /**
     * Rectangle constructor.
     *
     * @param width  width
     * @param length length
     * @param color  Shape color
     * @param filled Shape color
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = new Point();
        this.width = width;
        this.length = length;
    }

    /**
     * Rectangle constructor.
     *
     * @param topLeft topLeft
     * @param width   width
     * @param length  length
     * @param color   Shape color
     * @param filled  Shape color
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return String.format(
                "Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%s]",
                this.topLeft.toString(),
                this.width,
                this.length,
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
        Rectangle rectangle = (Rectangle) o;
        return Math.abs(width - rectangle.width) < 0.001
                && Math.abs(length - rectangle.length) < 0.001
                && Objects.equals(topLeft, rectangle.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }
}
