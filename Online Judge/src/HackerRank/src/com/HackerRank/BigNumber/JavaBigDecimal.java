// Accepted.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/vfDZkrwbfp/

package com.HackerRank.BigNumber;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal
{
    public static void main(String[] args)
    {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++)
            s[i] = sc.next();
        sc.close();

//        My codePoint
        int x, y;
        BigDecimal[] converted = new BigDecimal[n];

        for (x = 0; x < n; x++)
            converted[x] = new BigDecimal(s[x]);

        boolean swapped;

        for (x = 0; x < n - 1; x++)
        {
            swapped = false;
            for (y = 0; y < n - x - 1; y++)
            {
                if (converted[y].compareTo(converted[y + 1]) < 0)
                {
                    String temp = s[y];
                    s[y] = s[y + 1];
                    s[y + 1] = temp;

                    BigDecimal demo = converted[y];
                    converted[y] = converted[y + 1];
                    converted[y + 1] = demo;

                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        //Output
        for (int i = 0; i < n; i++)
            System.out.println(s[i]);
    }
}

// Tip: (ctrl + up / ctrl + down) will (up / down) the screen without moving the (caret / cursor).