package AllQuestionsPractice;

public class subarrays {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                //subarray
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("] , ");
            }
        }
        // TC: O(n^3)
    }
}
