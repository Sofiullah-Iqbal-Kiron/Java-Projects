// Accepted for first hard form leetcode.
// Posted in twitter.
// Post at discuss.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/zqsGvdF9np/

package PickOne;

import java.util.Arrays;

public class MedianofTwoSortedArrays_4
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int n = nums1.length, m = nums2.length, total = n + m, i, j = 0;
        int[] GrossArray = new int[total];
        double median = 0.0;
        for (i = 0; i < n; i++)
            GrossArray[i] = nums1[i];
        for (i = n; i < total; i++)
            GrossArray[i] = nums2[j++];
        Arrays.sort(GrossArray);
        if (total % 2 == 0)
            median = (GrossArray[(total - 1) / 2] + GrossArray[total / 2]) / 2.0;
        else
            median = GrossArray[total / 2];

        return median;
    }
}
