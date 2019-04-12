package main.top100.easy;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.
 *
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZero {
    public static int[] moveZeroes(int[] nums) {
        int[] ret = new int[nums.length];
        int startIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                ret[startIndex++] = nums[i];
        }
        return ret;
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
     * Memory Usage: 39.4 MB, less than 62.44% of Java online submissions for Move Zeroes.
     * @param nums
     * @return
     */
    public static int[] moveZeroesWoSpace(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[lastNonZeroFoundAt++] = nums[i];
        }
        for(int i = lastNonZeroFoundAt;i<nums.length;i++)
            nums[i] = 0;
        return nums;
    }

    public static void main(String[] args) {
        int[] input = {0, 1, 0, 3, 12};
        for (int ret : moveZeroesWoSpace(input))
            System.out.print(ret + " ");
    }

}
