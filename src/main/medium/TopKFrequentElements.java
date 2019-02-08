package main.medium;

import java.util.*;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 * <p>
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * <p>
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class TopKFrequentElements {
    /**
     * Runtime: 13 ms, faster than 84.95% of Java online submissions for Top K Frequent Elements.
     * Memory Usage: 30.3 MB, less than 56.08% of Java online submissions for Top K Frequent Elements.
     * Next challenges:
     * @param nums [1,1,1,2,2,3]
     * @param k     2
     * @return [1,2]
     */
    public static List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums)
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        for (Map.Entry entry : countMap.entrySet())
            heap.add(entry);

        List<Integer> resultList = new LinkedList<>();
        while (resultList.size() < k) {
            resultList.add(heap.poll().getKey());
        }
        return resultList;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        int k = 2;
        List<Integer> result = topKFrequent(nums, k);
        for (int r : result)
            System.out.println(r);
    }
}
