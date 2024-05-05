package Lec31;

import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashMap;

public class LinkedHashMapCode {
    public static void main(String[] args) {

        HashMap<String, Integer> m = new HashMap<>();
        m.put("India", 135);
        m.put("China", 200);
        m.put("USA", 150);
        m.put("UK", 100);

        System.out.println("HashmMap: " + m);

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("India", 135);
        map.put("China", 200);
        map.put("USA", 150);
        map.put("UK", 100);

        System.out.println("LinkedHashMap: " + map);

        TreeMap<String, Integer> t = new TreeMap<>();
        t.put("India", 135);
        t.put("China", 200);
        t.put("USA", 150);

        System.out.println("TreeMap: " + t);
    }
}
