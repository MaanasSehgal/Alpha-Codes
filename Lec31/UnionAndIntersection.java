package Lec31;

import java.util.HashSet;

public class UnionAndIntersection {// n + m
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        // Union: O (n + m)
        HashSet<Integer> union = new HashSet<>();

        for (int num : arr1) {// add all elements of arr1
            union.add(num);
        }

        for (int num : arr2) {// add all elements of arr2
            union.add(num);
        }

        System.out.print("Union Elements: ");
        for (int num : union) {
            System.out.print(num + " ");
        }

        System.out.println("Union Size: " + union.size());

        // Intersection: O(n + m)
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr2) {
            set.add(num);
        }

        System.out.print("Intersection Elements: ");
        int count = 0;
        for (int num : arr1) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                count++;
                set.remove(num);
            }
        }

        System.out.println("Intersection: " + count);
    }
}
