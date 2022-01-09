/*
 * CardLayout is a StackLike layout manager.
 * CardLayout lays out the components in a container as a stack of card.
 * Only one component is visible at a time.
 */


package com.Practice.Swing.Year2022;

import javax.swing.*;
import java.awt.*;

public class CardLayoutClass {
    private static JFrame frame = new JFrame("CardLayout Practice");
    private static Container contentPane = frame.getContentPane();

    private static CardLayout layout = new CardLayout();

    private static JPanel cardPanel = new JPanel(layout);
    private static JPanel nextButtonPanel = new JPanel();
    private static JButton nextButton = new JButton("Next Card");

    private static String[] names = {"Show Kiron", "Show Nirob", "Show Musabbir", "Show Saiful", "Show Rejwan"};

    public static void main(String[] args) {
        constructCardPanel();
        nextButtonSetting();
        contentPaneSetting();
        frameSetting();
    }

    private static void constructCardPanel() {
        cardPanel.add(new JLabel(names[0]));
        cardPanel.add(new JLabel(names[1]));
        cardPanel.add(new JLabel(names[2]));
        cardPanel.add(new JLabel(names[3]));
        cardPanel.add(new JLabel(names[4]));

        cardPanel.setBackground(Color.LIGHT_GRAY);
        cardPanel.setToolTipText("This panel is showing card layout");
        cardPanel.setPreferredSize(new Dimension(200, 200));
    }

    private static void nextButtonSetting() {
        nextButton.addActionListener(e -> {
            layout.next(cardPanel);

        });
        nextButton.setToolTipText("Click to show the next label");
        nextButtonPanel.add(nextButton, BorderLayout.CENTER);
    }

    private static void contentPaneSetting() {
        contentPane.add(cardPanel, BorderLayout.CENTER);
        contentPane.add(nextButtonPanel, BorderLayout.SOUTH);
    }

    private static void frameSetting() {
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }
}
