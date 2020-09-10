// Accepted.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/mk2gWsZjYZ/
package com.HackerRank.Java.String.Regex;

import java.util.Scanner;

public class JavaStringTokens
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        String s = input.nextLine();
        input.close();
        s = s.trim();

        if (s.length() == 0 || s.length() > 400000)
        {
            System.out.println(0);
            return;
        }

        String[] ansString = s.split("[ *!,?._'@]+");
        System.out.println(ansString.length);
        for (String demo : ansString)
            System.out.println(demo);
    }
}
