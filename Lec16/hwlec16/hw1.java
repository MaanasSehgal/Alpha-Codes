package Lec16.hwlec16;

public class hw1 {

    public static void printIndexes(int arr[], int i, int key) {
        if (i == arr.length) {
            return;
        }

        if (key == arr[i]) {
            System.out.print(i + " ");
        }
        printIndexes(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        printIndexes(arr, 0, key);
    }
}
