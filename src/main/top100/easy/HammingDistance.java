package main.top100.easy;

/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 * Given two integers x and y, calculate the Hamming distance.
 *
 * https://leetcode.com/problems/hamming-distance/
 */
public class HammingDistance {

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming Distance.
     * Memory Usage: 32 MB, less than 100.00% of Java online submissions for Hamming Distance.
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {

        int xor = x ^ y;

        int ret = 0;
        while (xor != 0) {
            ret++;
            xor = xor & xor - 1;

        }
        return ret;

    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming Distance.
     * Memory Usage: 32.1 MB, less than 100.00% of Java online submissions for Hamming Distance.
     * @param x
     * @param y
     * @return
     */
    public int hammingDistanceWithLibary(int x, int y) {

        int xor = x ^ y;

        return Integer.bitCount(xor);
    }
}
