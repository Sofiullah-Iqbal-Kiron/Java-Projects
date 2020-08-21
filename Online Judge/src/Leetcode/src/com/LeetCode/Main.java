package com.LeetCode;

public class Main
{
    public static void main(String[] args)
    {

    }

    /*public int getLastMoment(int n, int[] left, int[] right)
    {
        if (left.length == 0 || right.length == 0)
        {
            return Math.max(left.length - 1, right.length - 1);
        }
        int leftHigh = left[0], rightLow = right[0];
        int i;
        for (i = 1; i < left.length; i++)
        {
            if (left[i] > leftHigh)
            {
                leftHigh = left[i];
            }
            if (right[i] < rightLow)
            {
                rightLow = right[i];
            }
        }

        return Math.max(leftHigh, (n - 1) - rightLow);
    }*/
}
