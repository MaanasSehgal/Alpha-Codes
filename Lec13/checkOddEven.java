public class checkOddEven {

    public static void main(String[] args) {
        int n = 4;
        int bitMask = 1;

        if ((n & bitMask) == 1) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
}
