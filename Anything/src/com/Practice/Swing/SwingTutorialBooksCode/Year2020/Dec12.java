package com.Practice.Swing.SwingTutorialBooksCode.Year2020;

import javax.swing.*;
import java.awt.*;

/*
 * All elements in the cardPanel will be shown as stack.
 * One element at one time.
 * If the last card is showing, calling the next() method shows the first card. If the first card is showing,
   calling the previous() method shows the last card.
 */

// The cardLayout in Action.

public class Dec12
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Card Layout");

        JButton nextButton = new JButton("Next");

        JPanel cardPanel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);
        cardPanel.add(new JButton("Card 1"), "MyCard");
        cardPanel.add(new JButton("Card 2"), "MyCards");

        nextButton.addActionListener(e->{(cardLayout).next(cardPanel);});

        Container contentPane = frame.getContentPane();
        contentPane.add(nextButton, BorderLayout.SOUTH);
        contentPane.add(cardPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}