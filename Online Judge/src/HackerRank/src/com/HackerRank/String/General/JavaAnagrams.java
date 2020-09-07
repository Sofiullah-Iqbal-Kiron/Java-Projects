package com.HackerRank.String.General;

class Solution
{
    static boolean isAnagram(String a, String b)
    {
        if (a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        return true;
    }
}

public class JavaAnagrams
{
    public static void main(String[] args)
    {
        /*Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = Solution.isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");*/
    }
}
