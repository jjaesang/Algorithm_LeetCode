package main.medium;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 *
 * https://leetcode.com/problems/number-of-islands/
 */
public class NumberOfIsland {

    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, 1, -1, 0};

    /**
     * @param grid 11110
     *             11010
     *             11000
     *             00000
     * @return 1
     */
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int islands = 0;
        int x = grid.length;
        int y = grid[0].length;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == '1') {
                    explore(grid, i, j, x, y);
                    islands++;
                }
            }
        }
        return islands;
    }

    /**
     * Runtime: 2 ms, faster than 60.52% of Java online submissions for Number of Islands.
     * Memory Usage: 41 MB, less than 70.50% of Java online submissions for Number of Islands.
     * @param grid
     * @param i index X
     * @param j index Y
     * @param x X length
     * @param y Y length
     */
    public static void explore(char[][] grid, int i, int j, int x, int y) {
        grid[i][j] = 'x';
        for (int d = 0; d < dx.length; d++) {
            if (i + dy[d] < x && i + dy[d] >= 0 && j + dx[d] < y && j + dx[d] >= 0
                    && grid[i + dy[d]][j + dx[d]] == '1') {
                explore(grid, i + dy[d], j + dx[d], x, y);
            }
        }
    }

}
