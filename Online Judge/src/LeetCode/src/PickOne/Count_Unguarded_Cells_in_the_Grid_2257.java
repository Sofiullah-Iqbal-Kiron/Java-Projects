package PickOne;

public class Count_Unguarded_Cells_in_the_Grid_2257 {
    public static void main(String[] args) {
    }

    //tle
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int unguarded = m * n - walls.length - guards.length;

        // Declare char grid.
        char[][] grid = new char[m][n];

        // Walling.
        for (int[] w : walls) grid[w[0]][w[1]] = 'W';

        // Guarding.
        for (int[] g : guards) grid[g[0]][g[1]] = 'G';

        // Iterate through guards the unguarded-- for north, east, south, west until current cell not in walls.
        for (int[] g : guards) { // What the hack is going on...
            // Top, North.
            int r = g[0] - 1;
            while (r > -1) {
                int curRow = r, curCol = g[1];
                if (grid[curRow][curCol] == 'W') break;
                if (grid[curRow][curCol] != 'G') {
                    grid[curRow][curCol] = 'G';
                    unguarded--;
                }
                r--;
            }

            // Right, East.
            int c = g[1] + 1;
            while (c < n) {
                int curRow = g[0], curCol = c;
                if (grid[curRow][curCol] == 'W') break;
                if (grid[curRow][curCol] != 'G') {
                    grid[curRow][curCol] = 'G';
                    unguarded--;
                }
                c++;
            }

            // Bottom, South.
            r = g[0] + 1;
            while (r < m) {
                int curRow = r, curCol = g[1];
                if (grid[curRow][curCol] == 'W') break;
                if (grid[curRow][curCol] != 'G') {
                    grid[curRow][curCol] = 'G';
                    unguarded--;
                }
                r++;
            }

            // Left, West.
            c = g[1] - 1;
            while (c > -1) {
                int curRow = g[0], curCol = c;
                if (grid[curRow][curCol] == 'W') break;
                if (grid[curRow][curCol] != 'G') {
                    grid[curRow][curCol] = 'G';
                    unguarded--;
                }
                c--;
            }
        }

        return unguarded;
    }
}
