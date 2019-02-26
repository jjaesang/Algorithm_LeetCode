package main.easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by JAESANG_MON on 2019-02-26.
 */
public class ValidParentheses {


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
