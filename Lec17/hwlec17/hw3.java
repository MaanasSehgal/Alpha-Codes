package hwlec17;

public class hw3 {

    // brute force TC: O(n ^ 2) SC: O(1)
    public static int inversionCount(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // public static int inversionCount(int arr[]) {

    // }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        // int arr[] = {2, 3, 4, 5, 6};
        System.out.println(inversionCount(arr));
    }
}
