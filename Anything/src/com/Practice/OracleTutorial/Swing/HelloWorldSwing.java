package com.Practice.OracleTutorial.Swing;

import javax.swing.*;

public class HelloWorldSwing
{
    private static void createAndShowGUI()
    {
//        Create and setup the window.
        JFrame jFrame = new JFrame("HelloWorld");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Hello World");
        jFrame.getContentPane().add(jLabel);

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
}
