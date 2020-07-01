package com.RA;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberConversionAnyToDecade
{
    static Scanner input = Main.input;

    public static void main(String[] args)
    {
        System.out.print("Enter number and its base: ");
        BigInteger Number;
        int base;
        Number = input.nextBigInteger();
        base = input.nextInt();
        System.out.print("Converted number is: " + convertAnyToDecade(Number, base));
        Main.newLine();

        input.close();
    }

    public static BigInteger convertAnyToDecade(BigInteger Number, int base)
    {
        /*if(current >= base)
        {
            System.out.print("Wrong Base! ");
            return BigInteger.valueOf(-1);
        }*/
        int Power = 0;
        BigInteger ans = BigInteger.ZERO, a, b;
        while (!(Number.equals(BigInteger.ZERO)))
        {
            a = Number.remainder(BigInteger.TEN);
            b = BigInteger.valueOf(base).pow(Power);
            ans = ans.add(a.multiply(b));
            Power++;
            Number = Number.divide(BigInteger.TEN);
        }

        return ans;
    }
}
