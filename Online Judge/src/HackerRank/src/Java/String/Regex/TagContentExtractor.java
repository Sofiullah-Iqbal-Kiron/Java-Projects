// Accepted but not in my process.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/ScHsJPHqWt/

package Java.String.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0)
        {
            String line = in.nextLine();

            Pattern p = Pattern.compile("<(.{1,})>([^<>]+)</\\1>");
            Matcher m = p.matcher(line);

            boolean founded = false;

            while (m.find())
            {
                System.out.println(m.group(2));
                founded = true;
            }

            if (!founded)
                System.out.println("None");

            testCases--;
        }
    }
}
