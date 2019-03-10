package main.medium;

/**
 * Created by JAESANG_MON on 2019-03-10.
 * <p>
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 * https://leetcode.com/problems/jump-game/solution/
 */
public class JumpGame_DP {


    enum Index {
        GOOD, BAD, UNKNOWN
    }

    /**
     *
     * @param nums
     * @return
     *
     * Time O(n2) / space O(n)
     */
    public boolean bottomUpCanJump(int[] nums) {
        Index[] memo = new Index[nums.length];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = Index.UNKNOWN;
        }
        memo[memo.length - 1] = Index.GOOD;

        for (int i = nums.length - 2; i >= 0; i--) {
            int furthestJump = Math.min(i + nums[i], nums.length - 1);
            for (int j = i + 1; j <= furthestJump; j++) {
                if (memo[j] == Index.GOOD) {
                    memo[i] = Index.GOOD;
                    break;
                }
            }
        }

        return memo[0] == Index.GOOD;
    }

    /**
     *
     * Time O(2^n) / Space (n)
     * @param pos
     * @param nums
     * @return
     */
    public static boolean backTrackingCanJump(int pos, int[] nums) {
        if (pos == nums.length - 1)
            return true;

        int jumpStep = Math.min(pos + nums[pos], nums.length);
        //forward
        for (int i = pos + 1; i <= jumpStep; i++) {
            if (backTrackingCanJump(i, nums))
                return true;
        }
        /**
         * 뒤에서 부터 index 조사, 앞에서부터 체크하는 것이랑 결과는 값으나, 뒤에서부터 계산 시 계산량을 줄일 수 있음
         * 당연히 큰 수일 수록, 마지막 인덱스에 더 빨리 접근할 수 있으니깐
         *
         * for (int i = jumpStep; i > pos ; i--) {
         if (backTrackingCanJump(i, nums))
         return true;
         }
         */
        return false;

    }

    public static boolean canJump(int[] nums) {
        return backTrackingCanJump(0, nums);
    }
}
