public class doubt {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void func(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 100;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("Before: ");
        printArray(arr);

        func(arr);
        
        System.out.println("Before: ");
        printArray(arr);
    }
}
