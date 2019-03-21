package main.easy;

/**
 * 198. House Robber
 *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 *
 * https://leetcode.com/problems/house-robber/
 *
 */
public class HouseRobber1 {
    /**
     * Bottom-up Memo
     *
     * Runtime: 2 ms, faster than 100.00% of Java online submissions for House Robber.
     * Memory Usage: 36.7 MB, less than 84.02% of Java online submissions for House Robber.
     * @param nums
     * @return
     */
    public static int rob(int[] nums) {

        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        int size = nums.length;
        int[] memo = new int[size + 1];

        memo[0] = 0;
        memo[1] = nums[0];
        for (int i = 1; i < size; i++) {
            memo[i+1] = Math.max(memo[i], memo[i - 1] + nums[i]);
        }
        return memo[size];
    }

    public static void main(String[] args) {
        int[] input = {2, 7, 9, 3, 1};  // 12
        int[] input2 = {1, 2, 3, 1};    // 4
        int[] input3 = {2, 1, 1, 2};    // 4

        System.out.println(rob(input));
        System.out.println(rob(input2));
        System.out.println(rob(input3));

    }
}
