package com.RA;

public class TimeForExecutionTheProgramInMiliSecond
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        for (int i = 1; i < 1000000; i++)
        {
            // Do nothing.
        }

        long endTime = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println("Total time that the program takes for execution: " + (endTime - startTime) + "ms");
    }
}
