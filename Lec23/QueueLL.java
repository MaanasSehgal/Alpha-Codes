public class QueueLL {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {

        static Node head = null;
        static Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public void remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
        }

        public void peek() {
            System.out.println("Peek: " + head.data);
            return;
        }

        public void print() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.peek();
        q.print();
    }
}
