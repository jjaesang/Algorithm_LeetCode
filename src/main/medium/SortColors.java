package main.medium;

/**
 * Given an array with n objects colored red, white or blue,
 * sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively
 *
 * Note: You are not suppose to use the library's sort function for this problem.
 *
 * Follow up:
 *  A rather straight forward solution is a two-pass algorithm using counting sort.
 *      First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
 *  Could you come up with a one-pass algorithm using only constant space?
 *
 *  https://leetcode.com/problems/sort-colors/
 */
public class SortColors {
    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
     * Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Sort Colors.
     *
     * this is one-path
     *
     * two-path approach is used 'counting sort'
     * i will have to implement this problem using counting sort
     * @param nums
     */
    public static void sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int left = 0, right = nums.length - 1;

        for (int i = 0; i <= right; i++) {
            if (nums[i] == 0 && i != left)
                swap(nums, i--, left++);
            else if (nums[i] == 2 && i != right)
                swap(nums, i--, right--);
        }

    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        for(int n : nums)
            System.out.println(n);

    }
}
