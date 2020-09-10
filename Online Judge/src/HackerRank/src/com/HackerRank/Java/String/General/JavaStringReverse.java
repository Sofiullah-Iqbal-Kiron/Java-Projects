// Accepted.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/NnX8GSPQzX/

package com.HackerRank.Java.String.General;

import java.util.Scanner;

public class JavaStringReverse
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String revA = new StringBuffer(A).reverse().toString();
        System.out.println(A.equals(revA) ? "Yes" : "No");
    }
}
