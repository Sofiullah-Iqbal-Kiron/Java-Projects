package com.Practice;

/*
 * BigInteger class use array of data to store, manipulate and calculate those.
 * Some macros: 1. BigInteger.ZERO
 *              2. BigInteger.ONE
 *              4. BigInteger.TWO
 *              5. BigInteger.TEN
 * Assign value: BigInteger.valueOf(val);
 * */

import java.math.BigInteger;

public class BigIntegerPractice
{
    public static void main(String[] args)
    {
        BigInteger A = BigInteger.valueOf(10);
        BigInteger B = BigInteger.valueOf(20);
        System.out.println(A.add(B) + " " + A.subtract(B) + " " + A.multiply(B));
    }
}
