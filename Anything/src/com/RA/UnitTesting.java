package com.RA;

import java.util.Arrays;

public class UnitTesting
{
    public static void main(String[] args)
    {
        /*String s = "";
        int count = 1183896;
        s = Integer.toString(count);
        System.out.println(s);*/

        /*Pattern p = Pattern.compile("(\\?)");
        Matcher m = p.matcher("?ami?timi");
        int a = 0;
        while (m.find())
            a++;
        System.out.println(a);*/

        /*String s = "kiron";
        System.out.println(sortedString(s));

        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        s = new String(sChar);
        System.out.println(s);*/

//        Using of var keyword.
        /*var s1 = "Hello, World!";
        int num = 1;
        var concat = s1 + num;
        System.out.println(concat);*/

        /*var unsigned = Integer.parseUnsignedInt("3000000000");
        System.out.println(unsigned);*/

        String s = "MmaAaSs";
        System.out.println(isNice(s));
    }

    private static String sortedString(String s)
    {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        StringBuilder ss = new StringBuilder();
        for (char c : charArray)
            ss.append(c);

        return ss.toString();
    }

    private static boolean isNice(String s)
    {
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        s = new String(charS);
        for (int i = 0; i < s.length(); i++)
        {
            int val = s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ? s.charAt(i) + 32 : s.charAt(i) - 32;
            char c = (char) val;
            if (!s.contains("" + c))
                return false;
        }

        return true;
    }
}