import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * Rectangle constructor.
     */
    public Rectangle() {
        super();
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
        this.width = width;
        this.length = length;
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
                "Rectangle[width=%.1f,length=%.1f,color=%s,filled=%s]",
                this.width,
                this.length,
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }

}
