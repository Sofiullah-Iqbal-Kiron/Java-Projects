// Problem 2, medium.
// Accepted.
// Posted in twitter.
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/2XFnCvyMyp/
// For the first time, solved 2 problems in leetcode contest.
// Passed full 1:30 hour.


package Contest.Biweekly_47;

public class Check_if_Number_is_a_Sum_of_Powers_of_Three
{
    public boolean checkPowersOfThree(int n)
    {
        for (int i = 14; i >= 0; i--)
        {
            int val = (int) Math.pow(3, i);
            if (val <= n)
                n -= val;
            if (n == 0)
                return true;
        }

        return n == 0;
    }
}
