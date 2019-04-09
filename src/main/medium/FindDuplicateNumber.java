package main.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist.
 * Assume that there is only one duplicate number, find the duplicate one.
 * <p>
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once
 *
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
public class FindDuplicateNumber {
    /**
     * O(NlogN) / O(1) or O(n)
     * Does not satisfied problem requirements
     *
     * @param nums [1,3,4,2,2]
     * @return  2
     */
    public int findDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }

        return -1;
    }

    /**
     * O(N) / O(n)
     * Does not satisfied problem requirements
     *
     * @param nums [3,1,3,4,2]
     * @return  3
     *
     * Think about this test case..
     * @param nums [2,2,2,2,2]
     * @return  2
     */
    public int findDuplicateSet(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }

    public int findDuplicateTwoPoint(int[] nums) {
        /**
         * Must be solved this method..
         */
        return -1;
    }
}
