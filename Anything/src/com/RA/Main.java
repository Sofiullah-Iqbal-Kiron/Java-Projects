package com.RA;

import java.util.Scanner;

public class Main
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        /*String str = "";
        char c = '0';
        str += c;
        c = '1';
        str += c;
        System.out.println(str);*/

//        Checking compareTo method in java.lang.String.compareTo();
        String s1 = "Kiron", s2 = "Nirob";
        System.out.println(s1.compareTo("Niron"));
        System.out.println(("KIRON").compareTo/*IgnoreCase*/("nirob"));
        System.out.println(("KIRON").compareToIgnoreCase("nirob"));
    }

    public static void newLine()
    {
        System.out.println();
    }
}
