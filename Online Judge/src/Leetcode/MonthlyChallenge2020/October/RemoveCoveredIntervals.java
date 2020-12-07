// Accepted in first term.
// Posted in twitter.


package com.MonthlyChallenge2020.October;

public class RemoveCoveredIntervals
{
    public int removeCoveredIntervals(int[][] intervals)
    {
        int MLen = intervals.length;
        for (int i = 0; i < intervals.length; i++)
        {
            if (coveredByAnother(intervals, i))
                MLen--;
        }

        return MLen;
    }

    private boolean coveredByAnother(int[][] intervals, int cur)
    {
        for (int i = 0; i < intervals.length; i++)
        {
            if (i != cur && intervals[cur][0] >= intervals[i][0] && intervals[cur][1] <= intervals[i][1])
                return true;
        }

        return false;
    }
}
