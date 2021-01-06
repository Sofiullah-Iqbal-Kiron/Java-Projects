package com.Practice.Swing.SwingTutorialBooksCode.Year2020;

import javax.swing.*;
import java.awt.*;

public class Nov21_Main
{
    final static JFrame frame = new JFrame("Test");
    public static void main(String[] args)
    {
        Container rootPane = frame.getRootPane();
        System.out.println(rootPane);
    }
}

class Nov21_A extends Nov21_Main
{
    public static void main(String[] args)
    {
//        JButton is a JComponent only.
        JButton closeButton = new JButton("Close");

//        To add the closeButton to the contentPane of JFrames frame, get the reference of this.
        Container contentPane = frame.getContentPane();

//        Now add closeButton to the contentPane of JFrame.
        contentPane.add(closeButton); // Button gets wide to the whole contentPane.

//        Illustration issues.
        frame.setBounds(290, 290, 500, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class Nov21_B extends Nov21_Main
{
    public static void main(String[] args)
    {
//        JButton is a JComponent only.
        JButton closeButton = new JButton("Close");

//        To add the closeButton to the contentPane of JFrames frame, get the reference of this.
        Container contentPane = frame.getContentPane();

//        Now add closeButton to the contentPane of JFrame.
        contentPane.add(closeButton); // Button gets wide to the whole contentPane.
        contentPane.add(new JButton("New Button"));
        System.out.println(contentPane.getComponents().length);

//        Illustration issues.
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }
}

class Nov21_C extends Nov21_Main
{
    public static void main(String[] args)
    {
        JButton closeButton = new JButton("Close");

//        Setting the size of button by a Dimension object
        /* An object of Dimension class wraps the width and height
           (At first width then height - wh) of a component. */
        Dimension dimensionForButton = new Dimension(200, 20);
        closeButton.setSize(dimensionForButton);

        Container contentPane = frame.getContentPane();

        contentPane.add(closeButton);

        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}