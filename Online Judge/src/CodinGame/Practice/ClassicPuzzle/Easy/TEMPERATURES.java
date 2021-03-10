// 100% scored (Accepted)


package CodinGame.Practice.ClassicPuzzle.Easy;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class TEMPERATURES
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int ans = 0, diff = 5527;
        for (int i = 0; i < n; i++)
        {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if (Math.abs(t) < diff)
            {
                ans = t;
                diff = Math.abs(t);
            }
            else if (Math.abs(t) == diff)
                ans = Math.max(t, ans);
        }

        System.out.println(ans);
    }
}

// An innovative solution
class Solution
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // in a newline/enter char.

        int result = n == 0 ? 0 :
                Arrays.stream(in.nextLine().split(" ")).map(a -> Integer.parseInt(a)).sorted((a, b) -> abs(a) != abs(b) ? abs(a) - abs(b) : b - a).iterator().next();

        System.out.println(result);
    }
}
