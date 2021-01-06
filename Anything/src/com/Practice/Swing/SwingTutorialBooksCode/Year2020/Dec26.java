package com.Practice.Swing.SwingTutorialBooksCode.Year2020;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;

// Set same model. Model will updated and same text will appears.

public class Dec26
{
    static JLabel nameLabel = new JLabel("Name: "), mirrorLabel = new JLabel("Mirror: ");
    static JTextField name = new JTextField(20), mirror = new JTextField(20);

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(2, 0));

        Document nameDoc = name.getDocument();
        mirror.setDocument(nameDoc);

        contentPane.add(nameLabel);
        contentPane.add(name);
        contentPane.add(mirrorLabel);
        contentPane.add(mirror);

        Dimension dimensionOfFrame = new Dimension(200, 300);
        frame.setSize(dimensionOfFrame);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}