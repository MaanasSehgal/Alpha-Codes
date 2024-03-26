

public class countingSort {

    public static void printArray(int arr[], int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 2, 1, 6, 3, 7, 4 };
        int arr[] = { 1, 2, 2, 2, 3, 3, 4, 4, 5 };
        int n = arr.length;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }

        int count[] = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int j = 0;

        for (int i = 0; i < max + 1; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        printArray(arr, n);
    }
}
