package Practice;
public class prefixArray {

    public static void main(String[] args) {
        int arr[] = { 3, 5, -2, 3, -7, -1, 2, 12, 1, -2 };
        int n = arr.length;

        //prefix/running sum of array
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        //max subarray sum

        int maxSum = arr[0];

        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(currSum, maxSum);
            }
        }

        System.out.println("Max sum by prefix is: " + maxSum);
    }
}
