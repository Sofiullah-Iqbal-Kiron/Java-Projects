// Accepted in first term.
// Posted in twitter.
// Code from mobile (Symphony P6).


package MonthlyChallenge2020.September;

public class TeemoAttacking
{
    public int findPoisonedDuration(int[] timeSeries, int duration)
    {
        int ans = duration;
        for (int i = 0; i < timeSeries.length - 1; i++)
        {
            if (timeSeries[i + 1] - timeSeries[i] < duration)
                ans += timeSeries[i + 1] - timeSeries[i];
            else
                ans += duration;
        }

        return timeSeries.length > 0 ? ans : 0;
    }
}
