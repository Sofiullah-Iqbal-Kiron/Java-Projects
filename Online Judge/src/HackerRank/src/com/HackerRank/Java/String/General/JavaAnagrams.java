// Accepted.
// Ubuntu-Link:

package com.HackerRank.Java.String.General;

import java.util.Scanner;

class Solution
{
    static boolean isAnagram(String a, String b)
    {
        if (a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aChar = a.toCharArray(), bChar = b.toCharArray();
        java.util.Arrays.sort(aChar);
        java.util.Arrays.sort(bChar);

        return java.util.Arrays.equals(aChar, bChar);
    }
}

public class JavaAnagrams
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = Solution.isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
