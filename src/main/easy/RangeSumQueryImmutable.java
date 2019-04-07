package main.easy;

/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * https://leetcode.com/problems/range-sum-query-immutable/
 */
public class RangeSumQueryImmutable {

    private int[] data =null ;

    /**
     * Runtime: 238 ms, faster than 19.76% of Java online submissions for Range Sum Query - Immutable.
     * Memory Usage: 62.3 MB, less than 7.66% of Java online submissions for Range Sum Query - Immutable.
     * @param nums
     */
    public RangeSumQueryImmutable(int[] nums) {
            data = nums;
    }

    public int sumRange(int i, int j) {

        int sum = 0;
        for(int index = i ; index <= j ;index++){
            sum += data[index];
        }
        return sum;
    }

    /**
     * Runtime: 53 ms, faster than 93.93% of Java online submissions for Range Sum Query - Immutable.
     * Memory Usage: 41.5 MB, less than 94.53% of Java online submissions for Range Sum Query - Immutable.
     * @param nums
     */
    public void RangeSumQueryImmutableCache(int[] nums) {
        data = new int[nums.length+1];
        for(int i =0 ;i<nums.length;i++)
            data[i+1] = data[i] + nums[i];
    }

    public int sumRangeWithCache(int i, int j) {

        return data[j+1] - data[i];
    }



    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable rangeSumQueryImmutable = new RangeSumQueryImmutable(nums);
        System.out.println(rangeSumQueryImmutable.sumRange(0,2));

        System.out.println(rangeSumQueryImmutable.sumRange(0,2));
    }
}
