package com.Practice.Others;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher
{
    public static void main(String[] args)
    {
        try
        {
            /*Pattern pattern = Pattern.compile(".xx."); // pattern is the regex pattern for match any matcher.
            Matcher matcher = pattern.matcher("AxxB");
            System.out.println("1st point: " + matcher.matches());

            // Or we can do that as like this:
            System.out.println("2nd point: " + "AxxB".matches(".xx.")); // String.matches(regex)

            // Another process:
            System.out.println("3rd point: " + Pattern.matches(".xx.", "AxxB"));

            System.out.print("4th point: ");
            String Geeks = "Geeks", GeeksforGeeks = "GeeksforGeeks";
            Pattern pattern1 = Pattern.compile(Geeks);
            Matcher matcher1 = pattern1.matcher(GeeksforGeeks);
            System.out.print("Found Geeks is " + matcher1.find());
            System.out.print(". That is " + matcher1.group());
            System.out.print(". From " + matcher1.start());
            System.out.println(" to " + matcher1.end() + '\u22c5'); // . (Dot): \u22c5

            System.out.print("5th point(I left this regex code for Valid Number in Leetcode): ");
            String numberValidator = "[+-]?(\\d+\\.?\\d*)|(\\d*\\.?\\d+)";
            System.out.println("1.56".matches(numberValidator));

            *//* POSIX Character classes:
         * \p{Lower}: [a-z]
         * \p{Upper}: [A-Z]
         * \p{ASCII}: All ascii values
         * \p{Alpha}: [\p{Lower}\p{Upper}]
         * \p{Digit}: [0-9]
         * \p{Alnum}: [\p{Alpha}\p{Digit}]
         * \p{Punct}: !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
         * \p{Blank}: [ \t]
         * \p{Space}: [ \t\n\x0B\f\r]
         *//*

            System.out.println("1".matches("\\p{Digit}"));
            System.out.println("A".matches("\\p{Upper}"));
            System.out.println("A".matches("\\p{Alpha}"));*/

            /*String text = "geeksforgeeks";
            String regex = "^geeks";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(text);
            System.out.println(m.find());*/

            /*Pattern p = Pattern.compile("[\\s]");
            Matcher m = p.matcher("I am      kiron");
            System.out.println(m.replaceAll(""));

            Matcher m1 = Pattern.compile("e").matcher("geeksforgeeks");
            int counter = 0;
            while (m1.find())
                counter++;
            System.out.println(counter);

            // Or, we can rewrite this code in this way:
            System.out.println(Pattern.compile("e").matcher("geeksforgeeks").replaceAll("a"));*/

            // Print first letter of each words from a text.
            /*Matcher m = Pattern.compile("\\b[\\p{Alpha}]").matcher("I Am Kiron");
            System.out.println(m.group());*/

            // System.out.println(Pattern.compile("dog").matcher("I found a doggie on roadside.").find());

            String beforeBackreference = "<\\s*([a-zA-Z0-9]+)(\\s+.*)?>.*</\\s*\\1\\s*>";
            Pattern p = Pattern.compile(beforeBackreference);
        }

        finally
        {
            System.out.println("Process finished.");
        }
    }
}
