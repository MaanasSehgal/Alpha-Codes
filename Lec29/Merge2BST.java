package Lec29;

import java.util.ArrayList;

public class Merge2BST {

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

    public static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public static Node mergeBST(Node root1, Node root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        inorder(root1, list1);
        inorder(root2, list2);

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                list.add(list1.get(i));
                i++;
            } else {
                list.add(list2.get(j));
                j++;
            }
        }

        //remaining elements of list1 and list2
        while (i < list1.size()) {
            list.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            list.add(list2.get(j));
            j++;
        }

        return formBST(list, 0, list.size() - 1);
    }

    public static Node formBST(ArrayList<Integer> list, int si, int ei) {
        if (si > ei) {
            return null;
        }

        int mid = si + (ei - si) / 2;
        Node root = new Node(list.get(mid));

        root.left = formBST(list, si, mid - 1);
        root.right = formBST(list, mid + 1, ei);

        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        preorder(root1);
        System.out.println();

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        preorder(root2);
        System.out.println();

        Node root = mergeBST(root1, root2);

        preorder(root);
    }
}
