// Time limit exceeded at 36/38.


package MonthlyChallenge2020.December;

public class Pairs_of_Songs_With_Total_Durations_Divisible_by_60
{
    public int numPairsDivisibleBy60(int[] time)
    {
        int pairs = 0, i, j;
        for (i = 0; i < time.length - 1; i++)
        {
            for (j = i + 1; j < time.length; j++)
                if ((time[i] + time[j]) % 60 == 0)
                    pairs++;
        }

        return pairs;
    }
}
