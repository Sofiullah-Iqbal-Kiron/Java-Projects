package com.Practice.OracleTutorial;

import java.util.Arrays;

/**
 * Arrays class is a member of the java Collections Framework.
 * We can initialize Array like: int anArray[]; This is not convention.
 */

public class ArrayCopyDemo
{
    public static void main(String[] args)
    {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];

//        subsequence:অনুচ্ছেদ
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(copyTo);

//        Another Process.
        copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(copyTo);

        java.util.Arrays.parallelSort(copyFrom);
        System.out.println(copyFrom);
//        Printing elements by stream forEach.
        Arrays.stream(new int[] {1, 2, 3}).forEach(n -> System.out.print(n + " "));
    }
}
