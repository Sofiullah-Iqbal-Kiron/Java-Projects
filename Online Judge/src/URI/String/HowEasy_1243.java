// Accepted at first attempt that was not expected


package URI.String;

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class HowEasy_1243 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(points(line));
        }
    }

    private static int points(String line) {
        int averageLength = averageLength(line), points = 0;
        if (averageLength <= 3) points = 250;
        else if (averageLength == 4 || averageLength == 5) points = 500;
        else if (averageLength >= 6) points = 1000;

        return points;
    }

    private static int averageLength(String line) {
        line = line.trim();
        if (line.charAt(line.length() - 1) == '.')
            line = new StringBuffer(line).deleteCharAt(line.length() - 1).toString();
        String[] pWords = line.split("\\s+");

        int sumWordsLen = 0, words = 0;
        for (String s : pWords) {
            if (isWord(s)) {
                sumWordsLen += s.length();
                words++;
            }
        }

        return words == 0 ? 0 : sumWordsLen / words;
    }

    private static boolean isWord(String word) {
        for (int i = 0; i < word.length(); i++) if (!isLetter(word.charAt(i))) return false;

        return true;
    }
}
