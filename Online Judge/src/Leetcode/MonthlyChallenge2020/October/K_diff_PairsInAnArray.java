// Accepted in first term.
// Posted in twitter.
// Accepted with normal "Sort()" and "parallelSort()".


package com.MonthlyChallenge2020.October;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class K_diff_PairsInAnArray
{
    public static int findPairs(int[] nums, int k)
    {
        int i, j;
        Set<Integer> ans = new HashSet<>();
        Arrays.parallelSort(nums);
        for (i = 0; i < nums.length; i++)
        {
            j = Arrays.binarySearch(nums, nums[i] + k); // For binarySearch, array must be sorted
            if (j > -1 && j != i)
                ans.add(Math.min(nums[i], nums[j]));
        }

        return ans.size();
    }
}