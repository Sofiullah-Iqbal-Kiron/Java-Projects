// Accepted.
// posted in twitter.


package com.MonthlyChallenge2020.October;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray
{
    public void rotate(int[] nums, int k)
    {
        List<Integer> list = new ArrayList<Integer>();
        Arrays.stream(nums).forEach((x) -> list.add(x));
        for (int i = 0; i < k; i++)
        {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }

        int i = 0;
        for (int j = 0; j < nums.length; j++)
            nums[j] = list.get(j);
    }
}
