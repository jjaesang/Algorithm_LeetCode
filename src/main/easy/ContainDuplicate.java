package main.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainDuplicate {
    /**
     * Runtime: 9 ms, faster than 60.40% of Java online submissions for Contains Duplicate.
     *  Memory Usage: 44.8 MB, less than 5.03% of Java online submissions for Contains Duplicate.
     * @param nums [1,1,1,3,3,4,3,2,4,2]
     * @return true
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sets = new HashSet<Integer>();
        for(int num : nums){
            if(sets.contains(num))
                return true;
            sets.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
