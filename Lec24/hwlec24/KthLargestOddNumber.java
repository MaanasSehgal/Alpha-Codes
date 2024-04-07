package hwlec24;

public class KthLargestOddNumber {

    public static void main(String[] args) {
        int L = -3, R = 4;
        int K = 2;

        if (R % 2 == 0) {
            R--;
        }

        int ans = R - (2 * (K - 1));

        if (L <= ans) {
            System.out.println("Kth largest odd number in range is " + ans);
        } else {
            System.out.println("Kth largest odd number doesn't exist for K = " + K);
        }
    }
}
