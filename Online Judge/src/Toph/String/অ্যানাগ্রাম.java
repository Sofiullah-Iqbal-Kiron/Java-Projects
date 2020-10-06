// Accepted.
// There is a same problem in leetcode.


package Toph.String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class অ্যানাগ্রাম
{
//    Runtime error on lasat test.
    /*public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder(input.nextLine()), sb2 = new StringBuilder(input.nextLine());
        if (sb1.length() != sb2.length())
            System.out.println("No");
        else
        {
            for (int i = 0; i < sb1.length(); i++)
                sb2.deleteCharAt(sb2.indexOf("" + sb1.charAt(i)));

            System.out.println(sb2.length() == 0 ? "Yes" : "No");
        }*/

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine(), b = input.nextLine();
        char[] aChar = a.toCharArray(), bChar = b.toCharArray();
        Arrays.sort(aChar);
        Arrays.sort(bChar);
        System.out.println(Arrays.equals(aChar, bChar) ? "Yes" : "No");
    }
}