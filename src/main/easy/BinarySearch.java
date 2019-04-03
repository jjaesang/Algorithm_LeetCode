package main.easy;

/**
 * Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums.
 * If target exists, then return its index, otherwise return -1.
 *
 * https://leetcode.com/problems/binary-search/submissions/
 */
public class BinarySearch {

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
     * Memory Usage: 40.3 MB, less than 89.92% of Java online submissions for Binary Search.
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length -1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target){
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return  -1;

    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums,target));
    }

}
