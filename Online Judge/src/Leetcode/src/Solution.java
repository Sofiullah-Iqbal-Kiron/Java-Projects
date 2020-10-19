import java.util.Arrays;

/*class Solution
{
    public double trimMean(int[] arr)
    {
        Arrays.sort(arr);
        int toDel = (arr.length * 5) / 100;
        int from = toDel, to = arr.length - 1 - toDel;
        long sum = 0;
        for (int i = from; i <= to; i++)
            sum += arr[i];

        return (double) sum / (arr.length - toDel * 2.0);
    }
}*/

/*class Solution
{
    private int euDistance(int a, int b, int x, int y)
    {
        return (int) Math.sqrt((y - b) * (y - b) + (x - a) * (x - a));
    }

    public int[] bestCoordinate(int[][] towers, int radius)
    {
        if (towers ==new int[][]{{1, 2, 5}, {2, 1, 7}, {3, 1, 9}};
        int[] ans = {towers[0][0], towers[0][1]};
        int nq = 0;
        for (int i = 0; i < towers.length; i++)
        {
            int cnq = 0;
            for (int j = 0; j < towers.length; j++)
            {
                int d = euDistance(towers[i][0], towers[i][1], towers[j][0], towers[j][1]);
                if (d <= radius)
                    cnq += Math.floor(towers[j][2] / (1 + d));
            }
            if (cnq >= nq)
            {
                ans = small(ans, new int[] {towers[i][0], towers[i][1]});
                nq = cnq;
            }
        }

        return ans;
    }

    private int[] small(int[] a, int[] b)
    {
        if (a[0] < b[0] || (a[0] == b[0] && a[1] < b[1]))
            return a;
        else
            return b;
    }
}*/

/*
// An O(n*n) solution from contest discuss.
class Solution
{
    public int[] bestCoordinate(int[][] towers, int radius)
    {
        int[] res = new int[] {towers[0][0], towers[0][1]};
        int maxq = towers[0][2];
        for (int i = 0; i < towers.length; i++)
        {
            int curq = 0;
            for (int j = 0; j < towers.length; j++)
            {
                double d =
                        Math.sqrt((towers[i][0] - towers[j][0]) * (towers[i][0] - towers[j][0]) + (towers[i][1] -
                        towers[j][1]) * (towers[i][1] - towers[j][1]));
                curq += d <= radius ? (int) Math.floor(towers[j][2] / (d + 1)) : 0;
            }

            if (curq > maxq)
            {
                maxq = curq;
                res = new int[] {towers[i][0], towers[i][1]};
            }
            else if (curq == maxq)
            {
                if (res[0] > towers[i][0] || (res[0] == towers[i][0] && res[1] > towers[i][1]))
                {
                    res = new int[] {towers[i][0], towers[i][1]};
                }
            }
        }
        return res;
    }
}*/


// Last submitted but not accepted. Need to sort according to the ages.
class Solution
{
    public int bestTeamScore(int[] scores, int[] ages)
    {
        int younger = 0, elder = 0;
        for (int i = 0; i < scores.length; i++)
        {
            if (!conflict(ages[i], scores[i], ages, scores))
                younger += scores[i];
            else
                elder += scores[i];
        }

        return Math.max(younger, elder);
    }

    private boolean conflict(int age, int score, int[] ages, int[] scores)
    {
        for (int i = 0; i < ages.length; i++)
        {
            if (age > ages[i] && score < scores[i])
                return true;
        }

        return false;
    }
}