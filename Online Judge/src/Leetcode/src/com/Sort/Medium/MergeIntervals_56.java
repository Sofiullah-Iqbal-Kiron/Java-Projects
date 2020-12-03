// Accepted after 5 wrong/error submission.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/w868tFfMrw/


package com.Sort.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals_56
{
    public int[][] merge(int[][] intervals)
    {
        sortByComparator(intervals);
        int i, j, firstPoint, secondPoint = Integer.MIN_VALUE;
        List<int[]> list = new ArrayList<>();
        for (i = 0; i < intervals.length; i = j)
        {
            j = i + 1;
            firstPoint = intervals[i][0];
            secondPoint = intervals[i][1];
            while (j < intervals.length && intervals[j][0] <= secondPoint)
            {
                secondPoint = Math.max(secondPoint, intervals[j][1]);
                j++;
            }

            list.add(new int[] {firstPoint, secondPoint});
        }

        return list.toArray(new int[list.size()][]);
    }

    private static void sortByComparator(int[][] intervals)
    {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    }
}
