package main.contest.weekly_135;

/**
 * A boomerang is a set of 3 points that are all distinct and not in a straight line.
 *
 * Given a list of three points in the plane, return whether these points are a boomerang.
 */
public class ValidBoomerang {

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Boomerang.
     * Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Valid Boomerang.
     *
     * @param points
     * @return
     */

    public static boolean isBoomerang(int[][] points) {

        /**
         * 0-1 기울기 != 0-2 기울기
         * (y0-y1)/(x0-x1) != (y0-y2)/(x0-x2)
         * -> (y0-y1) * (x0-x2) != (y0-y2) * (x0-x1)
         *
         *
         */

        return (points[0][1] - points[1][1]) * (points[0][0] - points[2][0])
                != (points[0][1] - points[2][1]) * (points[0][0] - points[1][0]);
    }

    /**
     * Input:
     * [[0,1],[1,0],[0,1]]
     * Output:
     * false
     *
     * Input:
     * [[0,1],[1,1],[2,1]]
     * Output:
     * false

     * Input:
     * [[0,0],[0,2],[2,1]]
     * Output:
     * true

     * Input:
     * [[0,0],[1,1],[1,1]]
     * Output:
     * false
     *
     */
    public static void main(String[] arg) {
        //   int[][] points = {{0, 1}, {1, 0}, {0, 1}};
        int[][] points = {{0, 0}, {1, 1}, {1, 1}};
        System.out.println(isBoomerang(points));
    }
}
