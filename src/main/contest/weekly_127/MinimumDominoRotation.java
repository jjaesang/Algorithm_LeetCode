package main.contest.weekly_127;

/**
 * Created by jaesang on 2019-03-11.
 */
public class MinimumDominoRotation {
    /**
     * @param A [2,1,2,4,2,2]
     * @param B [5,2,6,2,3,2]
     * @return 2
     */
    public static int minDominoRotations(int[] A, int[] B) {

        int[] aCount = new int[7];
        int[] bCount = new int[7];
        int[] sCount = new int[7];

        for (int i = 0; i < A.length; i++) {
            aCount[A[i]]++;
            bCount[B[i]]++;
            if (A[i] == B[i]) sCount[A[i]]++;
        }
        for (int i = 1; i <= 6; i++) {
            if(aCount[i] + bCount[i] - sCount[i] >= A.length)
                return Math.min(aCount[i],bCount[i]) - sCount[i];
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] A = {2, 1, 2, 4, 2, 2};
        int[] B = {5, 2, 6, 2, 3, 2};
        System.out.println(minDominoRotations(A, B));
    }
}
