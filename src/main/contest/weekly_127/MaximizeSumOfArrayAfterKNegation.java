package main.contest.weekly_127;

import java.util.Arrays;

/**
 * Created by jaesang on 2019-03-11.
 */
public class MaximizeSumOfArrayAfterKNegation {

    public static int largestSumAfterKNegations(int[] A, int K) {

        for (int i = 0; i < K; i++) {
            Arrays.sort(A);
            A[0] = A[0] * -1;
        }
        int sum = 0;
        for (int a : A) sum += a;
        return sum;

    }

    public static void main(String[] args) {
        int[] input = {2,-3,-1,5,-4};
        int k = 2;
        System.out.println(largestSumAfterKNegations(input, k));
    }
}
