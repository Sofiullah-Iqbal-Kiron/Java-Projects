// Accepted.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/phGnfpWhKp/


package Math.Easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202
{
    public boolean isHappy(int n)
    {
        if (n < 1)
            return false;
        Set<Integer> tracker = new HashSet<>();
        while (true)
        {
            if (n == 1)
                return true;
            else if (!tracker.add(n))
                return false;
            n = digitSquareSum(n);
        }
    }

    private int digitSquareSum(int n)
    {
        int ans = 0;
        while (n > 0)
        {
            ans += Math.pow(n % 10, 2);
            n /= 10;
        }

        return ans;
    }
}
