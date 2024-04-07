import java.util.Arrays;

public class MinAbsoluteDifferencePairs {

    public static void main(String[] args) {
        int A[] = { 1, 2, 3 };
        int B[] = { 4, 5, 6};

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += Math.abs(A[i] - B[i]);
        }
        System.out.println("Absolute minimum sum is: " + sum);
    }
}
