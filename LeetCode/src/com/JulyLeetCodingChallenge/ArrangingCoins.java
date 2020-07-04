// Accepted.
// Posted in twitter.
// Ubuntu-link: https://pastebin.ubuntu.com/p/bcQtwqDnfG/

package com.JulyLeetCodingChallenge;

import com.RA.Main;

import java.util.Scanner;

public class ArrangingCoins
{
    public static void main(String[] args)
    {
        Scanner input = Main.input;
        System.out.println(arrangeCoins(input.nextInt()));
    }

    private static int arrangeCoins(int n)
    {
        int i, stairCase = 0;
        for (i = 1; ; i++)
        {
            n -= i;
            if (n >= 0)
                stairCase++;
            else
                break;
        }

        return stairCase;
    }
}
