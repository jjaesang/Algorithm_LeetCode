package main.easy;

/**
 * DP Problems
 * You are climbing a stair case. It takes n steps to reach to the top.
 *  Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top
 *   Note: Given n will be a positive integer.
 *
 *   https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbStairs {
    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
     * Memory Usage: 31.8 MB, less than 100.00% of Java online submissions for Climbing Stairs.
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if( n == 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
