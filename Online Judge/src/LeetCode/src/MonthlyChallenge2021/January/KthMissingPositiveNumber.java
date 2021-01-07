// Accepted in second term.
// Posted in twitter.
// 106 dne.


package MonthlyChallenge2021.January;

import java.util.Arrays;

public class KthMissingPositiveNumber
{
    public int findKthPositive(int[] arr, int k)
    {
        int i;
        for (i = 1; i <= 2000; i++)
            if (Arrays.binarySearch(arr, i) < 0 && --k == 0)
                break;

        return i;
    }
}
