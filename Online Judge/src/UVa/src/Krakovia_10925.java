// First accepted UVa problem with Java.
// Accepted in 4'th term.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/HQy7NW2nRB/

import java.math.BigInteger;
import java.util.Scanner;

public class Krakovia_10925
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int caseNo = 1;
        while (true)
        {
            int N, F;
            BigInteger sum, value;
            sum = BigInteger.ZERO;
            N = input.nextInt();
            F = input.nextInt();
            if (N == 0 && F == 0)
                break;

            for (int i = 0; i < N; i++)
            {
                value = input.nextBigInteger();
                sum = sum.add(value);
            }

            System.out.println("Bill #" + (caseNo++) + " costs " + sum + ": each friend should pay " + sum.divide(BigInteger.valueOf(F)) + '\n');
        }
    }
}
