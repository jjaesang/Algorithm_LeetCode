package main.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Note:
 *      Each element in the result should appear as many times as it shows in both arrays.
 *      The result can be in any order.
 */
public class IntersectOfTwoArray {

    /**
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();


        for (int num : nums1)
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);

        for(int num : nums2){
            if(hashMap.containsKey(num) && hashMap.get(num) > 0){
                hashMap.put(num, hashMap.get(num)-1);
                result.add(num);

            }
        }

        int[] ret = new int[result.size()];
        for( int i =0 ;i< result.size() ;i++)
            ret[i] = result.get(i);
        return ret;
    }

    /**
     * Runtime: 3 ms, faster than 57.39% of Java online submissions for Intersection of Two Arrays II.
     * Memory Usage: 38.2 MB, less than 7.39% of Java online submissions for Intersection of Two Arrays II.
     * @param args
     */
    public static void main(String[] args) {

        int[] nums1 = {1,2};
        int[] nums2 = {1,1};

        for( int re : intersect(nums1,nums2))
            System.out.println(re);

    }
}
