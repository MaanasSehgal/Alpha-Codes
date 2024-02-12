package Lec19;

import java.util.ArrayList;

public class swapTwoNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(5);

        System.out.println(list);

        int idx1 = 3;
        int idx2 = 0;

        //swap
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.println("\nAfter swap indexes: " + idx1 + " and " + idx2 + ", updated list: \n" + list);
    }
}
