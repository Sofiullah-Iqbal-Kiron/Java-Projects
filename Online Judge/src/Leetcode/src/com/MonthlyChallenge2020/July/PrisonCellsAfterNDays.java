// Accepted.
// 90% of community idea, not mine.

package com.MonthlyChallenge2020.July;

import java.util.Arrays;

public class PrisonCellsAfterNDays
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(prisonAfterNDays((new int[] {0, 1, 0, 1, 1, 0, 0, 1}), 7)));
    }

    public static int[] prisonAfterNDays(int[] cells, int N)
    {
        N = (N % 14 == 0) ? 14 : N % 14;
        int i, j, pre, temp, next;
        for (i = 1; i <= N; i++)
        {
            pre = cells[0];
            cells[0] = 0;
            for (j = 1; j < 7; j++)
            {
                temp = cells[j];
                next = cells[j + 1];
                cells[j] = (pre == next) ? 1 : 0;
                pre = temp;
            }
            cells[7] = 0;
        }

        return cells;
    }
}
