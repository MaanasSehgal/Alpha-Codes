class Solution {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    StringBuilder sb = new StringBuilder("");
    int sum = 0;

    public int calcSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        sb.append(Integer.toString(root.val));

        calcSum(root.left);
        calcSum(root.right);

        if (root.left == null && root.right == null) {
            sum += Integer.parseInt(sb.toString(), 2);
            sb.deleteCharAt(sb.length() - 1);
        }

        return sum;
    }

    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return calcSum(root);
    }
}
