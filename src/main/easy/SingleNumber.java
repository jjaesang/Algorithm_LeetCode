package main.easy;

import java.util.*;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {

    /**
     * Runtime: 11 ms, faster than 22.96% of Java online submissions for Single Number.
     * Memory Usage: 25.4 MB, less than 62.02% of Java online submissions for Single Number.
     * Time o(n) / Space o(n)
     *
     * @param nums [2,2,1]
     * @return 1
     */
    public static int singleNumberWithMap(int[] nums) {

        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int num : nums) {
            int occurrence = 1;
            if (numberMap.containsKey(num))
                occurrence = numberMap.get(num) + 1;

            numberMap.put(num, occurrence);
        }

        for (int num : numberMap.keySet()) {
            if (numberMap.get(num) == 1)
                return num;
        }

        return 0;
    }

    /**
     * Runtime: 10 ms, faster than 25.69% of Java online submissions for Single Number.
     * Memory Usage: 30.2 MB, less than 6.59% of Java online submissions for Single Number.
     *
     * @param nums
     * @return
     */
    public static int singleNumberWithMath(int[] nums) {

        Set<Integer> uniquNumSet = new HashSet<Integer>();

        for (int num : nums)
            uniquNumSet.add(num);

        int uniquSum = 0;
        for (int uniquNum : uniquNumSet)
            uniquSum += uniquNum;
        uniquSum *= 2;

        int sum = 0;
        for (int num : nums)
            sum += num;

        return uniquSum - sum;
    }

    /**
     * Runtime: 159 ms, faster than 3.47% of Java online submissions for Single Number.
     * Memory Usage: 29.5 MB, less than 17.03% of Java online submissions for Single Number.
     * Time o(n) / Space o(1)
     *
     * @param nums
     * @return
     *
     * a XOR 0 = a
     * a XOR a = 0
     * XOR로 한번 등장하는 것은 '하나를 제외하고 반드시 나머지는 두번씩 등장해야한다는 조건'이 존재해야한다
     * 안그러면 XOR 연산으로 값이 바꿔 한번만 등장하는 것을 찾을 수 없다
     *
     * 0 ^ 1 = 1
     * 1 ^ 2 = 3
     * 3 ^ 4 = 7
     * 7 ^ 3 = 4 // 2번 등장하게되면 그 숫자는 빠지게 된다 ( 7 = 111 은 사실상 100 + 011 ( 4 + 3 ) 이기 때문 )
     * 4 ^ 5 = 1 .....
     */
    public static int singleNumberWithXOR(int[] nums) {

        int initBit = 0;
        for (int num : nums) {
            System.out.println(initBit+"\t"+num);
            initBit ^= num;
        }
        return initBit;

    }

    public static void main(String[] args) {
        int[] input = {1, 2, 4, 3, 5, 2, 1, 3, 5};
        int ret = singleNumberWithXOR(input);
        System.out.println(ret);

    }


}
