// Runtime error.
// Can you debug this?


package Timus;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseRoot
{
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        ArrayList<Long> list = new ArrayList<>();
        while (input.hasNextLong())
            list.add(input.nextLong());
        input.close();

        for (int i = list.size() - 1; i >= 0; i++)
            System.out.printf("%.4f", Math.sqrt((double) list.get(i)));
    }
}
