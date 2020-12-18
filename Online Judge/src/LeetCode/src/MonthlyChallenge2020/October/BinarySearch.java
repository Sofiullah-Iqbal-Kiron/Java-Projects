// Accepted.
// I am so fool as I can't implement binarySearch.
// Posted in twitter.


package MonthlyChallenge2020.October;

import java.util.Arrays;

public class BinarySearch
{
    public int search(int[] nums, int target)
    {
        int search = Arrays.binarySearch(nums, target);
        return Math.max(search, -1);
    }
}
