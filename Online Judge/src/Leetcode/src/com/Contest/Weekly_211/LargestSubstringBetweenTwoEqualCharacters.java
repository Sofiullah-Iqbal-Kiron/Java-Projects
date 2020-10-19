// Accepted in second term.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/ZmHB6WKhky/


package com.Contest.Weekly_211;

public class LargestSubstringBetweenTwoEqualCharacters
{
    public int maxLengthBetweenEqualCharacters(String s)
    {
        int ans = -1, i, j;
        for (i = 0; i < s.length() - 1; i++)
        {
            for (j = s.length() - 1; j > i; j--)
            {
                if (s.charAt(j) == s.charAt(i))
                    ans = Math.max(ans, s.substring(i + 1, j).length());
            }
        }

        return ans;
    }
}