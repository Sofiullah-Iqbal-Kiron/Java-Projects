package com.Practice.W3Schools;

/*
 * There is a class for creating and handling files in java.io.File package.
 * We should work in a try...catch block. Sometimes it throws IOException.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling /* Creating files. */
{
    public static void main(String[] args)
    {
        try
        {
            File file =
                    new File("C:\\Users\\Hp\\Documents\\Java Projects\\Anything\\src\\com\\Practice\\W3Schools" +
                            "\\FileName.txt");
            if (file.createNewFile())
                System.out.println("File created as: " + file.getName());
            else
                System.out.println("File exists already.");

//            Writing some text in the file.
            FileWriter fileWriter = new FileWriter("C:\\Users\\Hp\\Documents\\Java " +
                    "Projects\\Anything\\src\\com\\Practice\\W3Schools" + "\\FileName.txt");
            fileWriter.write("Some text.");
        }
        catch (IOException exception)
        {
            System.out.println("An error occurred.");
        }
    }
}
