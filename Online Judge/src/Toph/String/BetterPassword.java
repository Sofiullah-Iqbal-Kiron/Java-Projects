// Accepted on first term.


package Toph.String;

import java.util.Scanner;

public class BetterPassword
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = (input.next().replace('i', '!')).replace('s', '$').replace("o", "()");
        System.out.println(("" + s.charAt(0)).toUpperCase() + s.substring(1) + '\u002E');
    }
}
