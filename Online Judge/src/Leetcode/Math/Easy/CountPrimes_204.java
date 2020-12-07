// Accepted.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/7TDKFdSv94/


package Leetcode.Math.Easy;

import java.util.Arrays;

public class CountPrimes_204
{
    public int countPrimes(int n)
    {
        int count = 0, i, j;
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        for (i = 2; i * i < n; i++)
        {
            if (primes[i])
                count++;
            for (j = 2; i * j < n; j++)
                primes[i * j] = false;
        }

        for (j = i; j < n; j++)
        {
            if (primes[j])
                count++;
        }

        return count;
    }
}
