// Accepted


package URI.Beginner;

import java.util.Scanner;

public class Banknotes_1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota = input.nextInt(), r100, r50, r20, r10, r5, r2, r1;
        r100 = nota / 100;
        r50 = (nota % 100) / 50;
        r20 = ((nota % 100) % 50) / 20;
        r10 = (((nota % 100) % 50) % 20) / 10;
        r5 = ((((nota % 100) % 50) % 20) % 10) / 5;
        r2 = (((((nota % 100) % 50) % 20) % 10) % 5) / 2;
        r1 = ((((((nota % 100) % 50) % 20) % 10) % 5) % 2) / 1;

        System.out.format("%d\n", nota);
        System.out.format("%d nota(s) de R$ 100,00\n", r100);
        System.out.format("%d nota(s) de R$ 50,00\n", r50);
        System.out.format("%d nota(s) de R$ 20,00\n", r20);
        System.out.format("%d nota(s) de R$ 10,00\n", r10);
        System.out.format("%d nota(s) de R$ 5,00\n", r5);
        System.out.format("%d nota(s) de R$ 2,00\n", r2);
        System.out.format("%d nota(s) de R$ 1,00\n", r1);
    }
}
