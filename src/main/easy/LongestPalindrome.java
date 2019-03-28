package main.easy;

/**
 * Given a string which consists of lowercase or uppercase letters,
 * find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 *
 * https://leetcode.com/problems/longest-palindrome/
 */
public class LongestPalindrome {
    /**
     *
     *     Explanation:
     *          One longest palindrome that can be built is "dccaccd", whose length is 7.
     * @param s "abccccdd"
     * @return 7
     */
    public int longestPalindrome(String s) {
        if(s.length() < 3)
            return s.length();
    }


}
