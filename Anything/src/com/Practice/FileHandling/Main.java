/*
 * Java provides an API to working with files.
 */

/*
 * Using ReGex is much better than this.
 * Glob pattern or pattern for matching string literal.
 * Braces specify a collection of subpatterns: {"moon", "sun"} matches "moon" and "sun".
 * {temp*, tmp*} matches all that startsWith temp or tmp.
 * Square brackets convey a single char or a range when hyphen is used: [aeiou] matches any vowel or [a-z] matches
 * any lowercase letter.
 * Within the square bracket [*?] matches themselves.
 * Or match special char with themselves use escape char.
 * "*.html" matches all endsWith ".html".
 */


package com.Practice.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static final String RED = "\033[0;31m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) {
        w3schools();
    }

    private static void w3schools() {
        File myFile =
                new File("C:\\Users\\Hp\\Documents\\Java Projects\\Anything\\src\\com\\Practice\\FileHandling" +
                        "\\Foo.txt");
        try {
            if (myFile.createNewFile()) System.out.println("File created successfully.");

//            Writing inside the file.
            FileWriter writer = new FileWriter(myFile);
            for (int i = 0; i <= 100; i++) writer.append((i == 0 ? "" : "\n") + "Line " + i);
            writer.close();

//            Creating another file named Foo2.txt and copying contents of Foo.txt inside it.
            File myFile2 = new File("C:\\Users\\Hp\\Documents\\Java " + "Projects\\Anything\\src\\com\\Practice" +
                    "\\FileHandling" + "\\Foo2.txt");
            if (myFile2.createNewFile()) System.out.println("Another file created successfully");
            Scanner myFile2reader = new Scanner(myFile);
            FileWriter writer2 = new FileWriter(myFile2);
            while (myFile2reader.hasNextLine()) writer2.append(myFile2reader.nextLine() + " :written.\n");

            writer2.close();
            myFile2reader.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void playWithFiles() {
        Path demoFilePath = Paths.get("C:\\Users\\Hp\\Documents\\Java " + "Projects\\Anything\\src\\com\\Practice" +
                "\\FileHandling\\demoFile.txt");
        try {
            Files.delete(demoFilePath);
        }
        catch (IOException e) {
            System.err.println("No such files.");
        }
    }

    private static void basicPathTask() {
//        Converting a relative path to an absolute path.
        Path relativePath = Paths.get("Commit.txt");
        System.out.println("Absolute path of " + RED + relativePath + RESET + ": " + RED + relativePath.toAbsolutePath() + RESET);

        System.out.println(relativePath.startsWith("Commit.txt"));
    }
}
