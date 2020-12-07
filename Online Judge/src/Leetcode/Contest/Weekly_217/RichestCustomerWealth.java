// Accepted.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/kxqkx47Xsy/


package Leetcode.Contest.Weekly_217;

public class RichestCustomerWealth
{
    public int maximumWealth(int[][] accounts)
    {
        int i, ans = 0;
        for (i = 0; i < accounts.length; i++)
            ans = sum(accounts[i]) > ans ? sum(accounts[i]) : ans;

        return ans;
    }

    private static int sum(int[] array)
    {
        int sum = 0;
        for (int value : array)
            sum += value;

        return sum;
    }
}