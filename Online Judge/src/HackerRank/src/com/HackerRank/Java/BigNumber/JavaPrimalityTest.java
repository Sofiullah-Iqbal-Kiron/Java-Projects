// Accepted.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/dMTJGpNGFp/


package com.HackerRank.Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        BigInteger number = input.nextBigInteger(10);
        if (number.isProbablePrime(10))
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
