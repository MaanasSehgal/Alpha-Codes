package AllQuestionsPractice;

public class insertionSort {

    public static void printArray(int arr[], int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 1, 2 };
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int prev = i - 1;
            int curr = arr[i];

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        printArray(arr, n);
    }
}
