package com.RA;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArrayByComparator
{
    public static void main(String[] args)
    {
        int[][] intervals = {{1, 3}, {2, 6}, {15, 18}, {8, 10}, {2, 5}};
        sortByLambda(intervals);
        System.out.println(Arrays.deepToString(intervals));
    }

    //    Ascending order.
    private static void sortByLambda(int[][] intervals)
    {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        /*
         * a and b passed to the method, then it takes this two as two 1D array.
         * Then compare b[0] due to respect of a[0].
         * That's mean a[0] - b[0]
         * If positive, a is bigger, then b will be added first.
         */
    }

    //    Ascending by comparator.
    private static void sortByComparator(int[][] intervals)
    {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    }

    //    Descending by comparator.
    private static void sortByComparator2(int[][] intervals)
    {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    }

    /*private static void sortByComparator(int[][] intervals)
    {

    }*/
}
