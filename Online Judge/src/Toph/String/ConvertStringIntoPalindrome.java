package Toph.String;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ConvertStringIntoPalindrome
{
    private static final Scanner input;
    public static final char COLON;
    public static final char SINGLE_SPACE;

    static
    {
        input = new Scanner(System.in);
        COLON = '\u003A';
        SINGLE_SPACE = '\u0020';
    }

    public static void main(String[] args)
    {
        int T = input.nextInt();
        for (int loop = 1; loop <= T; loop++)
        {
            String s = input.next();
            if (s.equals(new StringBuffer(s).reverse().toString()))
                System.out.println("Case " + loop + COLON + SINGLE_SPACE + 0);
            else if (allDifferent(s))
                System.out.println("Case " + loop + COLON + SINGLE_SPACE + (s.length() - 1));
            else
            {
                int virtualLength1 = minimumCost(s), virtualLength2 =
                        minimumCost(new StringBuffer(s).reverse().toString());

                System.out.println("Case " + loop + COLON + SINGLE_SPACE + (s.length() - Math.max(virtualLength1,
                        virtualLength2)));
            }
        }
    }

    private static boolean allDifferent(String s)
    {
        Set<Character> characterSet = new TreeSet<>();
        for (int i = 0; i < s.length(); i++)
            characterSet.add(s.charAt(i));

        return characterSet.size() == s.length();
    }

    private static int minimumCost(String s)
    {
        var current = 0;
        int lastBoundary = s.length(), virtualLength = 0;
        while (current < lastBoundary)
        {
            if (current == lastBoundary - 1)
                virtualLength += 1;
            else if (indexOfMirrorChar(s, s.charAt(current), current + 1, lastBoundary - 1) != -1)
            {
                virtualLength += 2;
                lastBoundary = indexOfMirrorChar(s, s.charAt(current), current + 1, lastBoundary - 1);
            }

            current++;
        }

        return virtualLength;
    }

    private static int indexOfMirrorChar(String s, char ch, int tillPoint, int endingStart)
    {
        for (int i = endingStart; i >= tillPoint; i--)
        {
            if (s.charAt(i) == ch)
                return i;
        }

        return -1;
    }
}
