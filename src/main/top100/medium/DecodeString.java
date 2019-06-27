package main.top100.medium;

import java.util.Stack;

/**
 * Given an encoded string, return its decoded string.
 * <p>
 * The encoding rule is: k[encoded_string],
 * where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * <p>
 * You may assume that the input string is always valid;
 * No extra white spaces, square brackets are well-formed, etc.
 * <p>
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers,
 * k. For example, there won't be input like 3a or 2[4].
 * <p>
 * https://leetcode.com/problems/decode-string/
 */
public class DecodeString {

    private boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    /**
     * s = "3[a2[c]]", return "accaccacc".
     * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
     *
     * @param s 3[a]2[bc]
     * @return aaabcbc
     */
/*
    public String decodeString(String s) {

        Stack<Character> stack = new Stack<>();
        int strLength = s.length();

        for (int i = 0; i < strLength; i++) {
            char token = s.charAt(i);

            //check brackets;
            // do something tomorrow..
        }
        return "";
    }
*/

    public String decodeString(String s) {

        Stack<String> st = new Stack<>();

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) != ']'){
                st.push(s.charAt(i) + "");
            }else{
                StringBuilder sbText = new StringBuilder();
                StringBuilder sbNum = new StringBuilder();
                while(!st.peek().equals("[")){
                    sbText.insert(0, st.pop());
                }
                st.pop();
                while(!st.isEmpty() && isNumeric(st.peek())){
                    String n = st.pop();
                    sbNum.insert(0, n);
                }
                st.push(strMultiplier(sbText.toString(), sbNum.toString()));
            }
        }

        StringBuilder f = new StringBuilder();
        while(!st.isEmpty()){
            f.insert(0, st.pop());
        }
        return f.toString();
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static String strMultiplier(String str, String num){
        int t = 1;
        try {
            t = Integer.parseInt(num);
        }catch(NumberFormatException e){
            t = 1;
        }
        StringBuilder sb = new StringBuilder();
        while(t != 0){
            sb.append(str);
            t--;
        }
        return sb.toString();
    }


}
