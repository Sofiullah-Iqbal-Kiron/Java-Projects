// Accepted at first submission.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/phtQt7TXMX/

package com.LeetCode;

import java.util.Arrays;

public class SearchInsertPosition_35
{
    public int searchInsert(int[] nums, int target)
    {
        int position = Arrays.binarySearch(nums, target);
        return position < 0 ? -1 * (position + 1) : position;
    }
}
