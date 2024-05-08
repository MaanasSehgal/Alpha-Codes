package Lec32;

public class StartsWithProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }

    }

    public static Node root = new Node();

    public static void insert(String word) { // O(L)
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String arr[] = { "apple", "app", "mango", "man", "woman" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        System.out.println(startsWith("wom"));
    }
}
