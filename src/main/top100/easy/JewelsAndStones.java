package main.top100.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {

    /**
     * Runtime: 1 ms, faster than 98.59% of Java online submissions for Jewels and Stones.
     * Memory Usage: 36.9 MB, less than 87.95% of Java online submissions for Jewels and Stones.
     * @param J = "aA"
     * @param S = "aAAbbbb"
     * @return 3
     */
    public int numJewelsInStones(String J, String S) {

        Set<Character> jewels = new HashSet<>();
        for(char c : J.toCharArray())
            jewels.add(c);

        int ret =0;
        for(char s : S.toCharArray()){
            if(jewels.contains(s))
                ret++;
        }
        return ret;
    }
}
