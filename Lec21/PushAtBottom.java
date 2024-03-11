package Lec21;

import java.util.Stack;

public class PushAtBottom {

    static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    static void printStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        System.out.println(top);
        printStack(s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        pushAtBottom(s, 0);
        printStack(s);
    }
}
