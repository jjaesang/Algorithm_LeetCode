package main.medium;

import java.util.Stack;

/**
 * Given a string S of '(' and ')' parentheses, we add the minimum number of parentheses ( '(' or ')', and in any positions )
 * so that the resulting parentheses string is valid.
 *
 * Formally, a parentheses string is valid if and only if:
 *
 * It is the empty string, or
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 * Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.
 *
 * https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 */
public class MinimumAddToMakeParenthesesValid {

    /**
     * Runtime: 2 ms, faster than 71.05% of Java online submissions for Minimum Add to Make Parentheses Valid.
     * Memory Usage: 33.3 MB, less than 100.00% of Java online submissions for Minimum Add to Make Parentheses Valid.
     * @param S
     * @return
     */
    public static int minAddToMakeValid(String S) {

        Stack<Character> stack = new Stack<Character>();
        int counter = 0;
        for (int i = 0; i < S.length(); i++) {
            char temp = S.charAt(i);
            if (temp == '(') {
                stack.push(temp);
            } else if (!stack.isEmpty()) {
                stack.pop();
            } else counter++;
        }

        return counter += stack.size();
    }

    public static void main(String[] args) {
        String input = "())";
        System.out.println(minAddToMakeValid(input));
    }
}
