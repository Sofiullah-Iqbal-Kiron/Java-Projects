// Code for Nahidul Islam Sakin
// Author: Sofiullah Iqbal Kiron
// Timestamp: 9:03 AM, 23 March-2021
// Status: Accepted in first attempt


package Toph;

import java.util.Scanner;

public class IncompatibleCrops {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        Declaring Variables
        int R = input.nextInt(), C = input.nextInt(), counter = 0;
        char[][] field = new char[R][C];
        String curLine;

//        Input Section
        for (int i = 0; i < R; i++) {
            curLine = input.next().trim();
            for (int j = 0; j < C; j++) field[i][j] = curLine.charAt(j);
        }

//        Performing Task
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++) if (field[i][j] != '*' && isCompatible(field, i, j, R, C)) counter++;

//        Console Output
        System.out.println(counter);
    }

    private static boolean isCompatible(char[][] field, int currentR, int currentC, int R, int C) {
        if (currentR - 1 >= 0 && field[currentR - 1][currentC] == '*') return false;
        if (currentR + 1 < R && field[currentR + 1][currentC] == '*') return false;
        if (currentC - 1 >= 0 && field[currentR][currentC - 1] == '*') return false;
        if (currentC + 1 < C && field[currentR][currentC + 1] == '*') return false;

        return true;
    }
}
