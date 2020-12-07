// Accepted in second term.
// Posted in twitter.
// Code from mobile (Symphony P6).


package com.MonthlyChallenge2020.September;

import java.util.*;

public class MajorityElement_II
{
    public List<Integer> majorityElement(int[] nums)
    {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> ansSet = new TreeSet<>();
        if (nums.length == 0)
            return ans;
        Arrays.sort(nums);
        int firstPoint = 0, lastPoint = nums.length / 3;
        while (lastPoint < nums.length)
        {
            if (nums[firstPoint] == nums[lastPoint])
            {
                ansSet.add(nums[lastPoint]);
                firstPoint = lastPoint + 1;
                lastPoint = firstPoint + nums.length / 3;
            }
            else
            {
                firstPoint++;
                lastPoint++;
            }
        }

        ans.addAll(ansSet);
        return ans;
    }
}
