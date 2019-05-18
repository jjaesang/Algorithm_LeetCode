package main.medium;

/**
 * A peak element is an element that is greater than its neighbors.
 *
 * Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
 *
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 *
 * You may imagine that nums[-1] = nums[n] = -∞.
 *
 * https://leetcode.com/problems/find-peak-element/
 *
 */
public class FindPeekElement {

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
     * Memory Usage: 37.4 MB, less than 96.89% of Java online submissions for Find Peak Element.
     *
     * @param nums
     * @return Time O(N) / Space O(1)
     */
    public static int findPeakElement(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;

    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
     * Memory Usage: 37.6 MB, less than 94.87% of Java online submissions for Find Peak Element.
     *
     * @param nums
     * @return Time O(logN) / Space N(1)
     */
    public static int binaryFindPeakElemant(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if( nums[mid] > nums[mid+1])
                right = mid;
            else
                left = mid +1;
        }
        return left;
    }

    public static void main(String[] args) {

        int[] input = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(input));
    }

}
