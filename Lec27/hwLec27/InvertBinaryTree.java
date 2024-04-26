package Lec27.hwLec27;

public class InvertBinaryTree {

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

    public static boolean checkMirrored(Node leftRoot, Node rightRoot) {
        if (leftRoot == null && rightRoot == null) {
            return true;
        } else if (leftRoot == null || rightRoot == null) {
            return false;
        }

        if (leftRoot.data != rightRoot.data) {
            return false;
        }

        return checkMirrored(leftRoot.left, rightRoot.right) && checkMirrored(leftRoot.right, rightRoot.left);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.right.left = new Node(2);
        root.right.right = new Node(1);

        System.out.println(checkMirrored(root.left, root.right));
    }
}
