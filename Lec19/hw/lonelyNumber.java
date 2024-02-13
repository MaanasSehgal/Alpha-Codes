package Lec19.hw;

import java.util.ArrayList;
import java.util.Collections;

public class lonelyNumber {

    public static void checkLonelyNumbers(ArrayList<Integer> list) {
        int n = list.size();
        ArrayList<Integer> ans = new ArrayList<>();

        Collections.sort(list);
        // System.out.println(list);

        //first element
        if (list.get(0) != list.get(1) && list.get(0) + 1 != list.get(1)) {
            ans.add(list.get(0));
        }

        //last element
        if (list.get(n - 1) != list.get(n - 2) && list.get(n - 1) - 1 != list.get(n - 2)) {
            ans.add(list.get(n - 1));
        }

        for (int i = 1; i < list.size() - 1; i++) {
            int currEl = list.get(i);
            int nextEl = list.get(i + 1);
            int prevEl = list.get(i - 1);

            if (currEl == nextEl || currEl == prevEl || currEl + 1 == nextEl || currEl - 1 == prevEl) {
                continue;
            } else {
                ans.add(currEl);
            }
        }
        System.out.println("Lonely numbers are: " + ans);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //list 1
        // list.add(1);
        // list.add(3);
        // list.add(5);
        // list.add(3);

        //list 2
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        checkLonelyNumbers(list);
    }
}
