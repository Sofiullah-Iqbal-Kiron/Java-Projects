package com.Practice.Swing.SwingTutorialBooksCode;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

/*
 * LayoutManagers for Container type Component.
 */

public class Nov26
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Nov 26");
//        Setting up the layout manager of frame container.
        frame.setLayout(new FlowLayout()); // Class FlowLayout implements LayoutManager
        JButton closeButton = new JButton("Close");

        Container contentPane = frame.getContentPane();

        contentPane.add(closeButton);
        contentPane.add(new JButton("Help"));
//        Setting the orientation of all the components of contentPane: Right to Left.
        contentPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        System.out.println(contentPane.getComponents().length);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }
}

class Nov26_A
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Nov 26 A");
        int horizontalGap = 10, verticalGap = 20;
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEADING, horizontalGap, verticalGap);
        frame.setLayout(flowLayout);
        JButton closeButton = new JButton("Close");

        Container contentPane = frame.getContentPane();
        contentPane.add(closeButton);
        contentPane.add(new JButton("Help"));
//        Adding more buttons by a loop.
        for (int i = 1; i <= 20; i++)
            contentPane.add(new JButton("Button" + i));

        contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        System.out.println(contentPane.getComponents().length);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }
}

/* I would like to finish the discussion about FlowLayout with a note that it has very limited use
in a real world applications because of the limitations discussed in this section.
It is typically used for prototyping. */

// BorderLayout illustration
class Nov26_B
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Nov 26 B");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        Setting up BorderLayout to the frame.
        JButton jButton = new JButton("North");
        frame.add(jButton, BorderLayout.NORTH);
        jButton = new JButton("South");
        frame.add(jButton, BorderLayout.SOUTH);
        jButton = new JButton("West");
        frame.add(jButton, BorderLayout.WEST);
        jButton = new JButton("East");
        frame.add(jButton, BorderLayout.EAST);
        jButton = new JButton("Center");
        frame.add(jButton);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
    }
}