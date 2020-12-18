// Accepted.
// Posted in twitter.
// Code from mobile (Symphony P6).


package MonthlyChallenge2020.September;

import java.util.Arrays;

public class GasStation
{
    public int canCompleteCircuit(int[] gas, int[] cost)
    {
        int totalGas = Arrays.stream(gas).sum(), totalCost = Arrays.stream(cost).sum();
        if (totalCost > totalGas)
            return -1;
        int i;
        for (i = 0; i < gas.length; i++)
        {
            if (gas[i] >= cost[i] && canPass(i, gas, cost))
                return i;
        }

        return -1;
    }

    private boolean canPass(int currentPoint, int[] gas, int[] cost)
    {
        int currentGas = gas[currentPoint], previousPoint = currentPoint, step = 0;
        while (step <= gas.length)
        {
            if (currentGas >= cost[currentPoint])
            {
                previousPoint = currentPoint == gas.length - 1 ? gas.length - 1 : currentPoint;
                currentPoint = currentPoint == gas.length - 1 ? 0 : currentPoint + 1;
                step++;
                currentGas = (currentGas - cost[previousPoint]) + gas[currentPoint];
            }
            else
                return false;
        }

        return true;
    }
}
