package com.Practice;

/*
 * String is a class in java.
 * Strings are represented by character array / sequence.
 * Strings are immutable. (StingBuffer objects are mutable.)
 * Some methods for manipulate Strings:
 -> stringObject.charAt(int index): Character at the specified index.
 -> stringObject.codePointAt(int index): Unicode value of the character at this index.
 -> stringObject.codePointBefore(int index): Unicode value of the character before of this index.
 -> stringObjectOne.compareTo(stringObjectTwo): Compares stringObjectOne due to respect of stringObjectTwo,
    lexicographically.
 -> stringObject.isEmpty(): if length is 0, returns true. WhiteSpace is also a character,
    so " " will produce false.
 * public boolean stringObject.isBlank(); Returns true if the string is empty or contains only whitespace codepoints,
 *  otherwise false.
 * */

public class StringPractice
{
    public static void main(String[] noName)
    {
        String s1 = "Kiron", s2 = "Nirob", blankSpaces = "   ";
        System.out.println(s1.charAt(0));
        System.out.println(s1.codePointAt(0));
        System.out.println(s1.codePointBefore(1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.codePointCount(1, 4));
        System.out.println(blankSpaces.isBlank());
        System.out.println();
    }
}
