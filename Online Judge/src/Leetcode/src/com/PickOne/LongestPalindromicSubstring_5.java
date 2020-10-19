// Accepted.
// Simple একটা বিষয়, মাথায় ধরে না।
// Get helped from https://www.youtube.com/watch?v=DK5OKKbF6GI&t=636s
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/YsHpSnMQPP/

package com.PickOne;

// Brute Force.
public class LongestPalindromicSubstring_5
{
    int resultStart = 0, resultLength = 0;

    /*public static void main(String[] args)
    {
        String s = "  ";
        System.out.println(s.isEmpty());
        System.out.println(longestPalindrome("a"));
    }*/

    /*public static String longestPalindrome(String s)
    {
        boolean allSame = true;
        for (int i = 0; i < s.length() - 1; i++)
        {
            if (s.charAt(i) != s.charAt(i + 1))
            {
                allSame = false;
                break;
            }
        }
        if (allSame)
            return s;
        String longestPalindrome = "";
        longestPalindrome += s.charAt(0);
        int i, j;
        for (i = 0; i < s.length(); i++)
        {
            for (j = i + 1; j < s.length() + 1; j++)
            {
                if (isPalindrome(s.substring(i, j)) && ((s.substring(i, j)).length() > longestPalindrome.length()))
                    longestPalindrome = s.substring(i, j);
            }
        }

        return longestPalindrome;
    }

    private static boolean isPalindrome(String s)
    {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            reversed += s.charAt(i);
        }

        return s.equals(reversed);
    }*/
//    Expending form center.
    public String longestPalindrome(String s)
    {
        int stringLength = s.length();
        if (stringLength < 2)
            return s;

        for (int start = 0; start < stringLength - 1; start++)
        {
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }

        return s.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String s, int start, int end)
    {
        while (start >= 0 && end < s.length() && (s.charAt(start) == s.charAt(end)))
        {
            start--;
            end++;
        }

        if (resultLength < end - start - 1)
        {
            resultLength = end - start - 1;
            resultStart = start + 1;
        }
    }
}
