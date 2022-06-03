// Accepted by taking help from Solaiman.
// Posted in twitter.
// Ubuntu pastebin: https://pastebin.ubuntu.com/p/zsZWGVfJcZ/

package PickOne;

import java.util.Arrays;

public class Count_Unguarded_Cells_in_the_Grid_2257 {
    public static void main(String[] args) {
    }

    //tle
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int unguarded = 0;

        // Declare char grid and initialize with 'u'.
        char[][] grid = new char[m][n];
        for (char[] g : grid) Arrays.fill(g, 'u');

        // Walling.
        for (int[] w : walls) grid[w[0]][w[1]] = 'W';

        // Guarding.
        for (int[] g : guards) grid[g[0]][g[1]] = 'G';

        // Iterate through guards the unguarded-- for north, east, south, west until current cell not in walls.
        for (int[] g : guards) {
            // Top, North.
            int r = g[0] - 1;
            while (r > -1 && grid[r][g[1]] != 'W' && grid[r][g[1]] != 'G') {
                grid[r][g[1]] = 'g'; // After assigning 'g' code is accepted.
                r--;
            }

            // Right, East.
            int c = g[1] + 1;
            while (c < n && grid[g[0]][c] != 'W' && grid[g[0]][c] != 'G') {
                grid[g[0]][c] = 'g'; // After assigning 'g' code is accepted.
                c++;
            }

            // Bottom, South.
            r = g[0] + 1;
            while (r < m && grid[r][g[1]] != 'W' && grid[r][g[1]] != 'G') {
                grid[r][g[1]] = 'g'; // After assigning 'g' code is accepted.
                r++;
            }

            // Left, West.
            c = g[1] - 1;
            while (c > -1 && grid[g[0]][c] != 'W' && grid[g[0]][c] != 'G') {
                grid[g[0]][c] = 'g'; // After assigning 'g' code is accepted.
                c--;
            }
        }

        // Counting unguarded cells.
        for (char[] g : grid) for (char gChar : g) if (gChar == 'u') unguarded++;

        return unguarded;
    }
}