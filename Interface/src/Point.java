import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Point construction1.
     */
    public Point() {
        this.pointX = 0;
        this.pointY = 0;
    }

    /**
     * Point construction2.
     *
     * @param pointX point of x
     * @param pointY point of y
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


    /**
     * distance.
     *
     * @param other other
     * @return distance between point1 and point2
     */
    public double distance(Point other) {
        return sqrt(pow(this.pointX - other.pointX, 2)
                + pow(this.pointY - other.pointY, 2));
    }

    @Override
    public String toString() {
        return String.format("(%.2f,%.2f)",
                this.pointX,
                this.pointY
        );
    }
}
