package main.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 * Could you do it without extra space and in O(n) runtime?
 *
 * Input:
 * [4,3,2,7,8,2,3,1]
 * Output:
 * [2,3]
 *
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */
public class FindAllDuplicatesInArray {

    /**
     * Runtime: 8 ms, faster than 94.93% of Java online submissions for Find All Duplicates in an Array.
     * Memory Usage: 40.9 MB, less than 39.43% of Java online submissions for Find All Duplicates in an Array.
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ret = new ArrayList<>();
        int size = nums.length;

        for(int i =0 ; i <size ;i++ ){
            int markedIndex = Math.abs(nums[i]) -1;
            if(nums[markedIndex] < 0)
                ret.add(markedIndex+1);
            else
                nums[markedIndex] *= -1;
        }
        return ret;

    }
}
