// Accepted at 2nd attempt
// Posted in twitter
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/wzGcHczMM8/


package Contest.Weekly_234;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Number_of_Different_Integers_in_a_String {
    public int numDifferentIntegers(String word) {
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) if (!Character.isDigit(word.charAt(i))) sb.setCharAt(i, ' ');
        String[] s = sb.toString().split("\\s+");
        Set<BigInteger> set = new HashSet<>();
        for (String st : s)
            if (!st.equals("")) set.add(new BigInteger(st));

        return set.size();
    }
}
