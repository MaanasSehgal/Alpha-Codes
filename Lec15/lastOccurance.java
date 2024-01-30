public class lastOccurance {

    public static int checkLastOccurance(int arr[], int i, int key) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return checkLastOccurance(arr, i - 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 5 };
        System.out.println(checkLastOccurance(arr, arr.length - 1, 3));
    }
}
