package com.Practice.OracleTutorial.Swing;

import javax.swing.*;
import java.awt.*;

/*
 * An implementation of two state button.
 * A subclass of AbstractButton.
 * Make them mutually exclusive is good practice.
 */

public class JToggleButtonLearning
{
    public static void main(String[] args)
    {
        JToggleButton One = new JToggleButton("One", true);
        JToggleButton Two = new JToggleButton("Two");
        JToggleButton Three = new JToggleButton("Three");

        JLabel numberLabel = new JLabel("One");

        One.addActionListener(e -> numberLabel.setText("One"));
        Two.addActionListener(e -> numberLabel.setText("Two"));
        Three.addActionListener(e -> numberLabel.setText("Three"));

        ButtonGroup toggleGroup = new ButtonGroup();
        toggleGroup.add(One);
        toggleGroup.add(Two);
        toggleGroup.add(Three);

        Box vBox = Box.createVerticalBox();
        vBox.add(One);
        vBox.add(Two);
        vBox.add(Three);

        JFrame frame = new JFrame("JLabel Illustration");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(vBox);
        contentPane.add(numberLabel);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
