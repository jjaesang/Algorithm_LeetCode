package main.easy;

/**
 * Given an m * n matrix M initialized with all 0's and several update operations.
 * Operations are represented by a 2D array, and each operation is represented by an array with two positive integers a and b, which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.
 * You need to count and return the number of maximum integers in the matrix after performing all the operations.
 *
 * Note:
 *  The range of m and n is [1,40000].
 *  The range of a is [1,m], and the range of b is [1,n].
 *  The range of operations size won't exceed 10,000.
 *
 *  https://leetcode.com/problems/range-addition-ii/
 */
public class RangeAddition {
    /**
     * Status: Memory Limit Exceeded
     *
     * @param m 3
     * @param n 3
     * @param ops [[2,2],[3,3]]
     * @return 4
     */
    public int maxCount(int m, int n, int[][] ops) {
        int[][] matrix = new int[m][n];

        for (int[] op : ops) {
            for (int i = 0; i < op[0]; i++) {
                for (int j = 0; j < op[1]; j++) {
                    matrix[i][j]++;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == matrix[0][0])
                    cnt++;
            }
        }
        return cnt;
    }

    /**
     *
     * 생각해보면 중첩되는 부분이 가장 클 수 밖에 없음
     * 왜냐면 하나씩 증가하니깐, 많이 중첩될 수 록 매트릭스 상의 가장 큰 수가 포함되어 있음
     * 그러니 그냥 많이 중첩된 곳의 배열의 사이즈 MxN만 구하면 끝
     * 더 더이상 메모리도 필요없음
     * @param m 3
     * @param n 3
     * @param ops [[2,2],[3,3]]
     * @return 4
     *
     * Runtime: 3 ms, faster than 77.57% of Java online submissions for Range Addition II.
     * Memory Usage: 38.7 MB, less than 20.41% of Java online submissions for Range Addition II.
     */
    public int maxCountWOMatrix(int m, int n, int[][] ops) {

        for (int[] op : ops) {
            m = Math.min(m, op[0]);
            n = Math.min(n, op[0]);
        }
        return m * n;
    }


    public static void main(String[] args) {


    }


}
