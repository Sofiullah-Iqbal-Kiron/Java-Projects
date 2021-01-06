package com.Practice.Swing.SwingTutorialBooksCode.Year2020;

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

/*
 * Window is a top level container without any border and menubar.
 * Window must a frame / dialog / another window as its owner when it will constructed.
 * Default layout: BorderLayout.*/
class WindowClassPractice
{
    private static JFrame frame = new JFrame("Window Practice");
    static Window window = new Window(frame); // frame is the owner of this window.
    public static void main(String[] args)
    {
        window.setBackground(new Color(0, 255, 0));
        window.setVisible(true);
        window.toFront();
        window.addNotify();
        System.out.println(window.getBackground());

//        frame buddies.
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null); // It will align the component at the center of current screen.
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class Create_A_New_JFrame_By_A_JButton
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("First Frame");
        JButton Switch = new JButton("Switch");
        Switch.addActionListener(e -> {
            JFrame frame1 = new JFrame("Second Frame");
            frame1.setVisible(true);
            frame1.setLocationRelativeTo(null);
            frame1.setSize(new Dimension(500, 500));
            frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        });

//        frame body.
        frame.add(Switch);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}