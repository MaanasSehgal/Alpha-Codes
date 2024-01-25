public class clearLastTwoBits {

    public static void main(String[] args) {
        int n = 15, i = 2;
        // System.out.println((n >> i) << i);

        int bitMask = (~0) << i;
        System.out.println(n & bitMask);
    }
}
