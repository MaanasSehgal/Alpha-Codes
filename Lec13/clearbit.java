public class clearbit {

    public static void main(String[] args) {
        int n = 10, i = 1;
        int bitMask = ~(1 << i);

        System.out.println(n & bitMask);
    }
}
