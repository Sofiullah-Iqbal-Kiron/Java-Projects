// Test case passed.


package Toph.String.Passwords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passwords_ByOuterReGexMethod
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
                int start = 0, end = 3, counter = 0;
                while (end <= s.length())
                {
                    if (satisfied(s.substring(start, end)))
                    {
                        counter++;
                        start = end;
                        end += 3;
                    }
                    else
                        end++;
                }

                System.out.println(counter);
            }
        }
    }

    private static boolean satisfied(String substring)
    {
        Pattern p1 = Pattern.compile("\\P{Lower}"), p2 = Pattern.compile("\\p{Upper}"), p3 = Pattern.compile("\\p" +
                "{Digit}");
        Matcher m1 = p1.matcher(substring), m2 = p2.matcher(substring), m3 = p3.matcher(substring);

        return m1.find() && m2.find() && m3.find();
    }
}
