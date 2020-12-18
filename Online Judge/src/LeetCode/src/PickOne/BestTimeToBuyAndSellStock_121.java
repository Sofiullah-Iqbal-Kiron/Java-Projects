// Accepted in first term.
// -> The algorithm is from leetcode official solution site (O(n) pass) but I understands this perfectly and also
// solved this in geeksforgeeks before.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/TBZmfNKJz9/


package PickOne;

public class BestTimeToBuyAndSellStock_121
{
    public int maxProfit(int[] prices)
    {
        int lowest = Integer.MAX_VALUE, profit = 0;
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] < lowest)
                lowest = prices[i];
            else if (prices[i] - lowest > profit)
                profit = prices[i] - lowest;
        }

        return profit;
    }
}
