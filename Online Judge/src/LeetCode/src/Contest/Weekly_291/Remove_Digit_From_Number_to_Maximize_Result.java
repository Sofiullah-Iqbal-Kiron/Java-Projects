// Accepted when just contest ended.
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/c5t9WCsB9d/
// Nice solution: https://www.youtube.com/watch?v=mvFIQmYiBhQ

package Contest.Weekly_291;

import java.math.BigInteger;

public class Remove_Digit_From_Number_to_Maximize_Result {
    public String removeDigit(String number, char digit) {
        StringBuilder ans = new StringBuilder("1"), nowVal = new StringBuilder("0"), cur = new StringBuilder("0");
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                cur = new StringBuilder(nowVal);
                if (i + 1 < number.length())
                    cur.append(number.substring(i + 1));
                BigInteger a = new BigInteger(ans.toString()), b = new BigInteger(cur.toString());
                ans = new StringBuilder(a.max(b).toString());
                nowVal.append(number.charAt(i));
            } else nowVal.append(number.charAt(i));
        }

        BigInteger a = new BigInteger(ans.toString()), b = new BigInteger(cur.toString());
        return a.max(b).toString();
    }
}

// "2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471"
//"3"
// This throws NumberFormatException while parsing a large int that is not in bound of int. That's why, I used BigInteger. Python is handy for such cases.