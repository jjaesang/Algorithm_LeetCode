package main.top100.easy;

import java.util.HashMap;

/**
 * 387. First Unique Character in a String
 *
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FindUniqCharacterInString {

    /**
     * s = "leetcode"
     * return 0.
     * <p>
     * s = "loveleetcode",
     * return 2.
     *
     * @param s leetcode
     * @return 0
     */
    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c , 0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(charMap.get(s.charAt(i)) == 1 )
                return i;
        }

        return  -1;

    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
