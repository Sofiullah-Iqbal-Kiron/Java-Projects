package com.RA;

import java.awt.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static final Scanner input = new Scanner(System.in);
    public static void newLine() {System.out.println();}

    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.copyOfRange(arr1, 0, 2);
        System.out.println(Arrays.toString(arr2));
    }
}
