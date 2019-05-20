package main.easy;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * We have a collection of rocks, each rock has a positive integer weight.
 * Each turn, we choose the two heaviest rocks and smash them together.  Suppose the stones have weights x and y with x <= y.
 *
 * The result of this smash is:
     If x == y, both stones are totally destroyed;
     If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
     At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)

 * https://leetcode.com/problems/last-stone-weight/
 */

public class LastStoneWeight {
    /**
     * Runtime: 1 ms, faster than 98.44% of Java online submissions for Last Stone Weight.
     * Memory Usage: 33.6 MB, less than 100.00% of Java online submissions for Last Stone Weight.
     * @param stones [2,2]
     * @return 0
     */
    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 < o2 ? 1 : -1;
            }
        });
        for(int stone : stones)
            priorityQueue.add(stone);

        while(priorityQueue.size() > 1){
            int x = priorityQueue.poll();
            int y = priorityQueue.poll();
            if(x == y) {
                continue;
            }
            else {
                priorityQueue.add(x-y);
            }

        }
        return priorityQueue.size() == 0 ? 0 : priorityQueue.peek();
    }

    public static void main(String[] args) {
        //int[] inputs = {2, 7, 4, 1, 8, 1};
        int[] inputs = {2, 2};
        System.out.println(lastStoneWeight(inputs));
    }

}
