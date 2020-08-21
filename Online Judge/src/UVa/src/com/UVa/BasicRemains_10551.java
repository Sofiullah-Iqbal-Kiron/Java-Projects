// Accepted.
// We need to learn all of build-in functions.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/rvWGCtvK9F/

package com.UVa;

import java.math.BigInteger;
import java.util.Scanner;

class BasicRemains_10551
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        while (true)
        {
            int b = input.nextInt();
            if (b == 0)
                break;
            BigInteger p = new BigInteger(input.next(), b);
            BigInteger m = new BigInteger(input.next(), b);
            System.out.println((p.mod(m)).toString(b));
        }
    }
}
