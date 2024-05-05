package Lec31;

import java.util.*;

public class HashMapOperations {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);

        System.out.println(hm);

        // Get - O(1)
        System.out.println(hm.get("India"));

        // ContainsKey - O(1)
        System.out.println("India: " + hm.containsKey("India"));
        System.out.println("Russia: " + hm.containsKey("Russia"));

        // Remove - O(1)
        System.out.println(hm.remove("China"));

        // Size - O(1)
        System.out.println(hm.size());

        // IsEmpty - O(1)
        System.out.println(hm.isEmpty());

        // Clear - O(1)
        hm.clear();
        System.out.println(hm);
    }
}
