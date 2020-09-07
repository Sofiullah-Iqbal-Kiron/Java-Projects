// Accepted.

package com.HackerRank.ExceptionHandling;

import java.util.Scanner;

public class JavaExceptionHandling_Try_catch
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in))
        {
            System.out.println(input.nextInt() / input.nextInt());
        }
        catch (ArithmeticException am)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch (Exception e)
        {
            System.out.println(e.getClass().getName());
        }
    }
}
