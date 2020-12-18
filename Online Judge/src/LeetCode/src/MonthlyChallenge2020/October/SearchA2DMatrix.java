// Accepted in second term. First term got runtime error.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/W34qXtYbcW/


package MonthlyChallenge2020.October;

import java.util.Arrays;

public class SearchA2DMatrix
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        if (matrix.length == 0)
            return false;

        var firstFirstElement = 0;
        var lastLastElement = 0;
        if (matrix[0].length > 0)
            firstFirstElement = matrix[0][0];
        if (matrix[matrix.length - 1].length > 0)
            lastLastElement = matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1];

        if (target < firstFirstElement || lastLastElement < target)
            return false;

        for (int i = 0; i < matrix.length; i++)
        {
            if (matrix[i].length > 0 && target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1])
            {
                if (Arrays.binarySearch(matrix[i], target) > -1)
                    return true;
                else
                    return false;
            }
        }

        return false;
    }
}
