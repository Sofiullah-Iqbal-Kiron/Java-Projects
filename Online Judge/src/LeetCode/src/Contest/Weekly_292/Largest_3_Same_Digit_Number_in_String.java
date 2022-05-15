// Accepted in second term.
// Not posted in twitter.
// Ubuntu pastebin: https://pastebin.ubuntu.com/p/BX4w6tfBHt/

package Contest.Weekly_292;

public class Largest_3_Same_Digit_Number_in_String {
    public String largestGoodInteger(String num) {
        String largest = "";
        for (int i = 0; i < num.length(); i++) {
            if (i + 3 > num.length()) break;
            String now = num.substring(i, i + 3);
            if (isGood(now) && now.compareTo(largest) > 0) largest = now;
        }

        return largest;
    }

    public boolean isGood(String num) {
        return num.charAt(0) == num.charAt(1) && num.charAt(1) == num.charAt(2);
    }
}

/* Best py solution.
class Solution:
    def largestGoodInteger(self, s: str) -> str:
        z = ''
        for i in range(3, len(s) + 1):
            if s[i - 3] == s[i - 2] == s[i - 1]:
                z = max(z, s[i-3:i])
        return z
*/