package com.RA;

import java.awt.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static final String GREEN_BRIGHT = "\033[0;92m";
    public static final String BLACK = "\033[0;30m";

    public static final Scanner input = new Scanner(System.in);
    public static void newLine() {System.out.println();}

    public static void main(String[] args)
    {
        System.out.println(GREEN_BRIGHT + "GUESS THE NUMBER GAME" + BLACK);
        Random random = new Random();
        int attempt = 0;
        for (int i = 0; ; i++)
        {
            System.out.print("What is your guess from 1 - 5: ");
            int userInput = input.nextInt();
            int randNum = random.nextInt(5);
            if (userInput == randNum)
            {
                System.out.println("Correct! " + attempt + " of attempt(s).");
                break;
            }
            else
            {
                attempt++;
                System.out.println("Wrong! " + attempt + " of attempt(s).");
                newLine();
            }
        }

        System.out.println("Process Finished.");
    }
}
