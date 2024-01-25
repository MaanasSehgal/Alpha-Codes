public class countSetBits {

    public static void main(String[] args) {
        int n = 10;
        int count = 0;

        while (n != 0) {
            if ((n | 1) == n) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("Number of set bits: " + count);
    }
}
