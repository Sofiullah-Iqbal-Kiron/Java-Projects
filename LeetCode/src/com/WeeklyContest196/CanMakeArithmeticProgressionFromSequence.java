// Accepted at first submission.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/YMb8RHRHQN/

package com.WeeklyContest196;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence
{
    public boolean canMakeArithmeticProgression(int[] arr)
    {
        Arrays.sort(arr);
        int i, pre = arr[1] - arr[0], cur = 0;
        for (i = 1; i < arr.length - 1; i++)
        {
            cur = arr[i + 1] - arr[i];
            if (cur != pre)
            {
                return false;
            }
            pre = cur;
        }

        return true;
    }
}
