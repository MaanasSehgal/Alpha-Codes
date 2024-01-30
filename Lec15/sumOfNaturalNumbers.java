public class sumOfNaturalNumbers {

    public static int findSumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }

        return n + findSumOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(findSumOfNaturalNumbers(10));
    }
}
