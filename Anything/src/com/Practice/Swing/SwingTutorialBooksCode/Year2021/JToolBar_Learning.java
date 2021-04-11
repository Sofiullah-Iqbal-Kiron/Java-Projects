package com.Practice.Swing.SwingTutorialBooksCode.Year2021;

import javax.swing.*;
import java.awt.*;

public class JToolBar_Learning {
    public static final JFrame frame = new JFrame("JToolBar Demonstration");

    public static void main(String[] args) throws InterruptedException {
        Container contentPane = frame.getContentPane();

        JToolBar toolbar = new JToolBar("Bar Name", SwingConstants.HORIZONTAL);
        toolbar.setFloatable(false);
        JLabel statusLabel = new JLabel("Loading...");

//        Create some buttons for the toolbar
//        close button for toolbar
        JButton close = new JButton("Close");
        close.setMargin(new Insets(0, 0, 0, 0));
        close.setToolTipText("Close The Application");
        close.addActionListener(e -> System.exit(0));
//        save button for toolbar
        JButton save = new JButton("Save");
        save.setMargin(new Insets(0, 0, 0, 0));
        save.setToolTipText("Save Progresses");
        save.addActionListener(e -> statusLabel.setText("Saved"));

//        Add the close button to the toolbar
        toolbar.add(close);
        toolbar.add(save);

        contentPane.setLayout(new FlowLayout());
        contentPane.add(toolbar);
        contentPane.add(statusLabel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.pack();
    }
}
