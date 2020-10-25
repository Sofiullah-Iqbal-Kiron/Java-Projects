// Accepted in first term. (This is a problem like a NumberSystem without any zero.)
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/mZ57dfXvGb/


package com.Math.Easy;

public class ExcelSheetColumnNumber_171
{
    final int BASE = 26;
    public int titleToNumber(String s)
    {
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--)
            ans += ((s.charAt(i) - 'A') + 1) * Math.pow(BASE, s.length() - i - 1);

        return ans;
    }
}
