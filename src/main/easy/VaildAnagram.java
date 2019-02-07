package main.easy;

import java.util.Arrays;

/**
 * Created by jaesang on 2019-02-07.
 */
public class VaildAnagram {

    /**
     * Runtime: 3 ms, faster than 88.74% of Java online submissions for Valid Anagram.
     * Memory Usage: 28.9 MB, less than 3.47% of Java online submissions for Valid Anagram.
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram_sorting(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] char_s = s.toCharArray();
        char[] char_t = t.toCharArray();

        Arrays.sort(char_s);
        Arrays.sort(char_t);

        return Arrays.equals(char_s, char_t);
    }

    /**
     * Runtime: 3 ms, faster than 88.74% of Java online submissions for Valid Anagram.
     * Memory Usage: 27.7 MB, less than 23.78% of Java online submissions for Valid Anagram.
     * @param s
     * @param t
     * @return
     */

    public boolean isAnagram_table(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] tables = new int[26];

        for (int i = 0; i < s.length(); i++) {
            tables[s.charAt(i) - 'a']++;
            tables[t.charAt(i) - 'a']--;
        }

        for(int flag : tables) {
            if(flag !=0)
                return false;
        }
        return true;

    }
}
