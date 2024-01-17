package Lec10;

public class insertionSort {

    public static void sort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            //finding out the correct position
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            ///insertion
            arr[prev + 1] = curr;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        sort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
