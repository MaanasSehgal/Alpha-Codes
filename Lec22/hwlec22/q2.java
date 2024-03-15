//We have an absolute path for a file (Unix-style), simplify it. Note that an absolute path always begins with '/' (root directory), a dot in a path represents the current directory, and double dot represents the parent directory.

package Lec22.hwlec22;

import java.util.*;

public class q2 {

    public static void printStack(Stack<Character> s) {
        if (s.isEmpty()) {
            System.out.println();
            return;
        }
        char top = s.peek();
        s.pop();
        System.out.print(top);
        printStack(s);
        s.push(top);
    }

    public static String simplifyPath(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // printStack(s);
            if (curr != '.') {
                s.push(curr);
            } else if (curr == '.') {
                //double dot
                if (i + 1 != str.length() && str.charAt(i + 1) == '.') {
                    s.pop();
                    while (!s.isEmpty() && s.peek() != '/') {
                        s.pop();
                    }
                    if (s.isEmpty()) {
                        s.push('/');
                    }
                } else {
                    s.pop();
                }
            }
        }
        if (s.peek() == '/') {
            s.pop();
            if (s.isEmpty()) {
                s.push('/');
            }
        }

        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            sb.append(s.peek());
            s.pop();
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        // String str = "/apnacollege/";
        String str = "/a/b/././c";
        System.out.println("Output: " + simplifyPath(str));
    }
}
