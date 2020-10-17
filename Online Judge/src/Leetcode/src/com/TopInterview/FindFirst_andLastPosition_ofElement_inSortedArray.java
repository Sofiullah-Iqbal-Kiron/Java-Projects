// Accepted in first term but not in O(Log(n)). I need to solve this in binarySearch manner.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/CJhYf4Bgnd/
// Posted in discuss section also.


package com.TopInterview;

public class FindFirst_andLastPosition_ofElement_inSortedArray
{
    public int[] searchRange(int[] nums, int target)
    {
        int[] ans = {-1, -1};

        if (nums.length == 0 || target < nums[0] || target > nums[nums.length - 1])
            return ans;

        int left = 0, right = nums.length - 1;
        while (left <= right)
        {
            if (nums[left] == target)
                ans[0] = left;
            if (ans[0] == -1)
                left++;
            if (nums[right] == target)
                ans[1] = right;
            if (ans[1] == -1)
                right--;
            if (ans[0] != -1 && ans[1] != -1)
                break;
        }

        return ans;
    }
}
