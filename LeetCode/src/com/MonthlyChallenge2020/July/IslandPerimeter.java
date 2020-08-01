// Accpeted.
// Shared in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/BsjTbrxsHD/

package com.MonthlyChallenge2020.July;

public class IslandPerimeter
{
    public int islandPerimeter(int[][] grid)
    {
        if (grid.length == 0)
            return 0;
        int i, j, perimeter = 0;
        for (i = 0; i < grid.length; i++)
        {
            for (j = 0; j < grid[0].length; j++)
            {
                if (grid[i][j] > 0)
                {
                    perimeter += 4;
                    if ((j - 1 >= 0) && (grid[i][j - 1] > 0))
                        perimeter--;
                    if ((j + 1 < grid[0].length) && (grid[i][j + 1] > 0))
                        perimeter--;
                    if ((i - 1 >= 0) && (grid[i - 1][j] > 0))
                        perimeter--;
                    if ((i + 1 < grid.length) && (grid[i + 1][j] > 0))
                        perimeter--;
                }
            }
        }

        return perimeter;
    }

//    ServerSolution
    /*class Solution
    {
        public int islandPerimeter(int[][] grid)
        {
            int perimeter = 0;
            int n = grid.length;
            int m = grid[0].length;
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    if (grid[i][j] == 0)
                        continue;
                    if (i == 0 || grid[i - 1][j] == 0)
                        perimeter++;
                    if (i == n - 1 || grid[i + 1][j] == 0)
                        perimeter++;
                    if (j == 0 || grid[i][j - 1] == 0)
                        perimeter++;
                    if (j == m - 1 || grid[i][j + 1] == 0)
                        perimeter++;
                }
            }

            return perimeter;
        }
    }*/
}
