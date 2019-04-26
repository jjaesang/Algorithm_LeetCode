package main.easy;

import java.util.*;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Note:
 *      Each element in the result should appear as many times as it shows in both arrays.
 *      The result can be in any order.
 */
public class IntersectOfTwoArray {

    /**
     * Runtime: 3 ms, faster than 57.39% of Java online submissions for Intersection of Two Arrays II.
     * Memory Usage: 38.2 MB, less than 7.39% of Java online submissions for Intersection of Two Arrays II.
     */
    public static int[] intersectMap(int[] nums1, int[] nums2) {

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
     * Runtime: 2 ms, faster than 90.40% of Java online submissions for Intersection of Two Arrays II.
     * Memory Usage: 37.4 MB, less than 41.80% of Java online submissions for Intersection of Two Arrays II.
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersectSort(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++; j++;
            }
            else if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }

        int[] ret = new int[result.size()];
        for( int k =0 ;k< result.size() ;k++)
            ret[k] = result.get(k);
        return ret;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        for( int re : intersectSort(nums1,nums2))
            System.out.println(re);

    }
}
