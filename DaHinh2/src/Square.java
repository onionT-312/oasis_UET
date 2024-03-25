import java.util.Objects;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    /**
     * Square constructor.
     *
     * @param side   side
     * @param color  Shape color
     * @param filled Shape filled
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Square constructor.
     *
     * @param side   side
     * @param color  Shape color
     * @param filled Shape filled
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return String.format(
                "Square[topLeft=%s,side=%.1f,color=%s,filled=%s]",
                this.topLeft.toString(),
                this.getWidth(),
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
        Square square = (Square) o;
        return Math.abs(width - square.width) < 0.001
                && Objects.equals(topLeft, square.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width);
    }
}
