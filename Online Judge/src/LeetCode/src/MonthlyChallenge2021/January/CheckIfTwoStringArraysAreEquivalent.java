// Accepted at 2nd attempt.
// Posted in twitter.
// 107 dne.


package MonthlyChallenge2021.January;

public class CheckIfTwoStringArraysAreEquivalent
{
    public boolean arrayStringAreEqual(String[] word1, String[] word2)
    {
        int looper = Math.max(word1.length, word2.length);
        String first = "", second = "";
        for (int i = 0; i < looper; i++)
        {
            if (i < word1.length)
                first += word1[i];
            if (i < word2.length)
                second += word2[i];
            if (first.length() == second.length() && !first.equals(second))
                return false;
        }

        return first.equals(second);
    }
}
