package com.Practice;

/*
 * BigInteger class use array of data to store, manipulate and calculate those.
 * Some macros: 1. BigInteger.ZERO
 *              2. BigInteger.ONE
 *              4. BigInteger.TWO
 *              5. BigInteger.TEN
 * Assign value: BigInteger.valueOf(val);
 * BigIntegerObject.toString(int radix); -> String representation of this BigIntegerObject based on radix.
 * If we omit "radix" part, the 10 will be set up as radix-point, automatically.
 * */

import java.math.BigInteger;

public class BigIntegerPractice
{
    public static void main(String[] args)
    {
        System.out.println("First part");
        BigInteger A = new BigInteger("98687907777777773657777753577777465435375595867546456445800987");
        BigInteger B = BigInteger.valueOf(20);
        System.out.println(A.add(B) + " " + A.subtract(B) + " " + A.multiply(B));

        System.out.println('\n' + "Second part");
        System.out.println("Octal representation of number 10: " + A.toString(8));
        System.out.println("Or by auto radix (Base 10): " + A.toString());

        System.out.println('\n' + "Third part");
        int a = A.intValue();
        System.out.println(a + " " + A.longValue() + " " + A.doubleValue());

        System.out.println('\n' + "Fifth part");
    }
}
