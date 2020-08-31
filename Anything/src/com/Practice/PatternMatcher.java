package com.Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher
{
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile(".xx."); // pattern is the regex pattern for match any matcher.
        Matcher matcher = pattern.matcher("AxxB");
        System.out.println(matcher.matches());

        // Or we can do that as like this:
        System.out.println("AxxB".matches(".xx.")); // String.matches(regex)
    }
}
