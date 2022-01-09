// The greatest feature of JTabbedPaneClass is space sharing.


package com.Practice.Swing.Year2022;

import javax.swing.*;
import java.awt.*;

public class JTabbedPaneClass {
    private static JFrame frame = new JFrame("JTabbedPaneClass");
    private static Container contentPane = frame.getContentPane();

    LayoutManager layout = null;

    private static JTabbedPane tabbedPane = new JTabbedPane();

    public static void main(String[] args) {
        constructTabbedPane();
        frameSetting();
    }

    private static void constructTabbedPane() {
        JPanel generalInfoPanel = new JPanel();
        JPanel contactInfoPanel = new JPanel();

        generalInfoPanel.add(new JLabel("General Info"), BorderLayout.CENTER);
        contactInfoPanel.add(new JLabel("Contact Info"), BorderLayout.CENTER);

        tabbedPane.addTab("General Info", generalInfoPanel);
        tabbedPane.addTab("Contact Info", contactInfoPanel);

        contentPane.add(tabbedPane, BorderLayout.CENTER);

        System.out.println(contactInfoPanel.getClass());
    }

    private static void frameSetting() {
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
    }
}