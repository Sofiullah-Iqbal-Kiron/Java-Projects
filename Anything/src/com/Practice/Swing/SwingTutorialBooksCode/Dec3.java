package com.Practice.Swing.SwingTutorialBooksCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * MouseEvent checking.
 * MouseEvent does not support lambda ex. Because of multiple methods are exists in here.
 */
public class Dec3
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("MouseEvent Checking");
        frame.setBounds(300, 300, 200, 300);
        frame.setLayout(new FlowLayout());

        MyMouseEventHandler myMouseEventHandler = new MyMouseEventHandler();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MyMouseEventHandler implements MouseListener
{
    @Override
    public void mouseClicked(MouseEvent e)
    {

    }
    @Override
    public void mousePressed(MouseEvent e)
    {

    }
    @Override
    public void mouseReleased(MouseEvent e)
    {

    }
    @Override
    public void mouseEntered(MouseEvent e)
    {

    }
    @Override
    public void mouseExited(MouseEvent e)
    {

    }
}
