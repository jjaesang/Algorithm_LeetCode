package main.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */

public class FindAllNumbersDisappeared {

    /**
     * Time O(n) / Space O(n)
     *
     * Runtime: 6 ms, faster than 99.72% of Java online submissions for Find All Numbers Disappeared in an Array.
     * Memory Usage: 40.2 MB, less than 19.05% of Java online submissions for Find All Numbers Disappeared in an Array.
     *
     * @param nums [4,3,2,7,8,2,3,1]
     * @return [5, 6]
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int size = nums.length;
        List<Integer> ret = new ArrayList<Integer>();
        int[] index = new int[size + 1];

        for (int num : nums) {
            index[num]++;
        }

        for (int i = 1; i < size + 1; i++) {
            if (index[i] == 0)
                ret.add(i);
        }
        return ret;
    }

    /**
     *
     * Runtime: 9 ms, faster than 83.38% of Java online submissions for Find All Numbers Disappeared in an Array.
     * Memory Usage: 39.9 MB, less than 27.99% of Java online submissions for Find All Numbers Disappeared in an Array.
     *
     * input 조건이 array 사이즈 만큼의 범위이기 때문에, 들어온 값이 index일 경우 -1로 마킹해버림
     * 또 들어와도, 이미 마킹된 것은 지나감. 왜냐면 등장안한걸 찾을라고 한거니깐
     *
     * @param nums
     * @return
     */
    public static List<Integer> findDisappearedNumbersWOExtraSpace(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int markedIndex = Math.abs(nums[i]) - 1;
            if (nums[markedIndex] > 0) {
                nums[markedIndex] *= -1;
            }
        }

        for(int i =0 ; i< size;i++){
            if(nums[i] > 0)
                ret.add(i+1);
        }
        return ret;

    }

    public static void main(String[] args) {
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1};

        for (int ret : findDisappearedNumbersWOExtraSpace(input)) {
            System.out.println(ret);
        }
    }
}
