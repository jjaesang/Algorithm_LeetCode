package main.easy;

/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * https://leetcode.com/problems/range-sum-query-immutable/
 */
public class RangeSumQuery {

    /**
     * 세그멘트 트리를 이용한 로직도 추가해보자
     * https://www.acmicpc.net/blog/view/9
     */
    private int[] sum;

    public void NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }

    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}
