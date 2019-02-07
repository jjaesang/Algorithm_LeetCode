package main.easy;

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * https://leetcode.com/problems/sum-of-two-integers/
 *
 * */
public class SumOfTwoIntegerWOOperator {

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Two Integers.
     * Memory Usage: 23.5 MB, less than 37.92% of Java online submissions for Sum of Two Integers.
     * @param a = 20
     * @param b = 30
     * @return 50
     *
     */
    public int getSum(int a, int b) {

        if(a == 0 )
            return b;
        if( b ==0 )
            return a;

        int andSum = (a&b)<<1;
        int xorSum = a^b;
        return getSum(andSum,xorSum);
    }
}
