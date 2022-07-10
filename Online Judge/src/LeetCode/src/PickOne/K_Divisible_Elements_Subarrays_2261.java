package PickOne;

import java.util.HashMap;
import java.util.Map;

public class K_Divisible_Elements_Subarrays_2261 {
    public int countDistinct(int[] nums, int k, int p) {
        Map<int[], Integer> subarrays = new HashMap<>();
        int[] demo = new int[]{1, 2};
        int[] d = new int[]{1, 2};
        subarrays.put(demo, 0);
        subarrays.put(demo, 1);
        System.out.println(subarrays.containsKey(d));

        return 1;
    }
}
