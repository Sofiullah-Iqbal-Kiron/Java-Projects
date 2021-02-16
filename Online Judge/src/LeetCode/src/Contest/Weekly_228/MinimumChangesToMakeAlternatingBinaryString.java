// Accepted after a long attempt.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/qwJMZfjD8v/


package Contest.Weekly_228;

public class MinimumChangesToMakeAlternatingBinaryString
{
    public int minOperations(String s)
    {
        int i, num1 = 0, num2 = 0;
        String s1 = "0", s2 = "1";
        for (i = 1; i < s.length(); i++)
        {
            if (i % 2 == 1)
                s1 += '1';
            else
                s1 += '0';
        }
        System.out.println(s1);
        for (int j = 1; j < s.length(); j++)
        {
            if (j % 2 == 0)
                s2 += '1';
            else
                s2 += '0';
        }
        System.out.println(s2);

        for (i = 0; i < s.length(); i++)
            if (s.charAt(i) != s1.charAt(i))
                num1++;

        for (i = 0; i < s.length(); i++)
            if (s.charAt(i) != s2.charAt(i))
                num2++;

        return Math.min(num1, num2);
    }
}
