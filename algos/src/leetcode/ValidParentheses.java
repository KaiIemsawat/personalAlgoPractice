package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String input = "}(";
        System.out.println(isValid(input));
    }

    public static boolean isValid(String s) {
        if(s.length() %2 != 0)return false;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
        if ((c == ')' || c == ']' || c == '}') && stack.isEmpty()) {
            return false;
        }

         if (c == '(' || c == '[' || c=='{') {
             stack.push(c);
         }   else if (c == ')' && stack.peek() == '(' && !stack.isEmpty()) {
             stack.pop();
         }   else if (c == ']' && stack.peek() == '[' && !stack.isEmpty()) {
             stack.pop();
         }   else if (c == '}' && stack.peek() == '{' && !stack.isEmpty()) {
             stack.pop();
         }
        }
        return stack.isEmpty();
    }
}
