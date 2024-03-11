package Lec21;

public class StackLL {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {

        static Node head = null;

        public boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void pop() {
            if (head == null) return;
            head = head.next;
        }

        public int peek() {
            if (head == null) return -1;
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
