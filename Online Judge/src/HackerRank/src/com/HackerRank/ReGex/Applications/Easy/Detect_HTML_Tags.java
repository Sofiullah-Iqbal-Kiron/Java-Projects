// Accepted but regex is not mine.


package com.HackerRank.ReGex.Applications.Easy;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Detect_HTML_Tags
{
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = input.nextInt();
        SortedSet<String> set = new TreeSet<>();
        for (int i = 0; i <= n; i++)
        {
            //Pattern regex = Pattern.compile("<\\s*([a-zA-Z0-9]+)(\\s+.*)?>.*</\\s*\\1\\s*>");
            Pattern regex = Pattern.compile("<\\b(\\w+)\\b.*?>");
            String HTML = input.nextLine();
            Matcher matcher = regex.matcher(HTML);
            while (matcher.find())
                set.add(matcher.group(1));
        }

        if (!set.isEmpty())
        {
            System.out.print(set.first());
            set.remove(set.first());

            for (String element : set)
                System.out.print('\u003B' + element);
        }
    }
}
