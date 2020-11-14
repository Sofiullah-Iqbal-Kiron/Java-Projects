// Many days later.
// Accepted at first attempt.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/yR78kPSdFT/


package com.Math.Easy;

public class AddDigits_258
{
    public int addDigits(int num)
    {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}
