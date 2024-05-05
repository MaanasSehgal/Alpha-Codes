package Lec31;

import java.util.*;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Russia", 200);
        hm.put("UK", 75);

        // Iterate
        Set<String> keys = hm.keySet();
        for (String k : keys) {
            System.out.println(k + " -> " + hm.get(k));
        }

        hm.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        });
    }
}
