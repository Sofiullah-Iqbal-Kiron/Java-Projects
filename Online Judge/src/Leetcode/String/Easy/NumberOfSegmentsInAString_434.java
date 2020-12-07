// Accepted.
// Posted in discussion.
// Posted in twitter.
// Ubuntu-Link: https://pastebin.ubuntu.com/p/g8DFgGcpbk/


package com.String.Easy;

public class NumberOfSegmentsInAString_434
{
    public int countSegments(String s)
    {
        return s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;
    }
}
