// Test case passed.


package Toph.String.Passwords;

import java.util.Scanner;

public class Passwords_ByInnerBoolean
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while (input.hasNext())
        {
            String s = input.next();
            if (s.length() < 3)
                System.out.println(0);
            else
            {
                int counter = 0;
                boolean oneDigit = false, oneUpper = false, oneLower = false;
                for (int i = 0; i < s.length(); i++)
                {
                    if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                        oneDigit = true;
                    else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                        oneUpper = true;
                    else if (s.charAt((i)) >= 'a' && s.charAt(i) <= 'z')
                        oneLower = true;

                    if (oneDigit && oneUpper && oneLower)
                    {
                        counter++;
                        oneDigit = oneUpper = oneLower = false;
                    }
                }

                System.out.println(counter);
            }
        }
    }
}
