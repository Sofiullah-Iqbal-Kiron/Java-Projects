package com.Practice.Swing.SwingTutorialBooksCode;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/*
 * That's why, JButton inherited from Container class. It acts like a container.
 */

public class Dec7
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("No TITLE");
        JButton containerButton = new JButton("Container Button");
        containerButton.setLayout(new FlowLayout());
        containerButton.add(new JButton("Child"));
        containerButton.add(new JButton("SChild"));

        frame.add(containerButton);
        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

// Border Practice.

/*
 * Border is a interface. Use Border type objects to setBorder for any component.
 * BorderFactory class implements Border for provide built-in borders.
 */

/*
 * JPanel: is a class in javax.swing package.
 * A lightweight container with no title bar.
 * Default layout: FlowLayout.
 * Used ot organize components.
 * Has four constructors.
 */

class Dec7_B
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Using Border");
        JButton borderButton = new JButton("Border Button");
        borderButton.setBorder(BorderFactory.createBevelBorder(1));

//        Borders
        Border blackLine = BorderFactory.createLineBorder(Color.blue, 3, true);

//        Using blackLine border at a new JPanel and add this to the contentPane of the JFrame.
        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);
        panel.setBorder(blackLine);
        panel.add(borderButton);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}