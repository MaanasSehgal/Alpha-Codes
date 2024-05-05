package Lec31;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean checkAnagram(String s1, String s2) {
        // check size
        if (s1.length() != s2.length())
            return false;

        // put s2 in HashMap<Character, Frequency>
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s2.length(); i++) {
            char currChar = s2.charAt(i);
            map.put(currChar, map.getOrDefault(currChar, 0) + 1);
        }

        // comparison with s1
        for (int i = 0; i < s1.length(); i++) {
            char currChar = s1.charAt(i);

            if (map.containsKey(currChar) == false || map.get(currChar) == 0) {
                return false;
            } else {
                map.put(currChar, map.get(currChar) - 1);
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";

        if (checkAnagram(s1, s2)) {
            System.out.println("The two strings are anagram");
        } else {
            System.out.println("The two strings are not anagram");
        }
    }
}
