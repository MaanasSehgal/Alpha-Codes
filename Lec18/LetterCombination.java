public class LetterCombination {

    static int count = 0;

    public static void combinations(String digits, String letters, int idx, String[] map) {
        if (idx == digits.length()) {
            count++;
            System.out.print(letters + " ");
            return;
        }

        char digit = digits.charAt(idx);
        for (char letter : map[digit - '0'].toCharArray()) {
            combinations(digits, letters + letter, idx + 1, map);
        }
    }

    public static void main(String[] args) {
        String digits = "41";
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        combinations(digits, "", 0, map);
        System.out.println("\nCount: " + count);
    }
}
