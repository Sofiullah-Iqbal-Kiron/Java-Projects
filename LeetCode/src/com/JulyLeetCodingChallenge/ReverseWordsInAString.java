package com.JulyLeetCodingChallenge;

public class ReverseWordsInAString
{
    public String reverseWords(String s)
    {
        s = removeSideSpaces(s);
        final int length = s.length();
        int i, start = length - 1, end = start + 1;
        String ans = "";
        for (i = length - 1; i >= 0; i--)
        {
            boolean pass = false;
            if (s.charAt(i) == ' ' || i == 0)
            {
                start = (s.charAt(i) == ' ' ? i + 1 : 0);
                ans += s.substring(start, end);
                while (s.charAt(i) == ' ' && i != 0)
                {
                    ans += ' ';
                    i--;
                    pass = true;
                }
                end = i;
            }
            if (pass)
                i++;
        }

        return ans;
    }

    private String removeSideSpaces(String s)
    {
        int start = 0, end = s.length();
        while (s.charAt(start) == ' ')
            start++;
        while (s.charAt(end - 1) == ' ')
            end--;

        return s.substring(start, end);
    }
}
