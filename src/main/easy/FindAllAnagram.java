package main.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 *
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 *
 */
public class FindAllAnagram {
    /**
     * Runtime: 1483 ms, faster than 2.90% of Java online submissions for Find All Anagrams in a String.
     * Memory Usage: 35.4 MB, less than 5.71% of Java online submissions for Find All Anagrams in a String.
     *
     * @param s "cbaebabacd"
     * @param p "abc"
     * @return [0,6]
     */
    public static List<Integer> findAllAnagrams(String s, String p) {

        List<Integer> resultList = new ArrayList<Integer>();

        if (s.length() == 0)
            return resultList;

        int p_length = p.length();
        int s_length = s.length();

        char[] p_char = p.toCharArray();
        Arrays.sort(p_char);
        for (int i = 0; i < (s_length - p_length)+1; i++) {
            char[] s_char = s.substring(i, i+p_length).toCharArray();
            Arrays.sort(s_char);
            if (Arrays.equals(p_char, s_char))
                resultList.add(i);
        }
        return resultList;
    }
}



