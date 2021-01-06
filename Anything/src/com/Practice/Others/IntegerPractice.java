package com.Practice.Others;

public class IntegerPractice
{
    public static void main(String[] args)
    {
        System.out.println(Integer.max(2, 3));
        System.out.println(Integer.bitCount(2)); // Binary-2 is 10, that has one true-bit. So that, it returns 1.
        System.out.println(Integer.bitCount(3));
        System.out.println(Integer.compare(3, 7)); // x < y: Less than 0.
        System.out.println(Integer.compare(-7, 3)); // x > y: Greater than 0.
        System.out.println(Integer.compareUnsigned(-7, 3));
        int aNum = Integer.decode("1023"); // Takes a number by string and returns as a int.
        System.out.println(aNum);
        System.out.println(Integer.reverse(123));
        System.out.println(Integer.divideUnsigned(9, 3));
        System.out.println(Integer.parseInt("123"));
        System.out.println(Integer.parseInt("101", 2));
        System.out.println(Integer.toBinaryString(10));
    }
}
