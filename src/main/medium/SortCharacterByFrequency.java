package main.medium;

import java.util.PriorityQueue;

/**
 * Given a string, sort it in decreasing order based on the frequency of characters.
 *
 * Input:
 * "Aabb"
 *
 * Output:
 * "bbAa"
 *
 * Explanation:
 * "bbaA" is also a valid answer, but "Aabb" is incorrect.
 * Note that 'A' and 'a' are treated as two different characters.
 *
 * https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class SortCharacterByFrequency {
    /**
     * Input:
     * "tree"
     * <p>
     * Output:
     * "eert"
     * <p>
     * Explanation:
     * 'e' appears twice while 'r' and 't' both appear once.
     * So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
     *
     * @param s
     * @return
     */
    public static String frequencySort(String s) {

        int[] charList = new int[128];
        for (char c : s.toCharArray()) {
            charList[(int) c]++;
        }

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> {
            return b[1] - a[1];
        });

        for (int i = 0; i < 128; i++) {
            if (charList[i] > 0)
                priorityQueue.add(new int[]{i, charList[i]});
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!priorityQueue.isEmpty()) {
            int[] charSets = priorityQueue.poll();
            for (int i = 0; i < charSets[1]; i++) {
                stringBuilder.append((char)charSets[0]);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Runtime: 37 ms, faster than 48.86% of Java online submissions for Sort Characters By Frequency.
     * Memory Usage: 40.2 MB, less than 29.87% of Java online submissions for Sort Characters By Frequency.
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(frequencySort("Aabb"));
    }
}
