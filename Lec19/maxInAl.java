package Lec19;

import java.util.ArrayList;

public class maxInAl {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(3);

        int max = Integer.MIN_VALUE;

        for (int el : list) {
            max = Math.max(max, el);
        }
        System.out.println(max);
    }
}
