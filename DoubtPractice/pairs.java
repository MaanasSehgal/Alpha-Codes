

public class pairs {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + "), ");
            }
        }
        // TC: O(n^2)
    }
}
