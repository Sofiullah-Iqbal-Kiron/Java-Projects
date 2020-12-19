// Problem of 18 Dec.
// Accepted in third term. O(n) approach. 61 TestCases.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/YHJF85rkXj/


package MonthlyChallenge2020.December;

public class IncreasingTripletSubsequence
{
    public boolean increasingTriplet(int[] nums)
    {
        long first, second, third;
        first = second = third = Long.MAX_VALUE;
        int i = 0, j = 1, k = 2;
        while (k < nums.length)
        {
            if (nums[i] < second)
                first = nums[i];
            if (nums[j] > first)
                second = nums[j];
            if (nums[k] > second)
                third = nums[k];

            if (first != Long.MAX_VALUE && second != Long.MAX_VALUE && third != Long.MAX_VALUE && first < second && second < third)
                return true;

            i++;
            j++;
            k++;
        }

        return false;
    }
}
