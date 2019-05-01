package main.top100.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 *
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 *
 * https://leetcode.com/problems/fizz-buzz/
 */
public class FizzBuzz {

    /**
     * Runtime: 1 ms, faster than 100.00% of Java online submissions for Fizz Buzz.
     * Memory Usage: 38.3 MB, less than 92.25% of Java online submissions for Fizz Buzz.
     *
     * @param n 15
     * @return
     * [
     *     "1",
     *     "2",
     *     "Fizz",
     *     "4",
     *     "Buzz",
     *     "Fizz",
     *     "7",
     *     "8",
     *     "Fizz",
     *     "Buzz",
     *     "11",
     *     "Fizz",
     *     "13",
     *     "14",
     *     "FizzBuzz"
     * ]
     */
    public List<String> fizzBuzz(int n) {

        List<String> ret = new ArrayList<>();

        for (int num = 1; num <= n; num++) {

            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            if (divisibleBy3 && divisibleBy5) {
                ret.add("FizzBuzz");
            } else if (divisibleBy3) {
                ret.add("Fizz");
            } else if (divisibleBy5) {
                ret.add("Buzz");
            } else {
                ret.add(Integer.toString(num));
            }
        }

        return ret;
    }
}
