package Lec31;

import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> { // generic class (any type)
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of elements
        private int N; // number of buckets
        private LinkedList<Node> buckets[]; // N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];

            // initialize all the buckets with linked list
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
            // 123456789 -> 123456789 % 4 = 1
            // -123456789 -> -123456789 % 4 = -1 -> We need +ve
        } // O(1)

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[2 * N];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }
            n = 0;

            // copy old data to new buckets, nodes -> add in bucket
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) { // O(Lambda) -> O(1)
            int bi = hashFunction(key); // bucket index (0, 1, 2, 3)
            int di = searchInLL(key, bi); // data index: valid or -1

            if (di != -1) {// exists
                // update
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                // new node
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) { // O(Lambda) -> O(1)
            int bi = hashFunction(key); // bucket index (0, 1, 2, 3)
            int di = searchInLL(key, bi); // data index: valid or -1

            if (di != -1) {// exists
                return true;
            } else {
                return false;
            }
        }

        public V get(K key) { // O(Lambda) -> O(1)
            int bi = hashFunction(key); // bucket index (0, 1, 2, 3)
            int di = searchInLL(key, bi); // data index: valid or -1

            if (di != -1) {// exists
                return buckets[bi].get(di).value;
            } else {
                return null;
            }
        }

        public V remove(K key) { // O(Lambda) -> O(1)
            int bi = hashFunction(key); // bucket index (0, 1, 2, 3)
            int di = searchInLL(key, bi); // data index: valid or -1

            if (di != -1) {// exists
                n--; // update size
                return buckets[bi].remove(di).value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("USA", 200);
        map.put("UK", 300);
        map.put("Russia", 400);

        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println(map.get("India"));
        System.out.println(map.remove("India"));
        System.out.println(map.get("India"));
    }
}
