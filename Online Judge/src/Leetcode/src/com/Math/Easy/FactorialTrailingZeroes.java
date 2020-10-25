// -> Accepted in first term. (Not an iterative solution)
// -> I get this recursive solution from discuss but I understand the original approach and note this out in my
//    notebook.
// -> The link which gave me recursive approach: https://leetcode
//    .com/problems/factorial-trailing-zeroes/discuss/52371/My-one-line-solutions-in-3-languages
// -> Posted in twitter.
// -> Ubuntu-Link: https://pastebin.ubuntu.com/p/G8GwrdJPYR/


package com.Math.Easy;

public class FactorialTrailingZeroes
{
    public int trailingZeroes(int n)
    {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
