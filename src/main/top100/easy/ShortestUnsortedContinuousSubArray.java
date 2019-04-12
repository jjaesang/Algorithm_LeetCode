package main.top100.easy;

import java.util.Arrays;

/**
 * 581. Shortest Unsorted Continuous Subarray
 *
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order,
 * then the whole array will be sorted in ascending order, too.
 *
 * You need to find the shortest such subarray and output its length.
 *
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
 */
public class ShortestUnsortedContinuousSubArray {
    /**
     * Runtime: 8 ms, faster than 87.90% of Java online submissions for Shortest Unsorted Continuous Subarray.
     * Memory Usage: 41.3 MB, less than 68.11% of Java online submissions for Shortest Unsorted Continuous Subarray.
     * @param nums [2, 6, 4, 8, 10, 9, 15]
     * @return  5
     *
     * Explanation : You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
     */
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedNums = nums.clone();

        Arrays.sort(sortedNums);

        int start = nums.length;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sortedNums[i] != nums[i]) {
                start = Math.min(i, start);
                end = Math.max(i, end);
            }
        }

        if(end - start >= 0)
            return end-start+1;
        return 0;

    }


}
