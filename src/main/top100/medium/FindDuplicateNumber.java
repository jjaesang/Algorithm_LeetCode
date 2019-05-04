package main.top100.medium;

/**
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 *
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 *
 */
public class FindDuplicateNumber {

    /**
     * Runtime: 39 ms, faster than 6.84% of Java online submissions for Find the Duplicate Number.
     * Memory Usage: 40.3 MB, less than 5.02% of Java online submissions for Find the Duplicate Number.
     * @param nums
     * @return
     */
    public static int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
            System.out.println(slow+"\t"+fast);
        }while (slow != fast);

        int ptr1 = nums[0];
        int ptr2 = slow;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
