// Time limit exceeded. There is no way without bitwise operator.

// Accepted but not my concept. Get long help from discuss.
// Posted in twitter.


package Math.Medium;

public class DivideTwoIntegers_29
{
    public static int divide(int dividend, int divisor)
    {
//        Caught the sign.
        int sign = dividend < 0 ^ divisor < 0 ? -1 : 1;

//        Special cases.
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        if (dividend == 0)
            return 0;

//        Update the values.
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

//        Main portion.
        int ans = 0;
        while (dvs <= dvd)
        {
            long temp = dvs, c = 1;
            while (temp << 1 <= dvd)
            {
                temp <<= 1;
                c <<= 1;
            }
            dvd -= temp;
            ans += c;
        }

        return ans * sign;
    }
}
