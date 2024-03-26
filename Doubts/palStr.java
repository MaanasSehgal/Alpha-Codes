
public class palStr {

    public static boolean checkPalindrome(String str) {
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "racecar";
        if (checkPalindrome(str)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
    }
}
