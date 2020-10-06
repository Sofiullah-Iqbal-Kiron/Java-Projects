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

        var unsigned = Integer.parseUnsignedInt("3000000000");
        System.out.println(unsigned);
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
}