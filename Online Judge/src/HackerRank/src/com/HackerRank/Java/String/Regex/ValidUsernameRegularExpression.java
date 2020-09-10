// Accepted in first submission.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/3Vgs2gY7VW/

package com.HackerRank.Java.String.Regex;

import java.util.Scanner;

class UsernameValidator
{
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "[\\p{Alpha}]{1}\\w{7,29}";
}

public class ValidUsernameRegularExpression
{
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0)
        {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
}
