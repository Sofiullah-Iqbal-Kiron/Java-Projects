package com.Practice.Others;

/*
 * Abstract class to handle files: java.io.File.
 * Instances of this class is called file-handler because this allow developers to handle file.
 * It can instantiate any type of file like, .txt, .pdf etc.
 */

import java.io.File;
import java.util.logging.Logger;

public class FileHandlingONE
{
    public static final String RED_BOLD = "\033[1;31m";
    public static final String RESET = "\033[0m";
    public static final Logger log = Logger.getLogger("FileHandlingONE.class");

    public static void main(String[] args)
    {
        File aFile = new File("C:\\Users\\Hp\\Documents\\Java Projects\\Commit.txt");
        printFileStats(aFile);
    }

    private static void printFileStats(File f)
    {
        if (f.exists())
        {
            System.out.println(RED_BOLD + "--- FILE DETAILS ---" + RESET);
            if (f.isFile())
            System.out.println("[+] Name:- " + f.getName());
                System.out.println("[+] Type:- Text file");
        }
    }
}
