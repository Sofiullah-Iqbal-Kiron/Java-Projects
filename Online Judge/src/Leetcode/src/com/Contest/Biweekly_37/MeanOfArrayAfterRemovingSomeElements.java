// Accepted in first term during contest.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/DGyPqssjRP/
// This is the first time I expends total 1.30 hours that is total contest time but loses many rating.


package com.Contest.Biweekly_37;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements
{
    public double trimMean(int[] arr)
    {
        Arrays.sort(arr);
        int toDel = (arr.length * 5) / 100;
        int from = toDel, to = arr.length - 1 - toDel;
        long sum = 0;
        for (int i = from; i <= to; i++)
            sum += arr[i];

        return (double) sum / (arr.length - toDel * 2.0);
    }
}
