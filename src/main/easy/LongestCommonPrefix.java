package main.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {

    /**
     * Runtime: 4 ms, faster than 99.85% of Java online submissions for Longest Common Prefix.
     * Memory Usage: 38.9 MB, less than 17.65% of Java online submissions for Longest Common Prefix.
     * @param strs ["flower", "flow", "flight"]
     * @return fl
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0) return "";
            }
        }
        return prefix;

    }

    public static void main(String[] args) {

        String[] input = {"flower", "flow", "flight"};

        String ret = longestCommonPrefix(input);
        System.out.println(ret);
    }
}
