package Lec28;

public class MirrorBST {

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

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            //left subtree
            root.left = insert(root.left, val);
        }

        if (root.data < val) {
            //right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        inorder(root.left);
        inorder(root.right);
    }

    public static Node mirror(Node root) {
        if (root == null) {
            return root;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror(root.left);
        mirror(root.right);

        return root;
    }

    public static void main(String[] args) {
        // int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        int values[] = { 8, 5, 3, 6, 10, 11 };

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        root = mirror(root);
        inorder(root);
    }
}
