package hwlec17;

import java.util.Arrays;

//Question 1: Apply Merge Sort to sort an array of Strings. (Assume all characters are in lowercase).

// Sample Input 1:
// arr = { "sun", "earth", "mars", "mercury"}

// Sample Output 1:
// arr = { "earth", "mars", "mercury", "sun"}

public class hw1 {

    public static void printArray(String arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];

        //iterators
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        //leftover
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //right
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
