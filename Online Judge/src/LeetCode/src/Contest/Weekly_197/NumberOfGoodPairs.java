// Accepted.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/hSxnxfGFBy/

package Contest.Weekly_197;

public class NumberOfGoodPairs
{
    public int numIdenticalPairs(int[] nums)
    {
        int i, j, pairs = 0;
        for (i = 0; i < nums.length; i++)
        {
            for (j = i + 1; j < nums.length; j++)
            {
                if (nums[i] == nums[j])
                    pairs++;
            }
        }

        return pairs;
    }
}
