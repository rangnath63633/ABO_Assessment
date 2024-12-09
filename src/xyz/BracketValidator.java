package xyz;

import java.util.Stack;

public class BracketValidator {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[(])}";
        String test3 = "{[(";
        String test4 = "[]{}()";
        String test5 = "()";

        System.out.println("Test 1: " + isBalanced(test1));
        System.out.println("Test 2: " + isBalanced(test2));
        System.out.println("Test 3: " + isBalanced(test3));
        System.out.println("Test 4: " + isBalanced(test4));
        System.out.println("Test 5: " + isBalanced(test5));
    }
}
