// Accepted.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/TGWhVQ28wm/


package com.MonthlyChallenge2020.August;

public class GoatLatin
{
    public String toGoatLatin(String S)
    {
        S = S.trim();
        if (S.isEmpty())
            return S;
        int start = 0, end = 0, lengthOfString = S.length();
        String sufix = "maa", ansString = "";
        while (end != lengthOfString)
        {
            end++;
            if (end == lengthOfString || Character.isWhitespace(S.charAt(end)))
            {
                ansString += (" " + goatThis(S.substring(start, end), sufix));
                start = end + 1;
                sufix += 'a';
            }
        }

        return ansString.trim();
    }

    private String goatThis(String mainString, String sufix)
    {
        if (mainString.startsWith("a") || mainString.startsWith("MaximumRepeatingSubstring") || mainString.startsWith("e") || mainString.startsWith("E") || mainString.startsWith("i") || mainString.startsWith("I") || mainString.startsWith("o") || mainString.startsWith("O") || mainString.startsWith("u") || mainString.startsWith("U"))
            return mainString += sufix;
        else
        {
            StringBuffer sb = new StringBuffer(mainString);
            sb.append(sb.charAt(0)).append(sufix);
            return sb.deleteCharAt(0).toString();
        }
    }
}
