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
                "Square[side=%.1f,color=%s,filled=%s]",
                this.getWidth(),
                (Objects.equals(this.color, "") ? "null" : this.color),
                this.filled
        );
    }
}
