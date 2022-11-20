package CSES;

import java.util.Scanner;

public class Bit_Strings {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int val = input.nextInt();
        System.out.println((int) (Math.pow(2, val) % (Math.pow(10, 9) + 7)));
    }
}
