// Accepted in 2'nd term.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/PB2PY5VBHJ/

package String.Easy;

public class LongestCommonPrefix_14
{
    public String longestCommonPrefix(String[] strs)
    {
        if (strs.length == 0)
            return "";

        String ans = "", smallest = strs[0];

        for (String s : strs)
        {
            if (s.length() < smallest.length())
                smallest = s;
        }

        int i, j;
        boolean allSatisfied = true;

        for (i = 0; i < smallest.length(); i++)
        {
            for (j = 0; j < strs.length; j++)
            {
                if (strs[j].charAt(i) != smallest.charAt(i))
                {
                    allSatisfied = !allSatisfied;
                    break;
                }
            }

            if (allSatisfied)
                ans += smallest.charAt(i);
            else
                break;
        }

        return ans;
    }
}
