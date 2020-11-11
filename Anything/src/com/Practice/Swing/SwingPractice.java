package com.Practice.Swing;

import javax.swing.*;

public class SwingPractice
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Kiron"); //creating instance of JFrame

        JButton b = new JButton("Click Here Bro"); //creating instance of JButton
        b.setBounds(130, 100, 200, 90); //x axis, y axis, width, height

        f.add(b); // adding button in JFrame

        f.setSize(400, 500); //400 width and 500 height
        f.setLayout(null); //using no layout managers
        f.setVisible(true); //making the frame visible. Default value is false.
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
