package Lec29.hwlec29;

public class rangesum {

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

    static int sum = 0;

    public static int calcRangeSum(Node root, int m, int n) {
        if (root == null) {
            return 0;
        }

        if (root.data >= m && root.data <= n) {
            sum += root.data;
            calcRangeSum(root.left, m, n);
            calcRangeSum(root.right, m, n);
        } else if (root.data >= m) {
            calcRangeSum(root.left, m, n);
        } else {
            calcRangeSum(root.right, m, n);
        }

        return sum;
    }

    public static void main(String[] args) {
        sum = 0;
        Node root = new Node(8);

        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right = new Node(11);
        root.right.right = new Node(20);

        int m = 6, n = 11;
        int ans = calcRangeSum(root, 6, 11);

        System.out.println("Range sum: " + ans);
    }
}
