// Accepted but not in total my regex.


package ReGex.Applications.Easy;

import java.util.Scanner;

public class AlienUsername
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = input.nextInt();
        for (int i = 0; i < n; i++)
        {
            String name = input.next();
            String regex = "[_\\.]\\d+[a-zA-Z]*_?";
            System.out.println(name.matches(regex) ? "VALID" : "INVALID");
        }
    }
}