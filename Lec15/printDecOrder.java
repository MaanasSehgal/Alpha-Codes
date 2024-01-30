public class printDecOrder {

    public static void printInDecOrder(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printInDecOrder(n - 1);
    }
    public static void main(String[] args) {
        printInDecOrder(10);
    }
}
