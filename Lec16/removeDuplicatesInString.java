package Lec16;

public class removeDuplicatesInString {

    public static String removeDuplicates(String str, StringBuilder sb, int idx, boolean map[]) {
        if (idx == str.length()) {
            return sb.toString();
        }
        int currCharIdx = (str.charAt(idx)) - 97;
        if (!map[currCharIdx]) {
            sb.append(str.charAt(idx));
            map[currCharIdx] = true;
        }
        return removeDuplicates(str, sb, idx + 1, map);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        boolean map[] = new boolean[26];

        String str = "appnnaacollegee";
        System.out.println(removeDuplicates(str, sb, 0, map));
    }
}
