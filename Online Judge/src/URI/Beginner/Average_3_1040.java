// Accepted
// Helpful: https://github.com/ManiruzzamanAkash/URI-Online-Judge-All-Problems-Solution/blob/master/URI_1040.java


package URI.Beginner;

import java.util.Scanner;

public class Average_3_1040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float N1 = input.nextFloat(), N2 = input.nextFloat(), N3 = input.nextFloat(), N4 = input.nextFloat(), N5,
                Media, final_media;
        Media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        System.out.format("Media: %.1f\n", Media);
        if (Media >= 7.0) System.out.format("Aluno aprovado.\n");
        else if (Media >= 5.0 && Media <= 6.9) {
            System.out.format("Aluno em exame.\n");
            N5 = input.nextFloat();
            System.out.format("Nota do exame: %.1f\n", N5);
            final_media = (N5 + Media) / 2;
            if (final_media >= 5.0) System.out.format("Aluno aprovado.\n");
            else System.out.format("Aluno reprovado.\n");
            System.out.format("Media final: %.1f\n", final_media);
        }
        else if (Media < 5.0) System.out.format("Aluno reprovado.\n");
    }
}
