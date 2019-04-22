package main.top100.easy;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 *
 * Explanation
 *  rotate 1 steps to the right: [7,1,2,3,4,5,6]
 *  rotate 2 steps to the right: [6,7,1,2,3,4,5]
 *  rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 *  https://leetcode.com/problems/rotate-array/
 */

public class RotateArray {

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.
     * Memory Usage: 37.8 MB, less than 65.49% of Java online submissions for Rotate Array.
     * @param nums [-1]
     * @param k 2
     *          return -1
     *
     */
    public void rotate(int[] nums, int k) {

        k %= nums.length; // rotate할 값이 배열 사이즈가 보다작으면 원본 리턴
        reverse(nums, 0, nums.length - 1); // 일단 처음 모든 배열 역으로 변경
        reverse(nums, 0, k - 1); //0 ~ k-1 까지의 값 역으로 변경
        reverse(nums, k, nums.length - 1); // 나머지 역으로 변경

    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
