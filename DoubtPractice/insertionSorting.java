public class insertionSorting {

    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }

        //printing
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
