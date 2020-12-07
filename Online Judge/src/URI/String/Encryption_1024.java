package URI.String;

import java.util.Scanner;

public class Encryption_1024
{
    private static int TestCase;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        TestCase = input.nextInt();
        while (TestCase-- > 0)
        {
            String inputS = input.nextLine();
            StringBuilder outputS = new StringBuilder();
            for (int i = 0; i < inputS.length(); i++)
            {
                if (Character.isLetter(inputS.charAt(i)))
                    outputS.insert(0, inputS.charAt(i) + 3);
            }
            int halfPosition = (int) Math.ceil(outputS.length() / 2.0);
            for (int i = halfPosition; i < outputS.length(); i++)
                outputS.setCharAt(i, (char) (outputS.charAt(i) - 1));

            System.out.println(outputS);
        }
    }
}
