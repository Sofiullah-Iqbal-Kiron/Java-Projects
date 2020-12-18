// Accepted.


package Java.String.General;

import java.util.Scanner;

public class JavaStringsIntroduction
{
    public static void main(String[] args)
    {
//        Input Section.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "YES" : "NO");
        A = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        B = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        System.out.println(A + " " + B);
    }
}
