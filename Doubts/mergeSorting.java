public class mergeSorting {

    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        //mid
        int mid = si + (ei - si) / 2;

        mergesort(arr, si, mid); //left
        mergesort(arr, mid + 1, ei); //right
        merge(arr, si, mid, ei); //merge
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        //iterators
        int i = si; //left
        int j = mid + 1; //right
        int k = 0; //temp

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        //leftover elements

        //left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        //right
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy to main array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArray(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 4, 2, 1, 7, 3, 6 };
        printArray(arr);
        mergesort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
