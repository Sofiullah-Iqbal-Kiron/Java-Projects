// Accepted in 2nd term.
// Posted in twitter.
// Take some help from the official solution of leetcode.

package MonthlyChallenge2022.August;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Binary_Trees_With_Factors_823 {
    public int numFactoredBinaryTrees(int[] arr) {
        int MOD = 1_000_000_007;
        int len = arr.length;
        Arrays.sort(arr);
        long[] dp = new long[len];
        Arrays.fill(dp, 1);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) map.put(arr[i], i);

        for (int i = 0; i < len; i++)
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    int right = arr[i] / arr[j];
                    if (map.containsKey(right)) dp[i] = (dp[i] + dp[j] * dp[map.get(right)]) % MOD;
                }
            }

        long ans = 0;
        for (long x : dp) ans += x;

        return (int) ans % MOD;
    }

    //    Factor is a divisor of a number that divides it completely, without leaving any remainder.
    private int numberOfFactorsAvailableNow(int[] input, int i) {
        int count = 0;
        Arrays.sort(input);
        for (int looper = i - 1; looper >= 0; looper--) if (input[i] % input[looper] == 0) count++;

        return count;
    }
}
