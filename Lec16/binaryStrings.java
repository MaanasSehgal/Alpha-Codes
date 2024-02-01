package Lec16;

public class binaryStrings {

    public static void printBinaryStrings(int n, int lastPlace, String str) {
        //basecase
        if (n == 0) {
            System.out.println(str);
            return;
        }
        //kaam
        printBinaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }
}
