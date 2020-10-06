package Toph.String;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheHiddenIsland
{
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        String test = input.next(); // Is it nextLine()?
        int T = Integer.parseInt(test);
        while (T-- > 0)
        {
            String s = input.next();
            int k = input.nextInt();
            String ks = sortedString(input.next());

            int firstLength = (k - QCount(s)) + 1;
            String putAtFirst = ks.substring(0, firstLength);

            Pattern p = Pattern.compile("(\\?)");
            Matcher m = p.matcher(s);
            int firstQ = 0;
            if (m.find())
                firstQ = m.start();

            StringBuilder sb = new StringBuilder(s);
            sb.replace(firstQ, firstQ + 1, putAtFirst);


            for (int i = firstQ; i < sb.length(); i++)
            {
                if (sb.charAt(i) == '?')
                    sb.replace(i, i + 1, "" + ks.charAt(firstLength++));
            }

            System.out.println(sb);
        }
    }

    private static int QCount(String s)
    {
        Pattern p = Pattern.compile("(\\?)");
        Matcher m = p.matcher(s);
        int c = 0;
        while (m.find())
            c++;

        return c;
    }

    private static String sortedString(String s)
    {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String string = "";
        for (char c : charArray)
            string += c;

        return string;
    }
}
