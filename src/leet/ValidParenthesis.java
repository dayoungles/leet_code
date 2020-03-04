package leet;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        if (s == null || s == "") return true;

        Stack stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);

            if (isOpener(curr)) {
                stack.push(curr);
            }

            if (isCloser(curr)) {
                if (stack.empty()) return false;
                if (isMapped((Character) stack.peek(), curr)) {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) return true;
        return false;
    }

    private boolean isMapped(char peek, char curr) {
        if (peek == '{' && curr == '}') return true;
        if (peek == '(' && curr == ')') return true;
        if (peek == '[' && curr == ']') return true;

        return false;
    }

    private boolean isOpener(char peek) {
        if (peek=='(' || peek == '{' || peek == '[') {
            return true;
        }

        return false;
    }

    private boolean isCloser(char curr) {
        if (curr==')' ||  curr== '}' || curr == ']') {
            return true;
        }
        return false;
    }
}
