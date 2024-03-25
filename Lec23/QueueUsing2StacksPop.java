import java.util.*;

public class QueueUsing2StacksPop {

    public static class Queue {

        Stack<Integer> s1;
        Stack<Integer> s2;

        Queue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void add(int data) {
            s1.push(data);
        }

        public void peek() {
            System.out.println(s1.peek());
        }

        //O(N)
        public void remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
            } else {
                //s1 to s2
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                //remove
                s2.pop();
                //s2 to s1
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
        }

        public void print() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
            } else {
                //transfer s1 to s2 to reverse order
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }

                //print elements of s2
                while (!s2.isEmpty()) {
                    System.out.print(s2.pop() + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.peek();
        q.print();
    }
}
