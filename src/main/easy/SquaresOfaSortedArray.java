package main.easy;

import java.util.Arrays;

/**
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 *
 * Note:
 *  1 <= A.length <= 10000
 *  -10000 <= A[i] <= 10000
 *  A is sorted in non-decreasing order.
 */
public class SquaresOfaSortedArray {

    /**
     * Runtime: 3 ms, faster than 73.33% of Java online submissions for Squares of a Sorted Array.
     * Memory Usage: 39.8 MB, less than 99.16% of Java online submissions for Squares of a Sorted Array.
     *
     * Complexity Analysis
     *  Time Complexity: O(N \log N)O(NlogN), where NN is the length of A.
     *  Space Complexity: O(N)O(N).
     *
     *  @param A [-4,-1,0,3,10]
     * @return
     */
    public static int[] sortedSquares(int[] A) {
        int size = A.length;
        for (int i = 0; i < size; i++) {
            A[i] = A[i] * A[i];
        }

        Arrays.sort(A);
        return A;

    }

    public static void main(String[] args) {
        int[] input = {-4, -1, 0, 3, 10};
        for( int ret : sortedSquares(input))
            System.out.println(ret);
    }
}
