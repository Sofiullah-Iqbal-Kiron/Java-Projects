package com.RA;

import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static void newLine() {System.out.println();}

    public static void main(String[] args) {
        int x, y, result, cnt = 1;
        boolean loop = true;

        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("X: ");
                x = in.nextInt();
                System.out.print("Y: ");
                y = in.nextInt();
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
