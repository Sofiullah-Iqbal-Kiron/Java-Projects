// Accepted at 6'th submission.
// Posted in twitter.

package PickOne;

public class Minimum_Average_Difference_2256 {
    public int minimumAverageDifference(int[] nums) {
        if (nums.length == 1) return 0; // If ignored, divide by 0 ArithmeticException will occur at line 13.

        int minIndex = 0, n = nums.length;
        long leftVal = nums[0], rightVal = 0;
        for (int i = 1; i < nums.length; i++) rightVal += nums[i];

        long minAD = Math.abs(leftVal - rightVal / (n - 1));

        for (int i = 1; i < n; i++) {
            leftVal += nums[i];
            rightVal -= nums[i];
            long currMinAD = Math.abs(leftVal / (i + 1) - rightVal / Math.max(1, n - i - 1));
            if (currMinAD < minAD) {
                minAD = currMinAD;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
