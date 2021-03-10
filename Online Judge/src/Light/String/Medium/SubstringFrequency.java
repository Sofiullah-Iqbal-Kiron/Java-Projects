package Light.String.Medium;

import java.util.Scanner;

public class SubstringFrequency
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt(), Case = 1;
        while (T > 0)
        {
            String sMain = input.next(), sSub = input.next();
            int start = 0, end = sSub.length(), count = 0;
            while (end <= sMain.length())
            {
                if (sMain.substring(start, end).equals(sSub))
                    count++;
                start++;
                end++;
            }
            System.out.println("Case " + Case++ + ": " + count);

            T--;
        }
    }
}