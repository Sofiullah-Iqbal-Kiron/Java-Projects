package com.Practice.OracleTutorial.AWT;

import javax.swing.*;
import java.awt.Font;
import java.awt.Container;

/*
 * Glyph: shape used to render a character or a sequence of characters.
 * A font encapsulates the collection of glyphs needed to render a selected set of characters.h
 */

public class FontClass
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Path Fixer");

//        LookAndFeel.
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(frame);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        JLabel fontTest1 = new JLabel("fontTest1"), fontTest2 = new JLabel("fontTest2"), fontTest3 = new JLabel(
                "fontTest3");

        Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 20);

        fontTest1.setFont(font1);

        Box vBox = Box.createVerticalBox();
        vBox.add(fontTest1);
        vBox.add(fontTest2);
        vBox.add(fontTest3);

        Container contentPane = frame.getContentPane();
        contentPane.add(vBox);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}