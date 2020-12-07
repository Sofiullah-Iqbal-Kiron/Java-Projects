/* Author: Sofiullah Iqbal Kiron
 * CSE, BSMRSTU, SHIICT */

// Accepted at fourth.
// MaximumRepeatingSubstring problem from elementary math.
// Not totally my concept.
// Get helped form youtube elementary math tutotial.
// Posted in twitter.
// This is my 84 no. solve in leetcode.
// Passed total 38 test cases.
// Ubuntu-LinK: https://pastebin.ubuntu.com/p/yWbFDGWSfW/


package Leetcode.Math.Medium;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal_166
{
    public String fractionToDecimal(int numerator, int denominator)
    {
        if (numerator == 0)
            return "0";
        StringBuilder ans = new StringBuilder();


//        Detect sign and append.
        ans.append((numerator < 0 ^ denominator < 0) ? "-" : "");

//        Convert into long and remove signs.
        long nume = Math.abs((long) numerator);
        long deno = Math.abs((long) denominator);

//        Care about original int part.
        ans.append(nume / deno);
        nume %= deno;
        nume *= 10;

//        Till nume exist?
        if (nume > 0)
        {
            ans.append(".");
            Map<Long, Integer> recur = new HashMap<>();
            long cur;

            while (nume > 0)
            {
                cur = nume / deno;
                if (!recur.containsKey(nume))
                {
                    recur.put(nume, ans.length());
                    ans.append(cur);
                }
                else
                {
                    int index = recur.get(nume);
                    ans.insert(index, '(');
                    ans.append(')');
                    break;
                }

                nume %= deno;
                nume *= 10;
            }
        }

        return ans.toString();
    }
}