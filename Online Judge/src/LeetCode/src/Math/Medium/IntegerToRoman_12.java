// Accepted in first term. (80% my concept)
// Posted in twitter.


package Math.Medium;

import java.util.Scanner;

public class IntegerToRoman_12
{
    public static final int[] romanNumber = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    public static final String[] romanChar = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public static void main(String[] args)
    {
        try
        {
            while (true)
                System.out.println(intToRoman(new Scanner(System.in).nextInt()));
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Good Bye");
        }
    }

    public static String intToRoman(int num)
    {
        String ans = "";
        int i = romanNumber.length - 1;
        while (i > -1 && num > 0)
        {
            while (num > 0 && (num % romanNumber[i] < num || i == 0))
            {
                ans += (romanChar[i]);
                num -= romanNumber[i];
            }

            i--;
        }

        return ans;
    }
}