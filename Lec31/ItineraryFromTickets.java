package Lec31;

import java.util.*;

public class ItineraryFromTickets {

    public static String getStart(HashMap<String, String> map) {
        HashMap<String, String> reverseMap = new HashMap<>();
        // add data to reverse hashmap
        for (String key : map.keySet()) {
            reverseMap.put(map.get(key), key);
        }

        for (String key : map.keySet()) {
            if (!reverseMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String tickets[][] = {
                { "Chennai", "Bengaluru" },
                { "Mumbai", "Delhi" },
                { "Goa", "Chennai" },
                { "Delhi", "Goa" }
        };

        // HashMap<From, To>
        HashMap<String, String> map = new HashMap<>();

        // Add data to hashmap
        for (int i = 0; i < tickets.length; i++) {
            map.put(tickets[i][0], tickets[i][1]);
        }

        String start = getStart(map);
        System.out.print(start);
        for (String key : map.keySet()) {
            System.out.print(" -> " + map.get(start));
            start = map.get(start);
        }
    }
}
