package com.Practice.Others;

// java.lang.Character
// Wrapper class for primitive "char".
/*
 * Character variableName = 'c';
 * Character variableName = new */

import java.awt.*;

public class CharacterPractice
{
    public static void main(String[] args)
    {
        /*Character c1;
        c1 = 'c';
        System.out.println(c1);

        Character c2 = new Character('C'); // Unnecessary boxing.
        System.out.println(c2);

        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('A'));*/

        /*System.out.println(Integer.BYTES);
        System.out.println(Long.BYTES);
        System.out.println(Float.BYTES);
        System.out.println(Double.BYTES);
        System.out.println(Character.BYTES);
        System.out.println(Character.PARAGRAPH_SEPARATOR);
        Character ch = 'c';*/
        System.out.println(Character.compare('0', '1'));
        String number = "456";
        for (int i = 0; i < number.length(); i++)
            System.out.println(Character.digit(number.charAt(i), 10));

        System.out.println(Character.forDigit(9, 10));
        System.out.println(Character.getNumericValue('3'));
    }
}
