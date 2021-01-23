// A path fixer for windows OS.


package com.RA;

import java.util.Scanner;

public class PathFixer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        System.out.println("\"" + fixedPath(path) + "\"");
    }

    private static String fixedPath(String path)
    {
        String ans = "";
        for (int i = 0; i < path.length(); i++)
        {
            if (path.charAt(i) == '\\')
                ans += '\\';
            ans += path.charAt(i);
        }

        return ans;
    }
}
