package com.Practice.AWT;

import java.awt.*;

public class First
{
    public static void main(String[] args)
    {
//        Declaration Part
        Frame frame = new Frame("Showing Frame");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500); // frames size with width and height.

        Button button = new Button("OK");
        Label label = new Label("Put your name:");
        TextField textField = new TextField(1); // Put columns as width. Also can put prefilled text.

//        Adding section
        frame.add(button); // The button component added to this frame.
        frame.add(label);
        frame.add(textField);

        frame.setVisible(true); // Now we can see the frame as a window. Default value is false for this method.
    }
}
