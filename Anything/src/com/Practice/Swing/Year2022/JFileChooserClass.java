/*
 * J****Chooser: File, Color
 * JFileChooser is a class that provides a mechanism to choose a file with a pop-up file-chooser dialog.
 * JFileChooser lets the user choose a file from OS's file system.
 * An object of JFileChooser instance remembers the last visited directory.
 * JFileChooser class provides mostly non-static methods.
 * public File getSelectedFile();
 */


package com.Practice.Swing.Year2022;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class JFileChooserClass {
    private static JFrame frame = new JFrame("JFileChooserClass");
    private static Container contentPane = frame.getContentPane();

    private static JFileChooser fileChooser = new JFileChooser("C:\\Users\\Hp\\Documents\\Java Projects");

    public static void main(String[] args) {
        contentPaneSetting();
        frameSetting();
    }

    private static void contentPaneSetting() {
        contentPane.add(fileChooser);
        File myFile=fileChooser.getSelectedFile();
    }

    private static void frameSetting() {
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }
}
