package main.easy;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Given a string which consists of lowercase or uppercase letters,
 * find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * <p>
 * https://leetcode.com/problems/longest-palindrome/
 */
public class LongestPalindrome {
    /**
     * Explanation:
     * One longest palindrome that can be built is "dccaccd", whose length is 7.
     *
     * @param s "abccccdd"
     * @return 7
     */
    public static int longestPalindrome(String s) {
        if (s.length() < 3)
            return s.length();

        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(i));
                count++;
            } else {
                hs.add(s.charAt(i));
            }
        }

        /**
         * count value is only even number = 3
         * cc / cc / dd => 3
         */
        if (!hs.isEmpty()) return count * 2 + 1;
        return count * 2;
    }

    public static void main(String[] args) {
        String str = "abccccdd";
        System.out.println(longestPalindrome(str));
    }


}
