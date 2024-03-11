//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            long fib = Solution.fibonacci(i);
            if (fib == -1) {
                System.out.println("Số Fibonacci thứ " + i + " không hợp lệ.");
            } else if (fib == Long.MAX_VALUE) {
                System.out.println("Số Fibonacci thứ " + i + " vượt quá giá trị lớn nhất của kiểu long.");
            } else {
                System.out.println("Số Fibonacci thứ " + i + ": " + fib);
            }
        }
    }
}