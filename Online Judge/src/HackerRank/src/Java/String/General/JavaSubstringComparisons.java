// Accepted.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/XtXFCh9YFH/

package Java.String.General;

import java.util.Scanner;

public class JavaSubstringComparisons
{
    public static String getSmallestAndLargest(String s, int k)
    {
        String smallest = s.substring(0, k);
        String largest = "";
        int start = 0, end = k;

        while (end <= s.length())
        {
            if (s.substring(start, end).compareTo(smallest) < 0)
                smallest = s.substring(start, end);
            else if (s.substring(start, end).compareTo(largest) > 0)
                largest = s.substring(start, end);
            start++;
            end++;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
