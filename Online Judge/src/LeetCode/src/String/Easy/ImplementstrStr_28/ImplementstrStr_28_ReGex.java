// Accepted.


package String.Easy.ImplementstrStr_28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImplementstrStr_28_ReGex
{
    public int strStr(String haystack, String needle)
    {
        if (needle.isEmpty())
            return 0;
        Pattern p = Pattern.compile(needle);
        Matcher m = p.matcher(haystack);

        if (m.find())
            return m.start();
        else
            return -1;
    }
}
