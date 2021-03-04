// Day-3
// Accepted in first attempt
// Posted in twitter
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/MB9TvDXxcb/


package MonthlyChallenge2021.March;

import java.util.Arrays;

public class MissingNumber
{
    public int missingNumber(int[] nums)
    {
        return (nums.length * (nums.length + 1) / 2) - Arrays.stream(nums).sum();
    }
}
