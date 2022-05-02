// Helper code: https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/discuss/1996226/Java-Solution-using-Sort
// Optimized solution of first Q of weekly contest 291.

// Accepted.
// Posted in twitter.
// Ubuntu pastebin: https://pastebin.ubuntu.com/p/VVDvHGzWpX/

package PickOne;

import java.math.BigInteger;

public class Remove_Digit_From_Number_to_Maximize_Result_2259 {
    public String removeDigit(String number, char digit) {
        String ans = "1";
        for (int i = 0; i < number.length(); i++) { // O(n)
            if (number.charAt(i) == digit) {
                String cur = number.substring(0, i) + number.substring(i + 1);
                ans = new BigInteger(ans).max(new BigInteger(cur)).toString(); // O(1)
            }
        }

        return ans;
    }
}
