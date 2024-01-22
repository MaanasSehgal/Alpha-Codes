package AllQuestionsPractice;

public class binarySearch {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 8, 9, 12, 23, 77, 399, 1000 };

        int n = arr.length;
        int key = 399;

        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                System.out.println(mid);
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //not found condition

        
        // TC: O(logn)
    }
}
