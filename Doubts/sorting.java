
public class sorting {

    public static void bubbleSortArr(int arr[]) {
        int n = 5;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSortArr(int arr[]) {
        int n = 5;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSortArr(int arr[]) {
        int n = 5;

        for (int i = 1; i < n; i++) {
            int curr = i;

            while (curr > 0) {
                if (arr[curr - 1] > arr[curr]) {
                    //swap
                    int temp = arr[curr];
                    arr[curr] = arr[curr - 1];
                    arr[curr - 1] = temp;

                    //curr value decremented
                    curr--;
                } else {
                    break;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        insertionSortArr(arr);

        printArr(arr);
    }
}
