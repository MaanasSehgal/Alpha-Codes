package Lec37;

public class Fibonacci {
    public static int fib(int n, int[] f) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {// fib(n) is already calculated
            return f[n];
        }
        return f[n] = fib(n - 1, f) + fib(n - 2, f);
    }

    public static void main(String[] args) {
        int n = 6; // 0 1 1 2 3 5
        int f[] = new int[n + 1];
        System.out.println(fib(n, f));
    }
}
