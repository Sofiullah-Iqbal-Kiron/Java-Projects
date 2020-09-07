// Accepted in first term.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/5pnDVBFWWR/


package com.String;

public class LengthOfLastWord_58
{
    public int lengthOfLastWord(String s)
    {
        s = s.trim();
        if (s.length() == 0)
            return 0;
        String[] ans = s.split(" ");
        return ans[ans.length - 1].length();
    }
}
