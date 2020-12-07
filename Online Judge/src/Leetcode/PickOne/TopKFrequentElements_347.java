package Leetcode.PickOne;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements_347
{
    public int[] topKFrequent(int[] nums, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> (map.get(n2) - map.get(n1)));
        int[] ans = new int[k];

        for (int i : map.keySet())
        {
            heap.add(i);
            if (heap.size() == k)
                break;
        }

        int x = 0;
        for (int i : heap)
            ans[x++] = heap.poll();

        return new int[] {1, 2};
    }
}
