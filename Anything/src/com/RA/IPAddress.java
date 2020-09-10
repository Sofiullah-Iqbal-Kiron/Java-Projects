package com.RA;

import java.net.InetAddress;

public class IPAddress
{
    public static final String RED = "\033[0;31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) throws Exception
    {
        InetAddress myIP = InetAddress.getLocalHost();
        System.out.print(myIP.getHostAddress() + " is my IP address");
        System.out.println(" and " + RED + myIP.getHostName() + RESET + " is my PC.");
    }
}
