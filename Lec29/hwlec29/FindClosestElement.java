package Lec29.hwlec29;

public class FindClosestElement {

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

    static class Info {

        Node root;
        int minAbsDiff;

        public Info(Node root, int minAbsDiff) {
            this.root = root;
            this.minAbsDiff = minAbsDiff;
        }
    }

    static int sum = 0;

    public static Info findMinDiff(Node root, int K) {
        if (root == null) {
            return new Info(null, K); 
        }

        Info leftInfo = findMinDiff(root.left, K);
        Info rightInfo = findMinDiff(root.right, K);

        int diff = Math.abs(root.data - K);
        int minAbsDiff = Math.min(diff, Math.min(leftInfo.minAbsDiff, rightInfo.minAbsDiff));

        if (minAbsDiff == diff) {
            return new Info(root, minAbsDiff);
        } else if (minAbsDiff == leftInfo.minAbsDiff) {
            return leftInfo;
        } else {
            return rightInfo;
        }
    }

    public static void main(String[] args) {
        sum = 0;
        Node root = new Node(8);

        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right = new Node(11);
        root.right.right = new Node(20);

        int K = 19;

        Info minAbsDiffInfo = findMinDiff(root, K);
        System.out.println("Minimum absolute difference: " + minAbsDiffInfo.root.data);
    }
}
