// Accepted in first term.
// Posted in twitter.
// Helper code: https://leetcode.com/problems/number-of-arithmetic-triplets/discuss/2390585/Javaor-Easyor-HashSet
// My brain going loose.

package PickOne;

import java.util.HashSet;
import java.util.Set;

public class Number_of_Arithmetic_Triplets_2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> data = new HashSet<>();
        for (int num : nums) data.add(num);

        int ans = 0;
        for (int i = 0; i < nums.length - 2; i++)
            if (data.contains(nums[i] + diff) && data.contains(nums[i] + 2 * diff)) ans++;

        return ans;
    }
}
