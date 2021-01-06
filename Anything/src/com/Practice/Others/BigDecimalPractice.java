package com.Practice.Others;

import java.math.BigDecimal;

public class BigDecimalPractice
{
    public static void main(String[] args)
    {
        System.out.println(args[0] + " " + args[1] + " " + args[2]);
        BigDecimal A = BigDecimal.valueOf(-0.2), B = BigDecimal.valueOf(0.1);
        System.out.println(A.subtract(B));
        System.out.println(A.abs());
        String sample = "P ZQAE TQR";
    }
}
