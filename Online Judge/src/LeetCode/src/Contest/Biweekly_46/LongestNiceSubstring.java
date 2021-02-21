// Accepted in first attempt but not in a good algo.
// Not implemented in optimal algorithm.
// Tried to post in twitter but twitter icon not loading due to my slow internet connection.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/yBYcGjD85F/


package Contest.Biweekly_46;

import java.util.Arrays;

public class LongestNiceSubstring
{
    public String longestNiceSubstring(String s)
    {
        String ans = "";
        int i = 2, start, end;
        while (i <= s.length())
        {
            start = 0;
            end = i;
            while (end <= s.length())
            {
                if (isNice(s.substring(start, end)) && s.substring(start, end).length() > ans.length())
                    ans = s.substring(start, end);
                start++;
                end++;
            }
            i++;
        }

        return ans;
    }

    private static boolean isNice(String s)
    {
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        s = new String(charS);
        for (int i = 0; i < s.length(); i++)
        {
            int val = s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ? s.charAt(i) + 32 : s.charAt(i) - 32;
            char c = (char) val;
            if (!s.contains("" + c))
                return false;
        }

        return true;
    }
}
