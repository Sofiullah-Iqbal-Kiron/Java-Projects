// Accepted after a long devotion.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/yvhCQdqZCY/


package com.HackerRank.String.Regex;

import java.util.Scanner;

class JavaRegex
{
    public static void main(String[] args)
    {

        String regex = "(\\d{1,2}|([0-2](([0-4]\\d)|(5[0-5]))))";
        String original = regex + "\\." + regex + "\\." + regex + "\\." + regex;
        Scanner in = new Scanner(System.in);

        while (in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(original));
        }
    }
}
