// Accepted in second term.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/4DwH563csp/


package String.Easy;

public class Replace_All_QuesionMarks_to_Avoid_Consecutive_Repeating_Characters_1576
{
    public String modifyString(String s)
    {
        if (s.length() == 1)
            return s.equals("?") ? "a" : s;

        StringBuilder ans = new StringBuilder(s);
        if (ans.charAt(0) == '?')
            ans.setCharAt(0, giveChar(' ', s.charAt(1)));
        int i;
        for (i = 1; i < ans.length() - 1; i++)
        {
            if (s.charAt(i) == '?')
                ans.setCharAt(i, giveChar(ans.charAt(i - 1), ans.charAt(i + 1)));
        }
        if (s.charAt(i) == '?')
            ans.setCharAt(i, giveChar(ans.charAt(i - 1), ' '));

        return ans.toString();
    }

    private char giveChar(char left, char right)
    {
        char c;
        for (c = 'a'; c < 'z'; c++)
        {
            if (c != left && c != right)
                return c;
        }

        return c;
    }
}
