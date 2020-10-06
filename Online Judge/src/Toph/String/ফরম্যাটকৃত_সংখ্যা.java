// Accepted.
// This file won't run in this Bangla class name.


package Toph.String;

import java.util.Scanner;

public class ফরম্যাটকৃত_সংখ্যা
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(input.nextLine());
        sb = sb.reverse();
        for (int i = 3; i <= sb.length(); i += 3)
        {
            sb.insert(i, ',');
            i++;
        }
        if (sb.charAt(0) == ',')
            sb.deleteCharAt(0);
        if (sb.charAt(sb.length() - 1) == ',')
            sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb.reverse());
    }
}
