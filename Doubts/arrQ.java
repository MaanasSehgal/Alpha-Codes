import java.util.Arrays;

public class arrQ {

    public static void swap(int arr[], int si, int ei) {
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
    }

    public static void swapInArray(int arr[], int si, int ei) {
        while (si < ei) {
            swap(arr, si, ei);
            si += 2;
            ei -= 2;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 9, 6, 8, 4, 7, 5 };
        int size = arr.length;
        int si = 0;
        int ei = size % 2 == 0 ? size - 2 : size - 1;

        swapInArray(arr, si, ei);

        si = 1;
        ei = size % 2 == 0 ? size - 1 : size - 2;

        swapInArray(arr, si, ei);

        System.out.println(Arrays.toString(arr));
    }
}
