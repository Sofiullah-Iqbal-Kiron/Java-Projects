package com.Practice;

/*
 * String is a class in java.
 * Strings are immutable.
 * Some methods for manipulate Strings:
 -> stringObject.charAt(int index): Character at the specified index.
 -> stringObject.codePointAt(int index): Unicode value of the character at this index.
 -> stringObject.codePointBefore(int index): Unicode value of the character before of this index.
 -> stringObjectOne.compareTo(stringObjectTwo): Compares stringObjectOne due to respect of stringObjectTwo,
   lexicographically.
 * */

public class StringPractice
{
    public static void main(String[] noName)
    {
        String s1 = "Kiron", s2 = "Nirob";
        System.out.println(s1.charAt(0));
        System.out.println(s1.codePointAt(0));
        System.out.println(s1.codePointBefore(1));
        System.out.println(s1.compareTo(s2));
    }
}
