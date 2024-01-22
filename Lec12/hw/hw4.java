package hw;

public class hw4 {

    public static boolean checkAnagram(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str2);

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == sb.charAt(j)) {
                    sb.setCharAt(j, '0');
                    break;
                }
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";

        System.out.println(checkAnagram(str1, str2));
    }
}
