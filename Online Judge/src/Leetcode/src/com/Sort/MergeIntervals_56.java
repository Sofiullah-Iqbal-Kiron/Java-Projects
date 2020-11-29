package com.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals_56
{
    public int[][] merge(int[][] intervals)
    {
        sortByComparator(intervals);
        int i, j;
        List<int[]> list = new ArrayList<>();
        for (i = 0; i < intervals.length; i++)
        {
            j = i + 1;
            while (j < intervals.length && intervals[j][0] >= intervals[i][0] && intervals[j][0] <= intervals[i][1])
                j++;
            list.add(new int[] {intervals[i][0], intervals[j - 1][1]});
        }

        return list.toArray(new int[list.size()][]);
    }

    private static void sortByComparator(int[][] intervals)
    {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    }
}
