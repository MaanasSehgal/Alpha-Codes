package Lec22.hwlec22;

import java.util.*;

//We have a singly linked list of characters, write a function that returns true if the given list is a palindrome, else false."
public class q1 {

    //TC: O(N) SC: O(N)

    public static class Node {

        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean checkPalindrome(Node head) {
        Node temp = head;
        Stack<Character> s = new Stack<>();

        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        //reinitialize
        temp = head;

        while (!s.isEmpty() && temp != null) {
            if (s.pop() != temp.data) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('C');
        head.next.next.next = new Node('B');
        head.next.next.next.next = new Node('A');

        if (checkPalindrome(head)) {
            System.out.println("The linkedlist is a palindrome");
        } else {
            System.out.println("The linkedlist is not a palindrome");
        }
    }
}
