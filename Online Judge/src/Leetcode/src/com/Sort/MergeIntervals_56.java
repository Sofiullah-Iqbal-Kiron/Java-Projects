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
        int i, j, firstPoint, secondPoint;
        List<int[]> list = new ArrayList<>();
        for (i = 0; i < intervals.length; i = j)
        {
            j = i + 1;
            firstPoint = Math.min(intervals[i][0], intervals[j][0]);
            while (j < intervals.length && intervals[j][0] <= intervals[i][1])
            {
                j++;
                i++;
            }

            secondPoint = Math.max(intervals[i - 1][1], intervals[j - 1][1]);
            list.add(new int[] {firstPoint, secondPoint});
        }

        return list.toArray(new int[list.size()][]);
    }

    private static void sortByComparator(int[][] intervals)
    {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    }
}
