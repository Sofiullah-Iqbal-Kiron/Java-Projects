// Problem 1, easy.
// Accepted.
// Posted in twitter.
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/yFFGXFgCNZ/
// For the first time, solved 2 problems in leetcode contest.
// Passed full 1:30 hour.


package Contest.Biweekly_47;

public class Find_Nearest_Point_That_Has_the_Same_X_or_Y_Coordinate
{
    public int nearestValidPoint(int x, int y, int[][] points)
    {
        int ans = Integer.MAX_VALUE, mD = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++)
        {
            if (points[i][0] == x || points[i][1] == y)
            {
                int cmD = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (cmD < mD)
                {
                    mD = cmD;
                    ans = i;
                }
                else if (cmD == mD)
                    ans = Math.min(ans, i);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
