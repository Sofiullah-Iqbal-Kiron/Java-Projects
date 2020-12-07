package com.RA;

/*
 * Delay program execution by Thread.sleep() method.
 * 1000 millis = 1 sec.
 */

public class Sleep
{
    public static void main(String[] args) throws InterruptedException
    {
        String myName = "Sofiullah Iqbal Kiron";
        printSmoothly(myName);
    }

    public static void printSmoothly(String string) throws InterruptedException
    {
        for (int i = 0; i < string.length(); i++)
        {
            System.out.format("%c", string.charAt(i));
            Thread.sleep(200);
        }
        System.out.println();
    }
}
