// Accepted in first term.
// Posted in twitter.
// By Bit-Manipulation.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/kNSMMRPJjN/


package Leetcode.Math.Easy;

public class PowerOfTwo_231
{
    public boolean isPowerOfTwo(int n)
    {
        return n > 0 && (n & n - 1) == 0;
    }
}
