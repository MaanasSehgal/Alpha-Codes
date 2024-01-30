public class printIncOrder {

    public static void printInIncOrder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInIncOrder(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printInIncOrder(10);
    }
}
