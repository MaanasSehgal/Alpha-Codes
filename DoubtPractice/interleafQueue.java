import java.util.*;
import java.util.LinkedList;

public class interleafQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        Queue<Integer> temp = new LinkedList<>();

        int mid = q.size() / 2 - 1;

        for (int i = 0; i <= mid; i++) {
            temp.add(q.remove());
        }

        for (int i = 0; i <= mid; i++) {
            q.add(temp.remove());
            q.add(q.remove());
        }

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
