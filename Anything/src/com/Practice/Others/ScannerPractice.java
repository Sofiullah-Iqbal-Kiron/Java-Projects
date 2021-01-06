package com.Practice.Others;

import java.util.Scanner;

public class ScannerPractice
{
    public static void main(String[] args)
    {
        String input = "1 fish 2 fish One fish Two fish";
        Scanner scan = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(scan.nextInt());
        System.out.println(scan.nextInt());
        System.out.println(scan.next());
        System.out.println(scan.next());
    }
}
