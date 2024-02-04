public class QuickSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        //last element
        int pivotIndex = partition(arr, si, ei);
        //sort left
        quickSort(arr, si, pivotIndex - 1);
        //sort right
        quickSort(arr, pivotIndex + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        //pivot = last index
        int pivot = arr[ei];
        int i = si - 1; // to make place for els smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        //swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 1, 5 };
        printArr(arr);
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
