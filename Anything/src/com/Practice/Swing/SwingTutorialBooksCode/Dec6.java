package com.Practice.Swing.SwingTutorialBooksCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Use relative adapter class if you do not want to implement all the methods in interface.
 */

public class Dec6
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton mouse = new JButton("North");
        mouse.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                super.mousePressed(e);
                mouse.setText("MouseAdapter");
            }
        });

        Container contentPane = frame.getContentPane();
        contentPane.add(mouse);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
