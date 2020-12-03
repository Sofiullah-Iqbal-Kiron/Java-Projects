package com.Practice.Swing.SwingTutorialBooksCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * A class for event handling.
 */
public class Dec2 extends JFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Close Application");
        frame.setSize(200, 300);
        frame.setLayout(new FlowLayout());

//        When the button will pressed, application will closed.
        JButton closeButton = new JButton("Close App");
        /*closeButton.addActionListener(e -> {
            JTextField field = new JTextField("Write Down Here");
            frame.add(field);
        });*/
        MyActionListener myActionListener = new MyActionListener();
        closeButton.addActionListener(myActionListener);

        frame.add(closeButton);
        frame.getContentPane().add(closeButton);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class MyActionListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
}

class Dec2_B
{
    private static int counter = 0;
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Button clicked counter");
        frame.setBounds(250, 300, 200, 300);
        frame.setLayout(new FlowLayout());

        JButton increaseButton = new JButton("Clicked " + counter + " time");
        increaseButton.addActionListener(e -> {
            counter++;
            if (counter < 11)
                increaseButton.setText("Clicked #" + counter + " " + (counter < 2 ? "time" : "times"));
            else
                increaseButton.setText("You can not click that button up to 10 times.");
        });

        frame.getContentPane().add(increaseButton);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

class Dec2_C extends JFrame
{
    JButton button = new JButton("Showing...");
    public Dec2_C()
    {
        super("Show/Hide button");
        this.init();
    }

    public void init()
    {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button.addActionListener(e -> {
            button.setText(button.getText().equals("Showing...") ? "Hiding..." : "Showing...");
        });
        this.getContentPane().add(button);
        this.setVisible(true);
        this.pack();
    }

    public static void main(String[] args)
    {
        Dec2_C obj = new Dec2_C();
    }
}