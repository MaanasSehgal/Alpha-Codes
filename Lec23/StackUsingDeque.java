import java.util.*;
import java.util.LinkedList;

public class StackUsingDeque {

    public static class Stack {

        Deque<Integer> dq;

        Stack() {
            dq = new LinkedList<>();
        }

        public void push(int data) {
            dq.addFirst(data);
        }

        public int pop() {
            return dq.removeFirst();
        }

        public int peek() {
            System.out.println(dq.getFirst());
            return dq.getFirst();
        }

        public void print() {
            System.out.println(dq);
        }
    }

    public static class Queue {

        Deque<Integer> dq;

        Queue() {
            dq = new LinkedList<>();
        }

        public void add(int data) {
            dq.addLast(data);
        }

        public int remove() {
            return dq.removeFirst();
        }

        public int peek() {
            System.out.println(dq.getFirst());
            return dq.getFirst();
        }

        public void print() {
            System.out.println(dq);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        Queue q = new Queue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();

        s.print();
        q.print();
    }
}
