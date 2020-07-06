// Accepted in 2'nd submission.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/PSYPGQhQhw/

package com.JulyLeetCodingChallenge;

import java.util.ArrayList;

public class PlusOne
{
    public int[] plusOne(int[] digits)
    {
        int i, carry = 1;

        ArrayList<Integer> Digit = new ArrayList<Integer>(digits.length);

        for (i = digits.length - 1; i >= 0; i--)
        {
            if (digits[i] == 9)
            {
                Digit.add(0, 0);
            }
            else
            {
                Digit.add(0, digits[i] + 1);
                for (int j = i - 1; j >= 0; j--)
                {
                    Digit.add(0, digits[j]);
                }
                carry = 0;
                break;
            }
        }

        if (carry == 1)
            Digit.add(0, 1);

        int[] temp = new int[Digit.size()];
        for (i = 0; i < Digit.size(); i++)
        {
            temp[i] = Digit.get(i);
        }

        return temp;
    }

//    ServerCode
    /*class Solution
    {
        public int[] plusOne(int[] digits)
        {

            ArrayList<Integer> plusOne = new ArrayList<Integer>();
            int carry = 1;
            for (int i = digits.length - 1; i >= 0; i--)
            {
                int sum = digits[i] + carry;
                int diff = sum - 10;
                carry = diff < 0 ? 0 : 1;
                plusOne.add(carry == 0 ? sum : diff);
            }
            if (carry == 1)
                plusOne.add(carry);

            int[] arr = new int[plusOne.size()];
            for (int i = plusOne.size() - 1; i >= 0; i--)
            {
                arr[plusOne.size() - 1 - i] = plusOne.get(i);
            }

            return arr;
        }
    }*/
}
