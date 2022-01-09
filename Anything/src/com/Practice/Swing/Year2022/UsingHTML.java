/*
 * We can use direct HTML in our swing components.
 * Use HTML formatting in:- Swings button, menu items, labels, tool tips, tabbed panes, trees, tables such which use
 * labels to render text.
 * Must use in this format: <html><body></body></html>
 * */


package com.Practice.Swing.Year2022;

import javax.swing.*;
import java.awt.*;

public class UsingHTML {
    private static JFrame frame = new JFrame("Using HTML");
    private static Container contentPane = frame.getContentPane();

    private static JLabel theLabel = new JLabel("<html><body><u>The</u></body></html>");

    public static void main(String[] args) {
        theLabel.setToolTipText("Kiron");
        theLabel.setMaximumSize(new Dimension(10, 10));

        addComponentsToTheContentPane();
        frameSetting();
    }

    private static void addComponentsToTheContentPane() {
        contentPane.add(theLabel);
    }

    private static void frameSetting() {
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(50, 50);
    }
}