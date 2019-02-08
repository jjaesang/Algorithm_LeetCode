package main.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaesang on 2019-02-08.
 */
public class SingleNumber_Three {


    /**
     * Runtime: 6 ms, faster than 25.97% of Java online submissions for Single Number II.
     * Memory Usage: 24.1 MB, less than 54.29% of Java online submissions for Single Number II.
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int key : countMap.keySet()) {
            if (countMap.get(key) == 1)
                return key;
        }
        return 0;
    }


    /**
     *     0 0 0 1 (1)
     *     0 1 0 1 (5)
     *     0 0 0 1 (1)
     *     0 1 0 1 (5)
     *     0 1 0 0 (4)
     *     0 0 0 1 (1)
     *     0 1 0 1 (4) // result = 4
     *
     *     0th Iter / sum = 6 % 3 = 0  pass     / ans = 0
     *     1th Iter / sum = 0          pass     / ans = 0
     *     2th Iter / sum = 4 % 3 = 1  ----     / ans = 4 <-- 1 (sum) << 2 (BitIndex) (= 1 0 0 ) = 1 0 0 ( 4)
     *     3th Iter / sum = 0          ----     / ans = 4
     *
     *
     *     Runtime: 5 ms, faster than 34.85% of Java online submissions for Single Number II.
     *     Memory Usage: 23.3 MB, less than 68.31% of Java online submissions for Single Number II.
     */

    public static int singleNumberBit(int[] nums) {

        int ans = 0;
        for (int bitIdx = 0; bitIdx < 32; bitIdx++) {

            int sum = 0;
            for (int num : nums) {
                if (((num >> bitIdx) & 1) == 1) {
                    sum++;
                    sum %= 3;
                }
            }
            if (sum != 0) {
                ans = ans | sum << bitIdx;
            }

        }
        return ans;

    }

    public static void main(String[] args) {

        System.out.print(3 % 2);
        int[] nums = {1, 1, 5, 5, 2, 2, 3};
        System.out.println(singleNumberBit(nums));
    }
}
