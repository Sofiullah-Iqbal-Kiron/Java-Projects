// Accepted in 2'nd term.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/g8d8q3ws6T/

package MonthlyChallenge2020.July;

public class ReverseWordsInAString
{
    public String reverseWords(String s)
    {
        s = removeSideSpaces(s);
        if (s == "")
            return s;
        final int length = s.length();
        int i, start = length - 1, end = start + 1;
        String ans = "";
        for (i = length - 1; i >= 0; i--)
        {
            if (s.charAt(i) == ' ' || i == 0)
            {
                start = (s.charAt(i) == ' ' ? i + 1 : 0);
                ans += s.substring(start, end);
                if (i != 0)
                    ans += ' ';
                while (i - 1 > -1 && s.charAt(i - 1) == ' ')
                {
                    i--;
                }
                end = i;
            }
        }

        return ans;
    }

    private String removeSideSpaces(String s)
    {
        int start = 0, end = s.length();
        while (start < end && s.charAt(start) == ' ')
        {
            start++;
        }
        while (end > start && s.charAt(end - 1) == ' ')
        {
            end--;
        }

        return s.substring(start, end);
    }
}

/*
class Solution
{
    public String reverseWords(String s)
    {
        String[] str = s.split(" ");
        StringBuffer sBuff = new StringBuffer();
        for (int i = str.length - 1; i >= 0; i--)
        {
            if (!str[i].isEmpty())
            {
                sBuff = sBuff.append(str[i]);
                if (i != 0)
                    sBuff.append(" ");
            }

        }
        return sBuff.toString().trim();
    }
}*/
