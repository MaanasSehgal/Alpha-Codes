import java.util.*;
import java.util.LinkedList;

public class InterleaveQueue {

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);

        int mid = q1.size() / 2 - 1;

        for (int i = 0; i <= mid; i++) {
            q2.add(q1.remove());
        }

        for (int i = 0; i <= mid; i++) {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }

        while (!q1.isEmpty()) {
            System.out.print(q1.remove() + " ");
        }
    }
}
