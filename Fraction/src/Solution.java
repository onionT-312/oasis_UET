public class Solution {
    private int numerator;
    private int denominator;

    /**
     * Fraction class constructor.
     *
     * @param numerator   set numerator
     * @param denominator set denominator
     */
    public Solution(int numerator, int denominator) {
        if (denominator != 0) {
            setNumerator(numerator);
            setDenominator(denominator);
        } else {
            setNumerator(numerator);
            setDenominator(1);
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * set denominator = 0 not allowed.
     *
     * @param denominator setter denominator
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * Return gcd of a and b.
     */
    public int gcd(int a, int b) {
        return (b == 0) ? Math.abs(a) : gcd(b, a % b);
    }

    /**
     * Reduce fraction.
     *
     * @return another Fraction instance
     */
    public Solution reduce() {
        int a = gcd(numerator, denominator);
        return new Solution(numerator / a, denominator / a);
    }

    /**
     * add fraction1 vs fraction2.
     *
     * @param a other fraction
     * @return the sum of 2 fractions
     */
    public Solution add(Solution a) {
        if (a.getDenominator() != 0) {
            this.numerator = this.numerator * a.getDenominator()
                    + a.getNumerator() * this.denominator;
            this.denominator = this.denominator * a.getDenominator();
        }
        return this.reduce();
    }

    /**
     * subtraction of 2 fractions.
     *
     * @param a other fraction
     * @return the difference of 2 fractions
     */
    public Solution subtract(Solution a) {
        if (a.getDenominator() != 0) {
            this.numerator = this.numerator * a.getDenominator()
                    - a.getNumerator() * this.denominator;
            this.denominator = this.denominator * a.getDenominator();
        }
        return this.reduce();
    }

    /**
     * multiply 2 fractions.
     *
     * @param a other fraction
     * @return the product of 2 fractions
     */
    public Solution multiply(Solution a) {
        if (a.getDenominator() != 0) {
            this.numerator *= a.getNumerator();
            this.denominator *= a.getDenominator();
        }
        return this.reduce();
    }

    /**
     * divide 2 fractions.
     *
     * @param a other fraction
     * @return quotient 2 fraction
     */
    public Solution divide(Solution a) {
        if (a.getDenominator() != 0) {
            this.numerator *= a.getDenominator();
            this.denominator *= a.getNumerator();
        }
        return this.reduce();
    }

    /**
     * comparison between 2 fractions.
     *
     * @param obj another object that's possibly a fraction
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution other) {
            return numerator * other.getDenominator() == other.getNumerator() * denominator;
        }
        return false;
    }
}
