package URI.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Encryption_1024
{
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter output = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException
    {
        int testCases = input.read();
        while (testCases > 0)
        {
            String inputS = input.readLine(), outputS = "";
            for (int i = 0; i < inputS.length(); i++)
            {
                if (Character.isLetter(inputS.charAt(i)))
                    outputS += (char) (inputS.charAt(i) + 3);
                else
                    outputS += inputS.charAt(i);
            }

            System.out.println(outputS);
            testCases--;
        }
    }

    private String sortedString(String myString)
    {
        char[] myCharString = myString.toCharArray();
        Arrays.sort(myCharString);
        return myCharString.toString();
    }
}