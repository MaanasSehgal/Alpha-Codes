package Lec31;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        // Key -> element, value -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        map.entrySet().forEach(el -> {
            if (el.getValue() > nums.length / 3) {
                System.out.println(el.getKey());
            }
        });
        
    }
}
