package Lec37;

public class Fibonacci {
    public static int fibRecursion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }

    public static int fibMemoization(int n, int[] f) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {// fib(n) is already calculated
            return f[n];
        }
        return f[n] = fibMemoization(n - 1, f) + fibMemoization(n - 2, f);
    }

    public static int fibTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6; // 0 1 1 2 3 5
        int f[] = new int[n + 1];
        System.out.println(fibRecursion(n));
        System.out.println(fibMemoization(n, f));
        System.out.println(fibTabulation(n));
    }
}
