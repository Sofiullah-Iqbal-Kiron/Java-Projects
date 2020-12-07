package com.Practice.Swing.SwingTutorialBooksCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Dec4
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton mouse = new JButton("North");
        mouse.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                mouse.setText("Clicked by mouse");
            }
            @Override
            public void mousePressed(MouseEvent e)
            {
                mouse.setText("Mouse pressed here");
            }
            @Override
            public void mouseReleased(MouseEvent e)
            {
                mouse.setText("Mouse released");
            }
            @Override
            public void mouseEntered(MouseEvent e)
            {
                mouse.setText("Entered in the component area");
            }
            @Override
            public void mouseExited(MouseEvent e)
            {
                mouse.setText("North");
            }
        });

        frame.getContentPane().add(mouse, BorderLayout.NORTH);
        frame.getContentPane().add(new JButton("South"), BorderLayout.SOUTH);
        frame.getContentPane().add(new JButton("East"), BorderLayout.EAST);
        frame.getContentPane().add(new JButton("West"), BorderLayout.WEST);
        frame.getContentPane().add(new JButton("Center"));
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
