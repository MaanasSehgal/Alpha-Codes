public class updateithbit {

    public static void main(String[] args) {
        int n = 10, i = 2;
        int newBit = 0;

        //clearing bit
        int bitMask = ~(1 << i);
        n = n & bitMask;

        //updating bit
        int newBitMask = newBit << i;
        System.out.println(n | newBitMask);
    }
}
