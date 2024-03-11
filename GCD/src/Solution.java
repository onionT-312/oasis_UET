// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here

    /**
     *
     * @param a : value a
     * @param b : value b
     * @return : return gcd of a and b
     */
    public int gcd(int a, int b) {
        return (b == 0) ? Math.abs(a) : gcd(b, a % b);
//        return Math.abs((b == 0) ? (a) : gcd(b, a % b));

    }

    public static void main(String[] args) {
        Solution solution = new Solution(); // Tạo một đối tượng của lớp Solution
        int a = -4, b = -30;
        System.out.println(solution.gcd(a, b)); // Gọi phương thức gcd từ đối tượng solution
    }
}