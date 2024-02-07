public class MergeSort {

    public static void printArr(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        //mid
        int mid = si + (ei - si) / 2;

        //left
        System.out.println();
        System.out.print("Left: ");
        printArr(arr);
        mergeSort(arr, si, mid);

        //right
        System.out.println();
        System.out.print("Right: ");
        printArr(arr);
        mergeSort(arr, mid + 1, ei);

        System.out.println();
        System.out.print("Merge called: ");
        printArr(arr);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; //iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0; //iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part:leftover part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //right part: leftover part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);

        printArr(arr);
    }
}
