package main.easy;

/**
 * For strings S and T, we say "T divides S" if and only if S = T + ... + T  (T concatenated with itself 1 or more times)
 * Return the largest string X such that X divides str1 and X divides str2.
 *
 * 1071. Greatest Common Divisor of Strings
 *
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/
 */
public class GCDofString {
    /**
     *
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Greatest Common Divisor of Strings.
     * Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Greatest Common Divisor of Strings.
     *
     *
     * @param str1 ABCABC
     * @param str2 ABC
     * @return ABC
     */
    public static String gcdOfStrings(String str1, String str2) {
        if (str2.length() < str1.length())
            return gcdOfStrings(str2, str1);

        if (str1.isEmpty())
            return str2;

        if (!str2.startsWith(str1))
            return "";

        return gcdOfStrings(str1, str2.substring(str1.length()));
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println(gcdOfStrings(str1, str2));
    }
}
