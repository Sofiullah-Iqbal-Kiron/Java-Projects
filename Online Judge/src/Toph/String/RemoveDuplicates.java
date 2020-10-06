// Passes test case.


package Toph.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicates
{
    private static final Scanner input;
    public static final char HASH_TAG;
    public static final char COLON;

    static
    {
        input = new Scanner(System.in);
        HASH_TAG = '\u0023';
        COLON = '\u003A';
    }

    public static void main(String[] args)
    {
        int T = input.nextInt();

        for (int i = 1; i <= T; i++)
        {
            String s = input.next();
            Map<Character, Integer> map = new HashMap<>();

            for (int i1 = 0; i1 < s.length(); i1++)
                map.put(s.charAt(i1), map.getOrDefault(s.charAt(i1), 0) + 1);

            System.out.println("Case " + HASH_TAG + i + COLON);
            for (Map.Entry<Character, Integer> m : map.entrySet())
                System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
