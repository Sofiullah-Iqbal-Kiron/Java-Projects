// Accepted in first term.
// Posted in twitter.


package MonthlyChallenge2021.January;

import java.util.Arrays;

public class CheckArrayFormationThroughConcatenation
{
    public boolean canFormArray(int[] arr, int[][] pieces)
    {
        for (int[] piece : pieces)
        {
            int from = 0, to = piece.length;
            while (to <= arr.length)
            {
                if (Arrays.equals(Arrays.copyOfRange(arr, from, to), piece))
                    break;
                else if (to == arr.length && !(Arrays.equals(Arrays.copyOfRange(arr, from, to), piece)))
                    return false;
                from++;
                to++;
            }
        }

        return true;
    }
}
