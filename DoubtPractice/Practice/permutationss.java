public class permutationss {

    public static void findPerms(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int j = 0; j < str.length(); j++) {
            char currChar = str.charAt(j);
            String newStr = str.substring(0, j) + str.substring(j + 1);
            findPerms(newStr, ans + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPerms(str, "");
    }
}
