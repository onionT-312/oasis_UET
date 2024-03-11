public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Kiểm tra các số từ 1 đến 20 xem có phải số nguyên tố không
        for (int i = 1; i <= 20; i++) {
            if (solution.isPrime(i)) {
                System.out.println(i + " là số nguyên tố");
            } else {
                System.out.println(i + " không là số nguyên tố");
            }
        }
    }
}
