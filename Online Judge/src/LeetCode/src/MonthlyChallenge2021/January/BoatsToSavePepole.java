// Accepted in first term.
// Posted in twitter.
// 108 dne.


package MonthlyChallenge2021.January;

import java.util.Arrays;

public class BoatsToSavePepole
{
    public int numRescueBoats(int[] people, int limit)
    {
        Arrays.sort(people);
        int first = 0, last = people.length - 1, ans = 0;
        while (first <= last)
        {
            if (first != last && people[first] + people[last] <= limit)
                first++;
            ans++;
            last--;
        }

        return ans;
    }
}
