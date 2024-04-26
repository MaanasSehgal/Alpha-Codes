package Lec27.hwLec27;

public class Univalued {

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

    public static boolean checkUnivalued(Node root, int rootData) {
        if (root == null) {
            return true;
        }

        if (root.data != rootData) {
            return false;
        }

        boolean left = checkUnivalued(root.left, rootData);
        boolean right = checkUnivalued(root.right, rootData);

        return left && right;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);

        System.out.println(checkUnivalued(root, root.data));
    }
}
