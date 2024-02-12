package Lec19;

import java.util.ArrayList;

public class arraylists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add operation(O(1))
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(5, 99);

        //get operation(O(1))
        // int el = list.get(2);
        // System.out.print(el);

        //delete operation(O(n))
        list.remove(2);
        System.out.println(list);

        //set operation(O(n))
        list.set(0, 9);
        System.out.println(list);

        //contains element operation(O(n))
        System.out.println(list.contains(9));
        System.out.println(list.contains(33));

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }
}
