
public class kadane {

    public static int kadaneAlg(int arr[]) {
        int n = arr.length;
        int currSum = 0, maxSum = 0;

        for (int i = 0; i < n; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int arr[] = { 6, -2, 3, -7, -5, 4, 7, -8, -6, 10, -4 };

        System.out.println(kadaneAlg(arr));
    }
}
