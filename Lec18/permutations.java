public class permutations {

    public static void findPermutations(String str, String ans) {
        //basecase
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        //kaam
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1, str.length());
            findPermutations(newString, ans + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
