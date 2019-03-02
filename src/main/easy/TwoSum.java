package main.easy;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * Note:
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 *
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum {

    /**
     *
     * Runtime: 54 ms, faster than 12.08% of Java online submissions for Two Sum II - Input array is sorted.
     Memory Usage: 36.2 MB, less than 69.15% of Java online submissions for Two Sum II - Input array is sorted.
     * @param numbers [2,7,11,15]
     * @param target  9
     * @return [1, 2]
     */
    public int[] twoSum(int[] numbers, int target) {

        int[] ret = new int[2];
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (isFound) break;
            int rest = target - numbers[i];
            ret[0] = i + 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (rest == numbers[j]) {
                    ret[1] = j + 1;
                    isFound = true;
                    break;
                }
            }
        }
        return ret;
    }

}
