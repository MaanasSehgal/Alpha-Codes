package Lec19;

import java.util.ArrayList;

public class bs {

    public static void binarySearch(ArrayList<Integer> list, int target) {
        int start = 0, end = list.size() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (list.get(mid) == target) {
                System.out.println("Target found at index: " + mid);
                return;
            }

            if (list.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Index not found!");
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //initialize
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        int target = 4;

        binarySearch(list, target);
    }
}
