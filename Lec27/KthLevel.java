package Lec27;

import java.util.LinkedList;
import java.util.Queue;

public class KthLevel {

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

    //iterative approach
    public static void levelorder(Node root, int k) {
        int count = 1;

        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    count++;
                    q.add(null);
                }
            } else {
                if (count == k) {
                    System.out.print(currNode.data + " ");
                }

                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    //recursive approach
    public static void findKthLevel(Node root, int k, int currLev) {
        if (root == null) {
            return;
        }

        if (currLev == k) {
            System.out.print(root.data + " ");
            return;
        }

        currLev++;

        findKthLevel(root.left, k, currLev);
        findKthLevel(root.right, k, currLev);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;
        // levelorder(root, k);
        findKthLevel(root, k, 1);
    }
}
