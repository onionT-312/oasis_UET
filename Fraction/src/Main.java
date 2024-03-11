//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution fraction1= new Solution(10,0);
        Solution fraction2= new Solution(9,4);

        // In ra các phân số ban đầu
        System.out.println("Fraction 1: " + fraction1.getNumerator() + "/" + fraction1.getDenominator());
        System.out.println("Fraction 2: " + fraction2.getNumerator() + "/" + fraction2.getDenominator());

        // Rút gọn phân số
        fraction1 = fraction1.reduce();
        fraction2 = fraction2.reduce();

        // In ra các phân số sau khi rút gọn
        System.out.println("Reduced Fraction 1: " + fraction1.getNumerator() + "/" + fraction1.getDenominator());
        System.out.println("Reduced Fraction 2: " + fraction2.getNumerator() + "/" + fraction2.getDenominator());

        // Cộng hai phân số
        Solution sum = fraction1.add(fraction2);
        System.out.println("Sum: " + sum.getNumerator() + "/" + sum.getDenominator());

        // Trừ hai phân số
        Solution difference = fraction1.subtract(fraction2);
        System.out.println("Difference: " + difference.getNumerator() + "/" + difference.getDenominator());

        // Nhân hai phân số
        Solution product = fraction1.multiply(fraction2);
        System.out.println("Product: " + product.getNumerator() + "/" + product.getDenominator());

        // Chia hai phân số
        Solution quotient = fraction1.divide(fraction2);
        System.out.println("Quotient: " + quotient.getNumerator() + "/" + quotient.getDenominator());

        // So sánh hai phân số
        System.out.println("Are the fractions equal? " + fraction1.equals(fraction2));
    }

}