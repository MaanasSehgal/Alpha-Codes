package Lec31.hwlec31;

import java.util.*;

public class BottomViewOfBT {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    //map<Distance, Node.data>
    public static void postorder(Node root, LinkedHashMap<Integer, Integer> map, int distance) {
        if (root == null) {
            return;
        }

        postorder(root.left, map, distance - 1);
        postorder(root.right, map, distance + 1);

        if (!map.containsKey(distance)) {
            map.put(distance, root.data);
        }
    }

    public static void printBottomView(Node root) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        // find bottom view
        postorder(root, map, 0);

        // loop on map
        for (int el : map.keySet()) {
            System.out.print(map.get(el) + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        printBottomView(root);
    }
}
