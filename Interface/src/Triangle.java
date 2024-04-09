import static java.lang.Math.sqrt;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Triangle construction1.
     */
    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();

    }

    /**
     * Triangle construction2.
     *
     * @param p1 point of p1
     * @param p2 point of p2
     * @param p3 point of p3
     * @throws RuntimeException if the points do not form a valid triangle
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (!isValidTriangle(p1, p2, p3)) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * valid triangle.
     *
     * @param p1 point of p1
     * @param p2 point of p2
     * @param p3 point of p3
     * @return valid triangle
     */
    private boolean isValidTriangle(Point p1, Point p2, Point p3) {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);

        return a > 0 && b > 0 && c > 0
                && a + b > c && a + c > b && b + c > a;
    }


    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        double a = this.p1.distance(this.p2);
        double b = this.p2.distance(this.p3);
        double c = this.p3.distance(this.p1);
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        double a = this.p1.distance(this.p2);
        double b = this.p2.distance(this.p3);
        double c = this.p3.distance(this.p1);
        return a + b + c;
    }

    @Override
    public String getInfo() {
        return String.format("Triangle[%s,%s,%s]",
                this.p1.toString(),
                this.p2.toString(),
                this.p3.toString()
        );
    }
}
