// Accepted but totally discussions idea. Damn!


package com.HackerRank.Java.String.Regex;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = Integer.parseInt(input.nextLine());
        while (testCase > 0)
        {
            String s = input.nextLine();
            try
            {
                Pattern.compile(s);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e)
            {
                System.out.println("Invalid");
            }

            testCase--;
        }
    }
}
