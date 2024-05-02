package Lec29.hwlec29;

public class KthSmallestElement {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(8);

        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right = new Node(11);
        root.right.right = new Node(20);

        int K = 3;
    }
}
