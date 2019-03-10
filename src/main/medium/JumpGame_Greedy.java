package main.medium;

/**
 * Created by JAESANG_MON on 2019-03-10.
 * <p>
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 * https://leetcode.com/problems/jump-game/solution/
 */
public class JumpGame_Greedy {

    public boolean canJump(int[] nums) {
        int maxIndex = nums.length-1;
        int maxJump  = nums[0];
        // 처음인덱스에서 다음으로 갈 인덱스의 값이 마지막 인덱스와 같거나 크면 성공
        for(int i = 0; i <= maxJump; i++){
            maxJump=Math.max(maxJump,i+nums[i]);
            if(maxJump>=maxIndex) return true;
        }
        return false;
    }

}
