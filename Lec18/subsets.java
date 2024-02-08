public class subsets {

    public static void findSubsets(String str, String ans, int i) {
        //basecase
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.print(ans + " ");
            }
            return;
        }
        //kaam

        //yes
        findSubsets(str, ans + str.charAt(i), i + 1);

        //no
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        findSubsets(str, "", 0);
    }
}
