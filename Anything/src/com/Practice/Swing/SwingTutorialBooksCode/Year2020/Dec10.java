package com.Practice.Swing.SwingTutorialBooksCode.Year2020;

import javax.swing.*;
import java.awt.*;

/*
 * Keyboard Mnemonic:
 * Today we gonna talk about, keyboard mnemonic or keyboard shortcut key combination.
 * Usually it is, modifier key + mnemonic key.
 * Modifier key is platform dependent. Fot now, alt is the modifier key at windows.
 * When we make mnemonic combination from our keyboard, Action command will be invoked.
 * Case-insensitive.
 * Or we can use awt.KeyEvent class for further more complex.
 */

public class Dec10
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        Container contentPane = frame.getContentPane();

        JButton close = new JButton("Close");
        close.addActionListener(e -> {System.exit(0);});
        close.setMnemonic('C');

        contentPane.add(close);
        frame.pack();
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

/*
 * BorderLayout:
 * BorderLayout has five border side alignment system.
 * Not orientation dependent:
 */

class Dec10_B
{
    private static String[] buttonDescriptionForPanelToNorth = {"One", "Two", "Three", "Four", "Five"};

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        LayoutManager borderLayout = new BorderLayout();

        /*
         * Creating a JPanel then add this to the NorthSide of the contentPane.
         * Default layout of JPanel: FlowLayout.
         */
        JPanel panelToNorth = new JPanel();
        panelToNorth.setBackground(Color.gray);

//        Adding button to the panelToNorth by a loop.
        for (String description : buttonDescriptionForPanelToNorth)
            panelToNorth.add(new JButton(description));

        JPanel panelToSouth = new JPanel();
        panelToSouth.setLayout(new BorderLayout());
        panelToSouth.add(new JButton("North"), BorderLayout.NORTH);
        panelToSouth.add(new JButton("South"), BorderLayout.SOUTH);
        panelToSouth.add(new JButton("Center"), BorderLayout.CENTER);
        panelToSouth.add(new JButton("East"), BorderLayout.EAST);
        panelToSouth.add(new JButton("West"), BorderLayout.WEST);

        Container contentPane = frame.getContentPane();
        contentPane.add(panelToNorth, BorderLayout.NORTH);
        contentPane.add(panelToSouth, BorderLayout.SOUTH);
        contentPane.add(new JButton("Center"), BorderLayout.CENTER);
        contentPane.add(new JButton("East"), BorderLayout.EAST);
        contentPane.add(new JButton("West"), BorderLayout.WEST);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

/*
 * CardLayout:
 * CardLayout is same as stack data structure.
 * Only top leveled component will be visible.
 * We need to give a unique name to every card.
 */

class Dec10_C
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        JPanel cardPanel = new JPanel();
        LayoutManager cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);
        cardPanel.add(new JButton("Card One"),"MyCard");

        Container contentPane = frame.getContentPane();
        contentPane.add(cardPanel);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}