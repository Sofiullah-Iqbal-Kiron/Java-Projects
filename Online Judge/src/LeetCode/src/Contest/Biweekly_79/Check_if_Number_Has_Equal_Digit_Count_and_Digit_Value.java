// Accepted in first term at last time closer.
// Passed a long time just fixing Null Exception/Runtime Error.
// Ubuntu pastebin: https://pastebin.ubuntu.com/p/nqQrsVr4VJ/

package Contest.Biweekly_79;

import java.util.HashMap;
import java.util.Map;

public class Check_if_Number_Has_Equal_Digit_Count_and_Digit_Value {
    public boolean digitCount(String num) {
        int n = num.length();
        Map<Character, Integer> map = new HashMap<>();
        boolean theans = true;
        for (int i = 0; i < n; i++)
            map.put(num.charAt(i), map.getOrDefault(num.charAt(i), 0) + 1);

        for (int i = 0; i < n; i++) {
            char cc = (char) (i + '0');
            if (map.get(cc) == null) {
                if (num.charAt(i) != '0') {
                    theans = false;
                    break;
                }
            } else if ((char) (map.get(cc) + '0') != num.charAt(i)) return false;
        }

        return theans;
    }
}
