import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point() {
        this.pointX = 0;
        this.pointY = 0;
    }

    /**
     * Point constructor.
     *
     * @param pointX pointX
     * @param pointY pointY
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    @Override
    public String toString() {
        return String.format("(%.1f,%.1f)", this.pointX, this.pointY);
    }

    /**
     * Calculates the distance between this point and another point.
     *
     * @param newPoint The other point
     * @return The distance between this point and the other point
     */
    public double distance(Point newPoint) {
        double diffX = this.pointX - newPoint.getPointX();
        double diffY = this.pointY - newPoint.getPointY();
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return Math.abs(pointX - point.pointX) < 0.001
                && Math.abs(pointY - point.pointY) < 0.001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }
}
