// Accepted.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/MVmDVMVYMW/


package com.String.Medium;

public class Find_Kth_Bit_in_Nth_BinaryString_1545
{
    public char findKthBit(int n, int k)
    {
        String[] s = new String[n];
        s[0] = "0";
        for (int i = 1; i < n; i++)
            s[i] = s[i - 1] + "1" + reverse(invert(s[i - 1]));

        return s[n - 1].charAt(k - 1);
    }

    private String reverse(String s)
    {
        return new StringBuffer(s).reverse().toString();
    }

    private String invert(String s)
    {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++)
            sb.append(s.charAt(i) == '0' ? '1' : '0');

        return sb.toString();
    }
}
