package Lec22;

import java.util.Stack;

public class ValidParenthesis {

    public static char checkOpeningBracket(char c) {
        switch (c) {
            case ')':
                return '(';
            case ']':
                return '[';
            case '}':
                return '{';
        }
        return '(';
    }

    public static boolean isOpeningBracket(char c) {
        if (c == '(' || c == '[' || c == '{') return true;
        return false;
    }

    public static boolean checkValidParenthesis(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char currBracket = str.charAt(i);
            if (isOpeningBracket(currBracket)) {
                s.push(currBracket);
            } else {
                char openingBracket = checkOpeningBracket(currBracket);
                if (!s.isEmpty() && s.peek() == openingBracket) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String str = "()]{}";
        // String str = "()";
        // String str = ")(";
        // String str = "({[]}())";
        String str = "([]{})";
        boolean isValid = checkValidParenthesis(str);

        if (isValid) {
            System.out.printf("The parenthesis string '%s' is a valid parenthesis string", str);
        } else {
            System.out.printf("The parenthesis string '%s' is not a valid parenthesis string", str);
        }
    }
}
