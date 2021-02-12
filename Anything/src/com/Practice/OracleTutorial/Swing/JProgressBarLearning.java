package com.Practice.OracleTutorial.Swing;

import javax.swing.*;
import java.awt.*;

public class JProgressBarLearning
{
    private static JFrame frame = new JFrame("Password");

    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(frame);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        JProgressBar progressBar = new JProgressBar();

        Container contentPane = frame.getContentPane();

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
