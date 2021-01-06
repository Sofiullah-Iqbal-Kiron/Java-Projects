package com.Practice.Others;

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
   otherwise false.
 * Whitespace character: '\u0020'
 * stringObject.trim(): Returns that string without all leading and trialing whitespaces.
 * stringObjectOne.concat(stringObjectTwo): concatenate two strings.
 * stringObject.repeat(int count): Returns a string whose value is the concatenation of this string repeated count
 * times.
 * stringObject.stripLeading(): Returns a string whose value is this string, with all leading white space removed.
 * stringObject.stripTrialing(): Returns a string whose value is this string, with all trailing white space removed.*/

public class StringPractice
{
    public static void main(String[] noName)
    {
        String s1 = "       Kiron" + '\u0020', s2 = "Nirob", blankSpaces = "   ";
        System.out.println(s1.charAt(0));
        System.out.println(s1.codePointAt(0));
        System.out.println(s1.codePointBefore(1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.codePointCount(1, 4));
        System.out.println(blankSpaces.isBlank());
        System.out.println(s1.trim());
        System.out.println("Sofiullah Iqbal".concat(" Kiron"));
        System.out.println(s2.repeat(2));
        System.out.println(s1.strip());
        System.out.println(s1.stripLeading());
        System.out.println(s1.stripTrailing());
    }
}
