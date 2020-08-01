package com.Practice;

// java.lang.Character
// Wrapper class for primitive "char".
/*
 * Character variableName = 'c';
 * Character variableName = new */

public class CharacterPractice
{
    public static void main(String[] args)
    {
        Character c1;
        c1 = 'c';
        System.out.println(c1);

        Character c2 = new Character('C'); // Unnecessary boxing.
        System.out.println(c2);

        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('A'));
    }
}
