package UVa;

import java.math.BigInteger;
import java.util.Scanner;

class SimplyEmirp_10235
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        while (input.hasNext())
        {
            int number = input.nextInt();
            BigInteger Bnumber = BigInteger.valueOf(number);
            String S = new StringBuffer(Bnumber.toString()).reverse().toString();
            int Int = Integer.parseInt(S);
            BigInteger revNumber = BigInteger.valueOf(Int);

            System.out.printf("%d is ", number);
            if (!Bnumber.isProbablePrime(10)) // Check is not prime.
                System.out.println("not prime.");
            else if (number != Int & revNumber.isProbablePrime(10)) // Checking for emirp.
                System.out.println("emirp.");
            else
                System.out.println("prime.");
        }
    }
}
