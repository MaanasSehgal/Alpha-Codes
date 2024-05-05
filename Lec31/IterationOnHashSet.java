package Lec31;

import java.util.*;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        @SuppressWarnings("rawtypes")
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
