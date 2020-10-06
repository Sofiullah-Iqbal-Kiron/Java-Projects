import java.util.Scanner;

public class Solution
{
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        String s = (input.nextLine().trim()).replaceAll("\\s+", "");
        System.out.println(s);
    }
}
