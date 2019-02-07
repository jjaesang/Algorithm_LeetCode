package main.easy;

import java.util.HashMap;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * https://leetcode.com/problems/majority-element/
 */

public class MajorityElement {

    /**
     * Result
       Runtime: 16 ms, faster than 39.18% of Java online submissions for Majority Element.
       Memory Usage: 32.7 MB, less than 28.95% of Java online submissions for Majority Element.
     *
     */

    public int majorityElement(int[] nums) {

        int majorityThreshold = nums.length / 2;
        HashMap<Integer, Integer> inputNumMap = new HashMap<>();

        for (int num : nums) {
            int newCount = 1;
            if (inputNumMap.containsKey(num)) {
                newCount = inputNumMap.get(num) + 1;
            }

            if (newCount > majorityThreshold)
                return num;

            inputNumMap.put(num, newCount);
        }

        return 0;

    }
}
