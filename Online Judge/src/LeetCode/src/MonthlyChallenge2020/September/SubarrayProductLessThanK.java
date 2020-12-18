package MonthlyChallenge2020.September;

import java.util.Arrays;

public class SubarrayProductLessThanK
{
    public int numSubarrayProductLessThanK(int[] nums, int k)
    {
        if (k == 0)
            return 0;
        int count = 0;
        for (int len = 1; len <= nums.length; len++)
        {
            for (int i = 0; i < nums.length; i++)
            {
                if (mul(Arrays.copyOfRange(nums, i, i + len)) < k)
                    count++;
            }
        }

        return count;
    }

    private long mul(int[] arr)
    {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++)
            ans *= arr[i];

        return ans;
    }
}
