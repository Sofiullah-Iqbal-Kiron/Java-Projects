// Accepted.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/cfDSK6VY3W/

package com.SPOJ;

import java.math.BigInteger;
import java.util.Scanner;

class JULKAJulka
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int loop = 10;
        while (loop-- != 0)
        {
            BigInteger together, different, firstOne, secondOne;
            together = input.nextBigInteger();
            different = input.nextBigInteger();
            firstOne = (together.subtract(different)).divide(BigInteger.valueOf(2)).add(different);
            secondOne = (together.subtract(different)).divide(BigInteger.valueOf(2));
            System.out.println(firstOne + " " + secondOne);
        }

        input.close();
    }
}