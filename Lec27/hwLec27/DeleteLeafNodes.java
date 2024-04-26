package Lec27.hwLec27;

public class DeleteLeafNodes {

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void printTree(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        printTree(root.left);
        printTree(root.right);
    }

    public static boolean deleteLeaf(Node root, int x) {
        if (root == null) {
            return true;
        }

        //if leaf node
        if (root.left == null && root.right == null && root.data == x) {
            return false;
        }

        boolean left = deleteLeaf(root.left, x);
        boolean right = deleteLeaf(root.right, x);

        if (!left) {
            root.left = null;
        }

        if (!right) {
            root.right = null;
        }

        return true;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);

        int x = 3;

        printTree(root);
        System.out.println();

        deleteLeaf(root, x);

        printTree(root);
        System.out.println();
    }
}
