package com.Practice.OracleTutorial.Swing;

import javax.swing.*;
import java.awt.*;

/*
 * Editable and Uneditable combo boxes are so different.
 */

// Here is a combo box demo for pets.
public class JComboBoxLearning
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JLabel Illustration");

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        JLabel showPet = new JLabel();

//        Constructing combo box.
        String[] petString = new String[] {"Bird", "Cat", "Dog", "Rabbit", "White Tiger"};
        JComboBox<String> petComboBox = new JComboBox<>(petString);
        petComboBox.setEditable(false);
        petComboBox.setSelectedIndex(2);
        petComboBox.addActionListener(e -> {});

        Box vBox = Box.createVerticalBox();
        vBox.add(petComboBox);
        vBox.add(showPet);

        contentPane.add(vBox);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
