public class fibNumber {

    public static int findFibNum(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return findFibNum(n - 1) + findFibNum(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(findFibNum(4));
    }
}
