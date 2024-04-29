package Lec29;

public class SortedArrayToBST {

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

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node formBST(int values[], int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = si + (ei - si) / 2;
        Node root = new Node(values[mid]);

        root.left = formBST(values, si, mid - 1);
        root.right = formBST(values, mid + 1, ei);

        return root;
    }

    public static void main(String[] args) {
        int values[] = { 3, 5, 6, 8, 10, 11, 12 };

        Node root = formBST(values, 0, values.length - 1);
        preorder(root);
    }
}
