package hwlec20;

class Solution {

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
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }

    static void skipMdeleteN(Node head, int m, int n) {
        Node temp = head;
        int idx = 1;

        while (temp != null && temp.next != null) {
            //come on mth index
            while (idx != m) {
                temp = temp.next;
                idx++;
            }

            int count = 0;
            while (count != n) {
                temp.next = temp.next.next;
                count++;
            }
            idx = 1;
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        Node head = null;
        int M = 3, N = 2;
        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
        System.out.printf("M = %d, N = %d \n" + "Linked list we have is :\n", M, N);
        printList(head);
        skipMdeleteN(head, M, N);
        System.out.printf("\nLinked list on deletion is :\n");
        printList(head);
    }
}
