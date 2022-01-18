package com.Practice.InternetProgramming;

import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            demonstrateInetAddress();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void demonstrateInetAddress() throws UnknownHostException {
        InetAddress add = InetAddress.getByName("www.w3schools.com");
        System.out.println(add.getHostName());
    }
}