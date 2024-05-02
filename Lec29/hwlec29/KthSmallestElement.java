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

    static int i = 1, ans = 0;

    public static void inorder(Node root, int k) {
        if (root == null) {
            return;
        }

        inorder(root.left, k);

        if (i <= k) {
            ans = root.data;
            i++;
        }

        if (i > k) {
            return;
        }
        inorder(root.right, k);
    }

    public static void main(String[] args) {
        Node root = new Node(8);

        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right = new Node(11);
        root.right.right = new Node(20);

        int K = 3;

        inorder(root, K);
        System.out.println(ans);
    }
}
