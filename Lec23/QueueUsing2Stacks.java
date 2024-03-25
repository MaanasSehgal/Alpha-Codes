import java.util.*;

public class QueueUsing2Stacks {

    static class Queue {

        Stack<Integer> s1;
        Stack<Integer> s2;

        Queue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        //O(n);
        public void add(int data) {
            if (s1.isEmpty()) {
                s1.push(data);
            } else {
                //transfer s1 to s2
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                //push data to s2
                s2.push(data);
                //transfer s2 to s1
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
        }

        public void remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
            } else {
                s1.pop();
            }
        }

        public void peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
            } else {
                //transfer s1 to s2
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                //push data to s2
                System.out.println(s2.peek());
                //transfer s2 to s1
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
        }

        public void print() {
            while (!s1.isEmpty()) {
                System.out.print(s1.peek() + " ");
                s1.pop();
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        q.peek();
        q.remove();
        q.remove();
        q.remove();
        q.remove();

        q.print();
    }
}
