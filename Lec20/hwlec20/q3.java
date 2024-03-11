package hwlec20;

public class q3 {

    static class Node {

        int data;
        Node next;
    }

    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d -> ", temp.data);
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    static void swap(Node head, int m, int n) {
        int counter = 1;

        Node node1 = head, node2 = head;

        while (counter != m) {
            node1 = node1.next;
            counter++;
        }

        node2 = node1;
        while (counter != n) {
            node2 = node2.next;
            counter++;
        }
    }

    public static void main(String args[]) {
        Node head = null;
        int m = 2, n = 4;
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
        System.out.println("List before swap: ");
        printList(head);

        System.out.println();
        swap(head, m, n);

        System.out.println("List after swap: ");
        printList(head);
    }
}
