package com.Practice.SystemProcess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        systemProcess();
    }

    private static void systemProcess() {
        String msg = "";
        try {
            Process process = Runtime.getRuntime().exec("manim -pql \"C:\\Users\\Hp\\Documents\\Java Projects\\Anything\\src\\com\\Practice\\SystemProcess\\source.py\" Shape");

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while((msg = reader.readLine()) != null) {
                System.out.println(msg);
            }
            while((msg = stdError.readLine()) != null) {
                System.out.println(msg);
            }

            System.exit(0);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
