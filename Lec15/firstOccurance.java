public class firstOccurance {

    public static int checkFirstOccurance(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return checkFirstOccurance(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(checkFirstOccurance(arr, 0, 3));
    }
}
