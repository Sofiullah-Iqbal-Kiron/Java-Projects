// Accepted.
// Posted in twitter.
// Ubuntu-link: https://pastebin.ubuntu.com/p/bcQtwqDnfG/


package MonthlyChallenge2020.July;

public class ArrangingCoins
{
    private int arrangeCoins(int n)
    {
        int i, stairCase = 0;
        for (i = 1; ; i++)
        {
            n -= i;
            if (n >= 0)
                stairCase++;
            else
                break;
        }

        return stairCase;
    }
}
