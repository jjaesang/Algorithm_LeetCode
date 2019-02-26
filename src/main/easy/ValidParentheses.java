package main.easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Note that an empty string is also considered valid.

 https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    /**
     * Runtime: 4 ms, faster than 98.12% of Java online submissions for Valid Parentheses.
     * Memory Usage: 37.2 MB, less than 22.70% of Java online submissions for Valid Parentheses.
     * @param s "()[]{}"
     * @return false
     *
     * Input: "([)]"
     * Output: false
     */
    public boolean isValid(String s) {
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (mappings.containsKey(c)) {
                char topElement = stack.empty() ? 'X' : stack.pop();
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {

    }
}
