package Lec22;

import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean checkDuplicateParenthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            //opening, operator, operands
            if (currChar != ')') {
                s.push(currChar);
            } else if (currChar == ')') { //closing
                int count = 0; // Reset count for each closing parenthesis
                while (!s.isEmpty() && s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true; //duplicate
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        // String str = "(a-b)";

        if (checkDuplicateParenthesis(str)) {
            System.out.printf("The parenthesis %s has duplicate parenthesis", str);
        } else {
            System.out.printf("The enthesis %s doesn't have duplicate parenthesis", str);
        }
    }
}
