package Lec16.hwlec16;

public class hw3 {

    public static int findLength(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return findLength(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        System.out.println(findLength("oogaa booga"));
    }
}
