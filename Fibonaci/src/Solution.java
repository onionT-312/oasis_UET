public class Solution {
    /**
     * returns the nth fibonacci number.
     *
     * @param n: fibonacci number to find
     * @return: nth fibonacci number
     */
    public static long fibonacci(long n) {
        //n<0 tra ve -1.
        if (n < 0) {
            return -1;
        }
        // n=0 => f(0)=0.
        if (n == 0) {
            return 0;
        }
        // n=1 => f(1)=1.
        if (n == 1 || n == 2) {
            return 1;
        }


        long f0 = 0;
        long f1 = 1;
        long fib = f0 + f1;
        for (int i = 2; i <= n; ++i) {
            fib = f0 + f1;
            if (fib >= 0) {
                f0 = f1;
                f1 = fib;
            } else {
                return Long.MAX_VALUE;
            }
        }

        return fib;
    }
}
