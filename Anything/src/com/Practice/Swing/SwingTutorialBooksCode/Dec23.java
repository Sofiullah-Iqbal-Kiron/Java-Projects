package com.Practice.Swing.SwingTutorialBooksCode;

import javax.swing.*;
import java.awt.*;

public class Dec23
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JLabel Illustration");

//        Column is preferred.
        JTextField textField = new JTextField("Initial Text", 2);

        Container contentPane = frame.getContentPane();
        contentPane.add(textField);
        contentPane.setLayout(new FlowLayout());

        Dimension dimensionOfFrame = new Dimension(200, 300);
        frame.setSize(dimensionOfFrame);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
