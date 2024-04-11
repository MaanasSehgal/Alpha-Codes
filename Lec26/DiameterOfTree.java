package Lec26;

public class DiameterOfTree {

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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        int totalHeight = Math.max(lh, rh) + 1;
        return totalHeight;
    }

    //APPROACH 1: O(N^2)

    // public static int diameter(Node root) {
    //     if (root == null) {
    //         return 0;
    //     }

    //     int leftDiameter = diameter(root.left);
    //     int leftHeight = height(root.left);
    //     int rightDiameter = diameter(root.right);
    //     int rightHeight = height(root.right);

    //     int selfDiameter = leftHeight + rightHeight + 1;

    //     return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    // }

    static class Info {

        int diam;
        int h;

        public Info(int diam, int h) {
            this.diam = diam;
            this.h = h;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.h + rightInfo.h + 1);
        int height = Math.max(leftInfo.h, rightInfo.h) + 1;

        return new Info(diam, height);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Diameter of tree is: " + diameter(root).diam);
    }
}
