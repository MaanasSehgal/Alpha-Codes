public class xPowN {

    // O(n)
    // public static int pow(int x, int n) {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     return x * pow(x, n - 1);
    // }

    //O(n)
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPow = pow(x, n / 2);
        int halfPowSq = halfPow * halfPow;

        if (n % 2 != 0) {
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }

    public static void main(String args[]) {
        System.out.println(pow(2, 10));
    }
}
