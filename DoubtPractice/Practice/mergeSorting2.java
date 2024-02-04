public class mergeSorting2 {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        //iterators
        int i = si; //left
        int j = mid + 1; //right
        int k = 0; //temp;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        //leftover: left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //leftover: right
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 2, 6, 1, 7, 3 };
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
