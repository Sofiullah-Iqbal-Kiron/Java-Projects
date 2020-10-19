package com.PickOne;

public class Best_Time_to_Buy_and_Sell_Stock_II_122
{
    public int maxProfit(int[] prices)
    {
        int lowest, i, j, profit = 0;
        if (prices[0] < prices[1])
            lowest = prices[0];
        for (i = 1; i < prices.length - 1; i++)
        {
            if (prices[i] < prices[i - 1] && prices[i] < prices[i + 1])
            {
                for (j = i + 1; j < prices.length; j++)
                {
                    if ((prices[j] > prices[j - 1] && j + 1 < prices.length && prices[j] > prices[j + 1]) || (j == prices.length - 1 && prices[j] > prices[j - 1]))
                    {
                        profit += (prices[j] - prices[i]);
                        i = j;
                        break;
                    }
                }
            }
        }

        return profit;
    }
}
