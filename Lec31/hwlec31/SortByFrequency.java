package Lec31.hwlec31;

import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        String s = "cccaaa";
        // sort in decreasing order

        // TreeMap <Frequency, Character>
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);

            map.put(currChar, map.getOrDefault(currChar, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        map.entrySet().forEach(el -> {
            for (int i = 0; i < el.getValue(); i++) {
                sb.append(el.getKey());
            }
        });

        System.out.println(sb.toString());
    }
}
