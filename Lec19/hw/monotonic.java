package Lec19.hw;

import java.util.ArrayList;

public class monotonic {

    public static boolean checkMonotonic(ArrayList<Integer> list) {
        if (list.get(0) < list.get(list.size() - 1)) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) < list.get(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //list1
        // list.add(1);
        // list.add(2);
        // list.add(2);
        // list.add(3);

        //list2
        // list.add(6);
        // list.add(5);
        // list.add(4);
        // list.add(4);

        //list3
        list.add(1);
        list.add(3);
        list.add(2);

        if (checkMonotonic(list)) {
            System.out.println("The list is monotonic");
        } else {
            System.out.println("The list is non monotonic");
        }
    }
}
