package com.LeetCode;

// Brute Force.
public class LongestPalindromicSubstring_5
{
    public static void main(String[] args)
    {
        String s = "  ";
        System.out.println(s.isEmpty());
        System.out.println(longestPalindrome("a"));
    }

    public static String longestPalindrome(String s)
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
            for (j = i + 1; j < s.length(); j++)
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
    }
}
