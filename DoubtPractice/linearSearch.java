

public class linearSearch {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int key = 4;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index: " + i);
            }
        }
    }
}
