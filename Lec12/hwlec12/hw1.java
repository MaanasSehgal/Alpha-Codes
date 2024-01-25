package hwlec12;

public class hw1 {

    public static void main(String[] args) {
        String str = "helloWorld";
        int lowerCharCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                lowerCharCount++;
            }
        }
        System.out.println("Lower character count = " + lowerCharCount);
    }
}
