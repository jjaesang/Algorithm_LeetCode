package main.easy;

/**
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value.
 * And you need to output the maximum average value.
 *
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 *
 *
 * 1 <= k <= n <= 30,000.
 * Elements of the given array will be in the range [-10,000, 10,000].
 *
 * https://leetcode.com/problems/maximum-average-subarray-i/
 */
public class MaximumAverageSubarray {

    /**
     * Runtime: 5 ms, faster than 93.94% of Java online submissions for Maximum Average Subarray I.
     * Memory Usage: 43.2 MB, less than 42.07% of Java online submissions for Maximum Average Subarray I.
     * @param nums
     * @param k
     * @return
     */
    public static double findMaxAverage(int[] nums, int k) {

        double sum = 0D;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double res  = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            res = Math.max(res, sum);
        }
        return res / k;

    }

    public static void main(String[] args) {
        int[] nums = {0, 4, 0, 3, 2};
        int k = 1;
        //int[] nums = {1, 12, -5, -6, 50, 3};
        //int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}
