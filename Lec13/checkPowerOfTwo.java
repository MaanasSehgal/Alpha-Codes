public class checkPowerOfTwo {

    public static boolean checkTwoPower(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        if (checkTwoPower(n)) {
            System.out.println(n + " is in power of 2");
        } else {
            System.out.println(n + " is not in power of 2");
        }
    }
}
