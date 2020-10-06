package com.RA;

import java.io.IOException;

public class ShoutDownPC
{
    public static void main(String[] args) throws IOException
    {
        Runtime.getRuntime().exec("shutdown -s -t 1000"); // 1000 milliSecond?
    }
}
