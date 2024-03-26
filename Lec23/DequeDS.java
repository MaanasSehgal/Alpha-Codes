import java.util.*;
import java.util.LinkedList;

public class DequeDS {

    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
    }
}
