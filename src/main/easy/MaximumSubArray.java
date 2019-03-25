package main.easy;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * https://leetcode.com/problems/maximum-subarray/submissions/
 */
public class MaximumSubArray {

    public static int maxSubArray(int[] nums) {

        int localMax = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(localMax+nums[i], nums[i]);
           globalMax = Math.max(localMax,globalMax);
        }
        return globalMax;
    }

    /**
     * Runtime: 5 ms, faster than 100.00% of Java online submissions for Maximum Subarray.
     * Memory Usage: 39.4 MB, less than 78.26% of Java online submissions for Maximum Subarray.
     * @param args
     */
    public static void main(String[] args) {
        int[] inputs = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ret = maxSubArray(inputs);
        System.out.println(ret);
    }
}
