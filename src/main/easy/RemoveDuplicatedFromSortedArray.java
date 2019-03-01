package main.easy;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 */
public class RemoveDuplicatedFromSortedArray {
    /**
     *
     * @param nums [1,1,2]
     * @return [1,2] -> 2
     * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
     *
     * @param nums [0,0,1,1,1,2,2,3,3,4],
     * @return [0,1,2,3,4] -> 5
     * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
     *
     * 내일 풀어볼 것
     * Next Problem : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
     * Next Problem : https://leetcode.com/problems/remove-element/
     */
    public int removeDuplicates(int[] nums) {
        int i =0;
        for( int j=1 ;j < nums.length ;j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
