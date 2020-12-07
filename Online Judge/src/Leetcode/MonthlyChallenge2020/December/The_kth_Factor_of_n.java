// Accepted in second term.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/kDJjvtGjxZ/


package com.MonthlyChallenge2020.December;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class The_kth_Factor_of_n
{
    public int kthFactor(int n, int k)
    {
        Set<Integer> ansSet = new TreeSet<>();
        ansSet.add(1);

        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0)
            {
                ansSet.add(i);
                ansSet.add(n / i);
            }
        }
        ansSet.add(n);
        ArrayList<Integer> ans = new ArrayList<>(ansSet);

        return k > ans.size() ? -1 : ans.get(k - 1);
    }
}
