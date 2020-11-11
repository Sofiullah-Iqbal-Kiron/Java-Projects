package com.HackerRank.ReGex.Introduction;

import java.util.*;
import java.util.regex.*;

public class MatchingAnythingButANewline
{
    public static void main(String[] args)
    {
        Tester tester = new Tester();
        tester.check("...\\....\\....\\....");
    }
}

class Tester
{
    public void check(String pattern)
    {
        Scanner scanner = new Scanner(System.in);
        String testString = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        boolean match = m.matches();

        System.out.format("%s", match);
    }
}