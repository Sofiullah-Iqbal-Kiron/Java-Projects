package com.LeetCode;

import java.util.Arrays;

public class Main
{

    public static int input;

    public static void main(String[] args)
    {

    }

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

    public int getLastMoment(int n, int[] left, int[] right)
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
    }
}
