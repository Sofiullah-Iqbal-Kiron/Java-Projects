// Accepted
// First tried: 15 Nov, 2019
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/r96Z4SYTQq/


package URI.Beginner;

import java.util.Scanner;

public class BanknotesAndCoins_1021 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double N = input.nextDouble();
        int intPart = (int) N, fracPart = (int) ((N - intPart) * 100);
        int[] noteUnits = {100, 50, 20, 10, 5, 2}, numberOfNotes = new int[6];

        for (int i = 0; i < 6; i++) {
            numberOfNotes[i] = intPart / noteUnits[i];
            intPart %= noteUnits[i];
        }
        System.out.println("NOTAS:");
        for (int i = 0; i < 6; i++) System.out.println(numberOfNotes[i] + " nota(s) de R$ " + noteUnits[i] + ".00");

        int[] coinUnits = {100, 50, 25, 10, 5, 1}, numberOfConis = new int[6];
        String[] originalCoinUnits = {"1.00", "0.50", "0.25", "0.10", "0.05", "0.01"};
        numberOfConis[0] = intPart;
        for (int i = 1; i < 6; i++) {
            numberOfConis[i] = fracPart / coinUnits[i];
            fracPart %= coinUnits[i];
        }
        System.out.println("MOEDAS:");
        for (int i = 0; i < 6; i++) System.out.println(numberOfConis[i] + " moeda(s) de R$ " + originalCoinUnits[i]);
    }
}
