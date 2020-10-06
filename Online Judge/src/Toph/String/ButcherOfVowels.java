// Test case passed.


package Toph.String;

import java.util.Scanner;

public class ButcherOfVowels
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0)
        {
            String s = input.next();
            // Cause boolean in java basically / initially assigned to false.
            //boolean evil = s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains
            // ("u");

            //System.out.println(evil ? "Yes" : "No");
            System.out.println(s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u") ? "Yes" : "No");
        }
    }
}
